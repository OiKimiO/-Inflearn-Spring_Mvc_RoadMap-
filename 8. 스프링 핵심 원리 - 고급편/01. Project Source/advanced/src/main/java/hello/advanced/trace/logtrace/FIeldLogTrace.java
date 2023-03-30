package hello.advanced.trace.logtrace;

import hello.advanced.trace.TraceId;
import hello.advanced.trace.TraceStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
public class FIeldLogTrace implements LogTrace {

    private static final String START_PREFIX = "-->";
    private static final String COMPLETE_PREFIX = "<--";
    private static final String EX_PREFIX = "<X-";

    private TraceId traceIdHolder; // traceId 동기화, 동시성 이슈 발생

    // 트레이스 시작시 호출
    public TraceStatus begin(String message){
        syncTraceId();
        TraceId traceId = traceIdHolder;
        Long startTimeMs = System.currentTimeMillis();
        log.info("[{}] {}{}", traceId.getId(), addSpace(START_PREFIX, traceId.getLevel()),message);
        // 로그 출력
        return new TraceStatus(traceId,startTimeMs,message);
    }

    public void end(TraceStatus status){

        complete(status, null);
    }

    private void syncTraceId(){
        if(traceIdHolder == null){
            traceIdHolder = new TraceId();
        }else{
            traceIdHolder = traceIdHolder.createNextId();
        }
    }
    public void exception(TraceStatus status, Exception e){

        complete(status, e);
    }

    private void complete(TraceStatus status, Exception e) {
        Long stopMiliMs = System.currentTimeMillis();
        long resultTimeMs = stopMiliMs-status.getStartTimeMs();
        TraceId traceId = status.getTraceId();
        if(e == null){
            log.info("[{}] {}{} time={}ms", traceId.getId(), addSpace(COMPLETE_PREFIX, traceId.getLevel()),status.getMessage(), resultTimeMs);
        }else{
            log.info("[{}] {}{} time={}ms ex={}", traceId.getId(), addSpace(EX_PREFIX, traceId.getLevel()),status.getMessage(), resultTimeMs);
        }
        releaseTraceId();
    }

    private void releaseTraceId() {
        if(traceIdHolder.isFirstLevel()){
            traceIdHolder = null; // destroy
        }else{
            traceIdHolder = traceIdHolder.createPreviousId();
        }
    }

    // level = 0
    // level = 1 |-->
    // level = 2 |  |-->

    // level = 2 ex |   |<X-
    private static String addSpace(String prefix, int level) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < level; i++){
            sb.append((i == level-1) ? "|"+prefix:"|   ");
        }

        return sb.toString();
    }
}

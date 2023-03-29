package hello.advanced.trace.hellotrace;

import hello.advanced.trace.TraceId;
import hello.advanced.trace.TraceStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HelloTraceV2 {

    private static final String START_PREFIX = "-->";
    private static final String COMPLETE_PREFIX = "<--";
    private static final String EX_PREFIX = "<X-";

    // 트레이스 시작시 호출
    public TraceStatus begin(String message){
        TraceId traceId = new TraceId();
        Long startTimeMs = System.currentTimeMillis();
        log.info("[{}] {}{}", traceId.getId(), addSpace(START_PREFIX, traceId.getLevel()),message);
        // 로그 출력
        return new TraceStatus(traceId,startTimeMs,message);
    }

    public TraceStatus beginSync(TraceId beforeTraceId, String message){
        TraceId nextId = beforeTraceId.createNextId();
        Long startTimeMs = System.currentTimeMillis();
        log.info("[{}] {}{}", nextId.getId(), addSpace(START_PREFIX, nextId.getLevel()),message);
        // 로그 출력
        return new TraceStatus(nextId, startTimeMs,message);
    }

    // 트레이스 끝날시 호출
    public void end(TraceStatus status){
        complete(status, null);
    }

    // 비정상 처리일 경우 exception으로 처리
    public void exceptin(TraceStatus status, Exception e){
        complete(status, e);
    }

    private void complete(TraceStatus status, Exception e) {
        Long stopMiliMs = System.currentTimeMillis();
        long resultTimeMs = stopMiliMs-status.getStartTimeMs();
        TraceId traceId = status.getTraceId();
        if(e == null){
            log.info("[{}] {}{} time={}ms", traceId.getId(), addSpace(COMPLETE_PREFIX, traceId.getLevel()),status.getMessage(), resultTimeMs);
        }else{
            log.info("[{}] {}{} time={}ms ex={}", traceId.getId(), addSpace(COMPLETE_PREFIX, traceId.getLevel()),status.getMessage(), resultTimeMs);
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

package hello.advanced.trace.strategy.code.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeLogTemplate {


    public void execute(CallBack callBack){
        long startTime = System.currentTimeMillis();

        callBack.call(); // 위임

        // 비즈니스 로직 종료
        long endTime = System.currentTimeMillis();

        log.info("resultTime={}",endTime-startTime);
    }
}

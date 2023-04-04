package hello.advanced.trace.template.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyLogic2 implements Strategy{

    @Override
    public void call() {
        log.info("Logic2 실행");
    }
}

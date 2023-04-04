package hello.advanced.trace.strategy.code.template;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateCallBackTest {

    @Test
    void callbackV1(){
        TimeLogTemplate template = new TimeLogTemplate();
        template.execute(()->log.info("실행1"));
        template.execute(()->log.info("실행2"));
    }
}

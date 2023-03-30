package hello.advanced.app.v3;

import hello.advanced.trace.TraceStatus;
import hello.advanced.trace.hellotrace.HelloTraceV2;
import hello.advanced.trace.logtrace.LogTrace;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderControllerV3 {

    private final OrderServiceV3 orderService;
    private final LogTrace trace;
    @GetMapping("/v3/request")
    public String request(String itemId){

        TraceStatus status = null;
        try{
            status = trace.begin("OrderController.request()");
            orderService.orderItem(status.getTraceId(), itemId);
            trace.end(status);
        }catch(Exception e){
            // 이까지만 처리하면 정상으로 처리된다.
            trace.exception(status,e);
            // 어플리케이션 흐름에 영향을 주면 안됨
            throw e; // 예외를 꼭 다시 던져주어야 한다.
        }

        return "ok";
    }
}

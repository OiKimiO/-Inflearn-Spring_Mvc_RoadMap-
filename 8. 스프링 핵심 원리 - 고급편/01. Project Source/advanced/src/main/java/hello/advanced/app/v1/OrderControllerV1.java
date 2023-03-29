package hello.advanced.app.v1;

import hello.advanced.trace.TraceStatus;
import hello.advanced.trace.hellotrace.HelloTraceV1;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderControllerV1 {

    private final OrderServiceV1 orderService;
    private final HelloTraceV1 trace;
    @GetMapping("/v1/request")
    public String request(String itemId){

        TraceStatus status = null;
        try{
            status = trace.begin("OrderControllerV1.request()");
            orderService.orderItem(itemId);
            trace.end(status);
        }catch(Exception e){
            // 이까지만 처리하면 정상으로 처리된다.
            trace.exceptin(status,e);
            // 어플리케이션 흐름에 영향을 주면 안됨
            throw e; // 예외를 꼭 다시 던져주어야 한다.
        }

        return "ok";
    }
}

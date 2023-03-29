package hello.advanced.app.v1;

import hello.advanced.trace.TraceStatus;
import hello.advanced.trace.hellotrace.HelloTraceV1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV1 {

    private final OrderServiceV1 orderService;
    private final HelloTraceV1 trace;
    public final OrderRepositoryV1 orderRepository;

    public void orderItem(String itemId){


        TraceStatus status = null;
        try{
            status = trace.begin("OrderServiceV1.orderItem()");
            orderRepository.save(itemId);
            trace.end(status);
        }catch(Exception e){
            // 이까지만 처리하면 정상으로 처리된다.
            trace.exceptin(status,e);
            // 어플리케이션 흐름에 영향을 주면 안됨
            throw e; // 예외를 꼭 다시 던져주어야 한다.
        }

    }

}

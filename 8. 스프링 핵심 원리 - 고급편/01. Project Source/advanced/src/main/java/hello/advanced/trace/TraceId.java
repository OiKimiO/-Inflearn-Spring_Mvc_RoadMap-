package hello.advanced.trace;


import java.util.UUID;

// 로그를 남기는 기능 구현
public class TraceId {

    // 트랜잭션 id
    private String id;
    private int level;

    private TraceId(String id, int level){
        this.id = id;
        this.level = level;
    }

    public TraceId(){
        this.id = createId();
        this.level = 0;
    }

    private String createId() {
        // 랜덤으로 생성된 앞 8자리만 사용
        return UUID.randomUUID().toString().substring(0,8);
    }

    // id는 똑같지만 level은 늘리는 기능
    // 다음 트랜잭션을 기록할 때 사용
    public TraceId createNextId(){
        return new TraceId(id, level+1);
    }

    // id는 똑같지만 level은 줄이는 기능
    // 이전 트랜잭션 기록으로 돌아가기 위해 사용
    public TraceId createPreviousId(){
        return new TraceId(id, level-1);
    }

    public boolean isFirstLevel(){
        return level == 0;
    }

    public String getId(){
        return id;
    }

    public int getLevel(){
        return level;
    }
}

import java.util.LinkedList;

/*
* [큐(queue)]
* - 먼저 넣은 데이터가 먼저 나오는 자료구조.
* - 선입선출(First In, First Out:FIFO), 후입후출(Last In, Last Out: LILO) 구조를 가진다.
* [큐(queue)는 Java에서 LikedList 클래스로 Queue를 인스턴스화 하여 사용한다.]
* [java lib - 큐(queue) 구현(LikedList) 관련 메소드]
* add(data) : queue에 데이터 삽입
* poll() : queue에서 데이터 확인 및 제가
* peek() : queue에서 데이터 확인
* size() : queue 크기 출력
* clear() : queue 초기화
*
* [활용]
* - 넓이 우선 탑색(BFS, Breath-First Search) 구현
*   - 처리해야할 노드의 리스트를 저장하는 용도로 큐(Queue)를 사용한다.
*   - 노드를 하나 처리할 때마다 해당 노드와 인접한 노드들을 큐에 다시 저장한다.
*   - 노드를 접근한 순서대로 처리할 수 있다.
* */
public class Queue {
    static java.util.Queue<Integer> que;
    public static void main(String[] args){
        // queue는 Likedlist 클래스로 선언한다.
        que = new LinkedList<Integer>();
        // queue 초기화
        que.clear();
        // queue에 데이터 10, 20, 30 삽입
        que.add(10);
        que.add(20);
        que.add(30);
        // queue의 size 출력
        System.out.println("stack size = " + que.size());
        // queue에서 데이터 확인
        System.out.println("data(peek) = " + que.peek());
        // queue에서 데이터 확인 및 제거
        System.out.println("data(pop) = " + que.poll());
        System.out.println("data(pop) = " + que.poll());
        System.out.println("data(pop) = " + que.poll());
        // queue에 아무것도 없는지 확인
        if(que.isEmpty()){
            System.out.println("Queue is empty");
        }
    }
}

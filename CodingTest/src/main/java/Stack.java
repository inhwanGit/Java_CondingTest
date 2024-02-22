/*
* [스택(Stack)]
* - 한 쪽 방향에서만 데이터의 삽입과 삭제가 이루어지는 자료구조이다.
* - 선입후출(First In, Last Out:FILO), 후입선출(Last In, First Out: LIFO) 구조를 가진다.
*
* [java lib - 스택(stack) 관련 메소드]
* push(E item) : 해당 item을 stack의 top에 삽입
* pop() : stack의 top에 있는 item을 삭제하고 해당 item을 반환
* peek() : stack의 top에 있는 item을 삭제하지않고 해당 item을 반환
* isEmpty() : stack이 비어있으면 true를 반환하고 그렇지 않으면 false를 반환
* search(Object o) : 해당 Object의 위치를 반환, stack의 top 위치는 1, 해당 Object가 없으면 -1을 반환
* size() : stack의 크기 출력
* clear() : stack 초기화
*
* [활용]
* - 깊이 우선 탑색(DFS, Depth-First Search) 구현 (dfs 구현으로 스택이나 재귀함수을 이용하는데 재귀함수를 이용한 구현이 더 쉽고 직관적이다.)
* */
public class Stack {
    static java.util.Stack<Integer> stk;
    public static void main(String[] args){
        stk = new java.util.Stack<Integer>();
        // stack 초기화
        stk.clear();
        // stack에 데이터 10, 20, 30 삽입
        stk.add(10);
        stk.add(20);
        stk.add(30);
        // stack의 size 출력
        System.out.println("stack size = " + stk.size());
        // stack에서 데이터 확인
        System.out.println("data(peek) = " + stk.peek());
        // stack에서 데이터 확인 및 제거
        System.out.println("data(pop) = " + stk.pop());
        System.out.println("data(pop) = " + stk.pop());
        System.out.println("data(pop) = " + stk.pop());
        // stack에 아무것도 없는지 확인
        if(stk.isEmpty()){
            System.out.println("stack is empty");
        }
    }
}

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

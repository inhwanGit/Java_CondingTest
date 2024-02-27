[스택(Stack)]
  - 한 쪽 방향에서만 데이터의 삽입과 삭제가 이루어지는 자료구조이다.
  - 선입후출(First In, Last Out:FILO), 후입선출(Last In, First Out: LIFO) 구조를 가진다.

  [java lib - 스택(stack) 관련 메소드]
  push(E item) : 해당 item을 stack의 top에 삽입
  pop() : stack의 top에 있는 item을 삭제하고 해당 item을 반환
  peek() : stack의 top에 있는 item을 삭제하지않고 해당 item을 반환
  isEmpty() : stack이 비어있으면 true를 반환하고 그렇지 않으면 false를 반환
  search(Object o) : 해당 Object의 위치를 반환, stack의 top 위치는 1, 해당 Object가 없으면 -1을 반환
  size() : stack의 크기 출력
  clear() : stack 초기화

 [활용]
 - 깊이 우선 탑색(DFS, Depth-First Search) 구현 (dfs 구현으로 스택이나 재귀함수을 이용하는데 재귀함수를 이용한 구현이 더 쉽고 직관적이다.)

[큐(queue)]
  - 먼저 넣은 데이터가 먼저 나오는 자료구조.
  - 선입선출(First In, First Out:FIFO), 후입후출(Last In, Last Out: LILO) 구조를 가진다.
  [큐(queue)는 Java에서 LikedList 클래스로 Queue를 인스턴스화 하여 사용한다.]
  [java lib - 큐(queue) 구현(LikedList) 관련 메소드]
  add(data) : queue에 데이터 삽입
  poll() : queue에서 데이터 확인 및 제가
  peek() : queue에서 데이터 확인
  size() : queue 크기 출력
  clear() : queue 초기화

  [활용]
  - 넓이 우선 탑색(BFS, Breath-First Search) 구현
  - 처리해야할 노드의 리스트를 저장하는 용도로 큐(Queue)를 사용한다.
  - 노드를 하나 처리할 때마다 해당 노드와 인접한 노드들을 큐에 다시 저장한다.
  - 노드를 접근한 순서대로 처리할 수 있다.

  너비 우선 탐색(Breadth First Searc, BFS)
 - 너비 우선 탐색은 트리나 그래프를 탐색하는 알고리즘 중 하나로, 시작 정점에서 시작하여 인접한 정점을 먼저 탐색하는 방법이다.
 - bfs는 최소비용 경로를 찾는 데에 장점이 있으며, queue를 이용해서 구현한다.

 <bfs 구현 단계>
 1. 시작점을 큐에 넣는다.
 2. 큐에서 한 점을 꺼낸 후 기준점으로 삼는다.
 3. 기준점이 목적지이면 탐색을 종료한다.
 4. 그렇지 않은 경우 기준점에서 갈 수 있는 다음 정점들을 큐에 넣는다.
 5. 큐에 원소가 없을 때까지 2단계로 돌아가 반복한다.

  (입력예시)
  1 // 입력 횟수
  7 6 // 정점 개수, 간선 수
  1 7 // 시작점, 도착점
  1 2 // 연결 정보
  2 4
  2 5
  1 3
  3 6
  6 7

package ch08.innerClass;

public class MyLinkedList {

	// 외부 클래스의 필드
	private Node head = null;

	// 내부 클래스
	private class Node {
		private String data;
		private Node link;

		public Node(String data) {
			this.data = data;
		}
	}

	// 외부 클래스의 메서드
	public void add(String data) {
		Node newNode = new Node(data);
		// head가 기존 가리키는게 없을때
		if (head == null) {
			head = newNode;

		// head가 기존 가리키는게 있을때
		} else {
			Node next = head;
			while (next.link != null) {
				next = next.link;
			}
			// 마지막 Node의 link 참조변수에 새로 생성한 newNode를 대입한다
			next.link = newNode;
		}
	}

	// 외부 클래스의 메서드
	public void print() {
		if (head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			while (next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}
}
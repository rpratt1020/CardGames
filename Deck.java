import java.lang.Math.random;

public Class Deck {
	private Node head;
	private int size;

	public createDeck() {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 12, j++) {
				Node card = new Node(suits[i], ranks[j]);
				addToFront(card);
			}
		}
	}

	public void addToFront(Node card) {
		card.setNext(head);
		size++;
	}
	public void addToBack(Node card) {
		Node curr = head;
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		curr.setNext(card);
	}

	public Node removeAtIndex(int index) {
		Node curr = head;
		for (int i = 1; i < index; i++) {
			curr = curr.getNext();
		}
		Node tmp = curr.getNext();
		curr.setNext(curr.getNext().getNext());
		return tmp;
	}
		
	public Node drawCard() {
		Node tmp = head;
		head = head.getNext();
		size--;
		tmp.setNext(null);
		return tmp;
	}

	public shuffle() {
		for (int i = 0; i < 52; i++) {
			int index = (int) (Math.random() * (52-i));
			addToBack(removeAtIndex(index));
		}
	}					
}
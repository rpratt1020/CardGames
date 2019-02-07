public Class Node {
	private Suit suit;
	private Rank rank;
	private Node next;
	Node(Suit suit, Rank rank) {
		this(suit, rank, null);
	}
	Node(Suit suit, Rank rank, Node next) {
		this.suit = suit;
		this.rank = rank;
		this.next = next;
	}
	public Suit getSuit() {
		return suit;
	}
	public Rank getRank() {
		return rank;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
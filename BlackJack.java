java.util.ArrayList;

public Class BlackJack {
	int score = 0;
	ArrayList<Node> playerHand = new ArrayList<Node>();
	ArrayList<Node> dealerHand = new ArrayList<Node>();	
	
	public void dealCards() {
		for (int i = 0; i < 2; i++) {
			playerHand.add(drawCard());
			dealerHand.add(drawCard());
		}
	}

	public int sumHand(ArrayList<Node> hand) {
		ArrayList<Node> usedHand = new ArrayList<Node>();
		int sum = 0;
		for (int i = 0; i < hand.length(); i++) {
			usedHand.add(hand.get(i));
			Node card = hand.get(i);
			if (card.getRank() == 15) {
				sum += 11;
			else if (card.getRank() > 10) {
				sum += 10;
			} else {
				sum += card.getRank();
			}
		}
		if (sum > 21) {
			for (int i = 0; i < hand.length(); i++) {
				Node usedCard = usedHand.get(i);
				if (usedCard.getRank() == 15) {
					sum -= 10
				}
			}
		}
		return sum;
	}

	public void hitHandPlayer() {
		playerHand.add(drawCard());
		sum = sumHand(playerHand)
		if (bust(playerHand)) {
			playerLose();
		}
	}

	public void stayPlayer() {
		dealerTurn();
	}

	public void dealerTurn() {
		sum = sumHand(dealerHand);
		if (sum < 17) {
			hitHandDealer();
			dealerTurn();
		}
		else {
			winOrLose();
		}
	}

	public winOrLose() {
		sumPlayer = sumHand(playerHand);
		sumDealer = sumHand(dealerHand);
		if (sumPlayer < sumDealer) {
			playerLose();
		} else if (sumPlayer > sumDealer) {
			playerWin();
		} else {
			gameTie;
		}
	}

	public int bust(ArrayList<Node> hand) {
		sum = sumHand(hand)
		if (sum > 21) {
			return true;
		}
		return false;
	}

	public playerLose() {
		score -= 1;
	}
	
	public playerWin() {
		score += 1;
	}
package strategy;

public class Price {
	private MemberStrategy memberStrategy;

	public Price(MemberStrategy memberStrategy){
		this.memberStrategy=memberStrategy;
	}
	public double quto(double book){
		return this.memberStrategy.calcPrice(book);
	}
}

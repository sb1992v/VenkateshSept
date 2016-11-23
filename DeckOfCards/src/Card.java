
public class Card {

	private String value;
	private String shape;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public Card() {
		super();
	}
	public Card(String value, String shape) {
		super();
		this.value = value;
		this.shape = shape;
	}
	@Override
	public String toString() {
		return "Card [value=" + value + ", shape=" + shape + "]";
	}
	
//	public enum shape{
//		spade,claver,hearts,diamond
//	}
//	public enum value{
//		one,two,three,four,five,six,seven,eight,nine,ten,king,queen,jack,ace
//	}
	
}

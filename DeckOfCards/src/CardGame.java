import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CardGame {

	List<Card> cards = new ArrayList<Card>();

public	static void main(String[] args) {
		List<String> shape = new ArrayList<String>();
		shape.add("spade");
		shape.add("claver");
		shape.add("hearts");
		shape.add("diamond");
		List<String> value = new ArrayList<String>();
		for(int i=1;i<=10;i++)
		{
			String val=Integer.valueOf(i).toString();
			value.add(val);
		}
		value.add("king");
		value.add("queen");
		value.add("jack");
		value.add("ace");
		
		int index1 = ThreadLocalRandom.current().nextInt(shape.size());
		int index2 = ThreadLocalRandom.current().nextInt(value.size());

		Card c = new Card(value.get(index2),shape.get(index1));
		System.out.println(c);
		
		String val="10.0";
		double dval=Double.parseDouble(val);
	
		Integer i=new Integer(10);
		System.out.println(i);
		
		

	}

}

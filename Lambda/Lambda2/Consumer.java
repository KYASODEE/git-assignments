package Lambda2;

public class Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String>consumer=(t)-> System.out.println(t);
		consumer.accept("Hello");

	}

}

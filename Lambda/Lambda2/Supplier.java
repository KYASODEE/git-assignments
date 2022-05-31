package Lambda2;

import java.time.LocalDateTime;


public class Supplier {
	public static void main(String[] args) {
	     Supplier<LocalDateTime> supplier =()->LocalDateTime.now();
	     System.out.println(supplier.get());
		}


}
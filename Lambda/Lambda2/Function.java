package Lambda2;

import java.util.function.Consumer;



public class Consumer {
public static void main(String[] args) {
Consumer<String>consumer=(t)-> System.out.println(t);
consumer.accept("Hello");



}



}
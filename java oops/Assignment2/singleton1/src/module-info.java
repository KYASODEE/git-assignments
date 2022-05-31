module singleton1 {

class Singleton1{
private static Singleton1 single_Instance=null;
String s;
protected Singleton1()
{
s="Hai am Singleton class";
}
public static Singleton1 getInstance() {
if (single_Instance == null)
single_Instance = new Singleton(); return single_Instance;
}
}
class Hello extends Singleton
{
public Singleton Hello()
{
return getInstance();
}
}
public class SingletonClass { public static void main(String[] args) {
// TODO Auto-generated method stub
Singleton X=Singleton.getInstance();
System.out.println("Hashcode of X "+ X.hashCode());
Singleton Y=Singleton.getInstance();
System.out.println("Hashcode of y "+ Y.hashCode());
Singleton ss=new Hello();
System.out.println("hashcode of ss"+ss.hashCode());
System.out.println("cannot be inherited");
}
}


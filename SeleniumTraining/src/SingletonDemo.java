
public class SingletonDemo {

	public static void main(String[] args) {
		SingleTon singleTon=SingleTon.getInstance();
		singleTon.display();
		singleTon=SingleTon.getInstance();
		singleTon.display();
		

	}

}

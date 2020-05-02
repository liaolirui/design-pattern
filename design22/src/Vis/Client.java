package Vis;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IProduct b1=new Book();
		IProduct b2=new Book();
		IProduct a1=new Apple();
		AVisitor visitor;
		
		BuyBasket basket=new BuyBasket();
		basket.addProduct(b1);
		basket.addProduct(b2);
		basket.addProduct(a1);
		
		//顾客
		visitor=new Customer();
		
		//收银员
		//visitor=new Saler();
		
		visitor.setName("张三");
		basket.accept(visitor);
	}

}

package Bui;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mb=new SubMealBuiderB();
		KFCWaiter waiter=new KFCWaiter();
		waiter.setMealBuilder(mb);
		Meal meal=waiter.construct();
		
		System.out.println("�ײ����");
		System.out.println(meal.getFood());
		System.out.println(meal.getDrink());
	}

}

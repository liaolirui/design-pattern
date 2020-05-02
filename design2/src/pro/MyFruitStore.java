package pro;

import java.util.Hashtable;

public class MyFruitStore {
	   //单例模式
	private static Hashtable fruittable=null;
	private static MyFruitStore fruitstore=null;
	   //原型模式
//	private static Hashtable fruittable
//	=new Hashtable<Integer,MyFruit>();
	
	   //单例模式
	private MyFruitStore() {
		fruittable=new Hashtable<Integer,MyFruit>();
	}
	public static MyFruitStore Getfruitstore() {
		if(fruitstore==null) {
			fruitstore=new MyFruitStore();
		}
		return fruitstore;
	}
	
	//公共代码	：原型模式有static 单例无
	public void Add(Integer key,MyFruit fruit) {
		fruittable.put(key, fruit);
		
	}
	public MyFruit Get(Integer key) {
		MyFruit fruit=(MyFruit) fruittable.get(key);
		return (MyFruit) fruit.clone();
	}
}

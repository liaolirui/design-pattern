package pro;

import java.util.Hashtable;

public class MyFruitStore {
	   //����ģʽ
	private static Hashtable fruittable=null;
	private static MyFruitStore fruitstore=null;
	   //ԭ��ģʽ
//	private static Hashtable fruittable
//	=new Hashtable<Integer,MyFruit>();
	
	   //����ģʽ
	private MyFruitStore() {
		fruittable=new Hashtable<Integer,MyFruit>();
	}
	public static MyFruitStore Getfruitstore() {
		if(fruitstore==null) {
			fruitstore=new MyFruitStore();
		}
		return fruitstore;
	}
	
	//��������	��ԭ��ģʽ��static ������
	public void Add(Integer key,MyFruit fruit) {
		fruittable.put(key, fruit);
		
	}
	public MyFruit Get(Integer key) {
		MyFruit fruit=(MyFruit) fruittable.get(key);
		return (MyFruit) fruit.clone();
	}
}

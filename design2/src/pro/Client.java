package pro;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //原型模式浅拷贝
//		MyFruit fru1=new Apple();
//		MyFruit fru2=(Apple)fru1.clone();
//		fru1.Display();
//		fru2.Display();
//		System.out.println("fru1:"+fru1.hashCode());
//		System.out.println("fru2:"+fru2.hashCode());
//		System.out.println("fru1:"+fru1.toString());
//		System.out.println("fru2:"+fru2.toString());
//		System.out.println(fru1==fru2);
		
		//原型模式管理器
//		MyFruit fru1=new Apple();
//		MyFruit fru2=new Banana();
//		MyFruitStore.Add(1,fru1);
//		MyFruitStore.Add(2,fru2);
//		MyFruitStore.Add(3,new Apple());
//		MyFruitStore.Add(4,new Banana());
//		
//		MyFruit fru=(MyFruit)MyFruitStore.Get(4);
//		fru.Display();
		
		//单例模式
		MyFruit fru1=new Apple();
		MyFruit fru2=new Banana();
		MyFruitStore mfs1=MyFruitStore.Getfruitstore();
		mfs1.Add(1,fru1);
		mfs1.Add(2,fru2);
		mfs1.Add(3,new Apple());
		mfs1.Add(4,new Banana());
		MyFruitStore mfs2=MyFruitStore.Getfruitstore();
		
		MyFruit fru=(MyFruit)mfs2.Get(4);
		fru.Display();
		System.out.println("mfs1:"+mfs1.toString());
		System.out.println("mfs2:"+mfs2.toString());
	}

}

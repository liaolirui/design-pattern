package Ada;

import pro.Apple;
import pro.Banana;
import pro.MyFruit;
import pro.MyFruitStore;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFruit fru1=new Apple();
		MyFruit fru2=new Banana();
		MyFruitStore mfs1=MyFruitStore.Getfruitstore();
		mfs1.Add(1,fru1);
		mfs1.Add(2,fru2);
		mfs1.Add(3,new Apple());
		mfs1.Add(4,new Banana());
		MyFruitStore mfs2=MyFruitStore.Getfruitstore();
		
		INewJuicer newJuicer=new Adapter();
		System.out.println(newJuicer.newPort(mfs1.Get(3), mfs1.Get(4)));
	}

}

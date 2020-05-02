package Ada;

import pro.MyFruit;
    //类模式
//public class Adapter extends OldJuicer implements INewJuicer {

public class Adapter implements INewJuicer {
	//对象适配器
	private OldJuicer oldJuicer;
    public String newPort(MyFruit fruit1, MyFruit fruit2){
    	oldJuicer=new OldJuicer();
    	String str="混合果汁："+oldJuicer.onePort(fruit1);
    	str+=oldJuicer.onePort(fruit2);
        return str;
    	
//    	String str="混合果汁："+onePort(fruit1);
//    	str+=onePort(fruit2);
//        return str;
    }

}

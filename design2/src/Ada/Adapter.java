package Ada;

import pro.MyFruit;
    //��ģʽ
//public class Adapter extends OldJuicer implements INewJuicer {

public class Adapter implements INewJuicer {
	//����������
	private OldJuicer oldJuicer;
    public String newPort(MyFruit fruit1, MyFruit fruit2){
    	oldJuicer=new OldJuicer();
    	String str="��Ϲ�֭��"+oldJuicer.onePort(fruit1);
    	str+=oldJuicer.onePort(fruit2);
        return str;
    	
//    	String str="��Ϲ�֭��"+onePort(fruit1);
//    	str+=onePort(fruit2);
//        return str;
    }

}

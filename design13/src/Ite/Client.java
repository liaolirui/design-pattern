package Ite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv;
		tv=new TCLTelevision();
		display(tv);
		System.out.println("--------------");
		reverseDisplay(tv);
	}
	public static void display(Television tv) {
		TVIterator i=tv.createIterator();
		System.out.println("���ӻ�Ƶ����");
		while(!i.isLast()) {
			System.out.println(i.currentChannel().toString());
			i.next();
		}
	}
	
	public static void reverseDisplay(Television tv) {
		TVIterator i=tv.createIterator();
		i.setChannel(7);
		System.out.println("���������Ŀ��");
		while(!i.isFirst()) {
			System.out.println(i.currentChannel().toString());
			i.previous();
		}
	}
}

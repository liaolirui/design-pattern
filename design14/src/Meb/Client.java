package Meb;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChatroom happyChat=new ChatGroup();
		Member member1,member2,member3,member4,member5;
		member1=new DiamondMember("����");
		member2=new DiamondMember("����");
		member3=new CommonMember("����");
		member4=new CommonMember("С��");
		member5=new CommonMember("С��");
		
		happyChat.register(member1);
		happyChat.register(member2);
		happyChat.register(member3);
		happyChat.register(member4);
		happyChat.register(member5);
		
		member1.sendText("����", "���ģ����!");
		member2.sendText("����", "���������!");
		member1.sendText("����", "���������������Դ���!");
		member2.sendImage("����","һ���ܴ�ܴ��̫��");
		member2.sendImage("����", "̫��");
		member3.sendText("С��", "����������");
		member3.sendText("С��", "����������");
		member4.sendText("����", "û���ˣ�лл!");
		member5.sendText("����", "��Ҳû����!");
		member5.sendImage("����", "лл");
	}

}

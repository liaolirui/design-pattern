package Vis;

public class Customer extends AVisitor {

	@Override
	public void visit(Apple apple) {
		// TODO Auto-generated method stub
		System.out.println("�˿�"+name+"ѡƻ��");
	}

	@Override
	public void visit(Book book) {
		// TODO Auto-generated method stub
		System.out.println("�˿�"+name+"����");
	}

}

package Fly;

public abstract class Apiece {
	protected String inKind;
	public Apiece(String inKind) {
		this.inKind=inKind;
	}
	
	//����ʱ���ӵ�λ��
	public abstract void Play(int x,int y);
}
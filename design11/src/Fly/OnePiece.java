package Fly;

public class OnePiece extends Apiece {
	
	public OnePiece(String inKind) {
		super(inKind);
	}
	@Override
	public void Play(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("��"+inKind+"�ӷ���("+
		x+","+y+")��λ��");
	}

}

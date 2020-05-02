package proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLocalPicShow cls=new CLocalPicShow();
		cls.ShowPic("photo");
		IShowPic ipic=new CRemoPic();
		IShowPic proxy=(IShowPic) new CLocalPicShow();
		proxy.ShowPic("AAA");
	}

}

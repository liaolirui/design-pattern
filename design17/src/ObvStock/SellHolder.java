package ObvStock;

import java.util.ArrayList;
import java.util.List;

public class SellHolder implements IStockHolder {
	private List<AStockPrice> attentionlist;
	private String name;
	public SellHolder(String name) {
		attentionlist=new ArrayList<AStockPrice>();
		this.name=name;
	}
	@Override
	public void update(AStockPrice asp) {
		// TODO Auto-generated method stub
		if(attentionlist.contains(asp)) {
			System.out.println(name);
			
			if(asp.getPrice()-asp.getPrice2()>0) {
				System.out.print(asp.code+":");
				System.out.print("ԭ��:"+asp.price2+"-�ּ�:"+asp.getPrice());
				System.out.println("���ˣ���");
			}
			else
			{
				System.out.print(asp.code+":");
				System.out.print("ԭ��:"+asp.price2+"-�ּ�:"+asp.getPrice());
				System.out.println("���ˣ�ˬ");
			}
		}	
	}

	@Override
	public void AddHolder(AStockPrice asp) {
		// TODO Auto-generated method stub
		attentionlist.add(asp);
		asp.Add(this);	
	}

}

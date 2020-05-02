package ObvStock;

public class StockFutures extends AStockPrice {
	public StockFutures(String code) {
		super(code);
	}
	@Override
	protected void notifyHolder() {
		// TODO Auto-generated method stub
		System.out.println("期货更新了-"+code+":"+price);
		for(IStockHolder ish:stockHolderlist) {
			ish.update(this);
		}
		price2=price;
	}

}

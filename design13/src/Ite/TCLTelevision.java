package Ite;

public class TCLTelevision implements Television {
	
	private Object[] obj= {"湖南卫视","北京卫视","浙江卫视","安徽卫视","江苏卫视","广东卫视","山东卫视","东方卫视"};
	public TVIterator createIterator() {
		return new TCLIterator();
	}
	private class TCLIterator implements TVIterator{
		private int currentIndex=0;
		
		public void next() {
			if(currentIndex<obj.length) {
				currentIndex++;
			}
		}
		
		public void previous() {
			if(currentIndex>0) {
				currentIndex--;
			}
		}

		@Override
		public void setChannel(int i) {
			// TODO Auto-generated method stub
			currentIndex=i;
		}

		@Override
		public boolean isLast() {
			// TODO Auto-generated method stub
			return currentIndex==obj.length;
		}

		@Override
		public Object currentChannel() {
			// TODO Auto-generated method stub
			return obj[currentIndex];
		}

		@Override
		public boolean isFirst() {
			// TODO Auto-generated method stub
			return currentIndex==0;
		}
	}
}

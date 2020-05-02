package Ite;

public class TCLTelevision implements Television {
	
	private Object[] obj= {"��������","��������","�㽭����","��������","��������","�㶫����","ɽ������","��������"};
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

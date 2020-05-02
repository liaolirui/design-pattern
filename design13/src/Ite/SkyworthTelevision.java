package Ite;

public class SkyworthTelevision implements Television {
	private Object[] obj= {"CCTV-1","CCTV-2","CCTV-3","CCTV-4","CCTV-5","CCTV-6","CCTV-7","CCTV-8"};
	public TVIterator createIterator() {
		return new SkyworthIterator();
	}
	private class SkyworthIterator implements TVIterator{
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

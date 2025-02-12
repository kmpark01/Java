package org.joonzis.ex;

class Box{
	private Object obj;

	public Object getObj() {
		return obj;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
}
class BallPen{
	
}
class Pencil{
	
}

public class Ex01_generic {

	public static void main(String[] args) {
		
		Box box = new Box();
		
		box.setObj(new BallPen());
		BallPen mypen = (BallPen)box.getObj();
		box.setObj(new Pencil());
		Pencil mypencil = (Pencil)box.getObj();
	}
}

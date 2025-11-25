public class Rectangle{
	
	public static class Point2 {
		static final int maxx1=20;
	   	static int maxx=20;
	   	int x,y;
	   	public Point2(int x, int y) {
	   		Point2.maxx = 21
	   	  	this.x = x;
	      	this.y = y;
	   	}
 	}
	   
	void change(Point2 p){ 
      	p.x = 1;
	    p = new Point2(4,5);
	}

	public static void main(String[] args) {
	    Point2 po = new Point2(2, 5);
     	Rectangle r = new Rectangle();
     	r.change(po);
    	System.out.println(po.x);
	}
}
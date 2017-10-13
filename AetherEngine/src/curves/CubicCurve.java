package curves;

import engine.*;
import java.math.*;
public class CubicCurve {

	Point p1;
	Point p2;
	Point p3;
	Point p4;
	
	
	public Point getPoint(float t){
		return new Point(
		(float)(p1.x*Math.pow((1-t),3)+p2.x*3*Math.pow((1-t),2)*t+p3.x*3*(1-t)*Math.pow(t,2)+p4.x*Math.pow(t,3)) ,
		(float)(p1.y*Math.pow((1-t),3)+p2.y*3*Math.pow((1-t),2)*t+p3.y*3*(1-t)*Math.pow(t,2)+p4.y*Math.pow(t,3))	
		);
	}
	
	public CubicCurve(Point s,Point c1,Point c2,Point e){
		p1 = s;
		p2 = c1;
		p3 = c2;
		p4 = e;
	}
	
	
	
}

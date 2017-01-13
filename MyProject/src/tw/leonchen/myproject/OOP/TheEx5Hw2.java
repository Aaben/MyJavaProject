package tw.leonchen.myproject.OOP;

//	public int f(int a,int b,int c){
//		
//		return b*b-4*a*c;
//		}
//	public double r(double a,double b,double z){
//		return (-b+z)/2*a;
//		
//	}
//	public double o(double a,double b,double z){
//		return (-b-z)/2*a;
//		
//	}
//	想太複雜	

public class TheEx5Hw2 {

	public static void main(String[] args) {
		double a=12, b=6, c=-18;
		if(b*b-4*a*c<0){
			System.out.println("no answer!");
		}
		else{
			System.out.println("x1="+(-b+Math.sqrt(b*b-4*a*c))/(2*a));
			System.out.println("x2="+(-b-Math.sqrt(b*b-4*a*c))/(2*a));
		}
		
		
//		squar q =new squar();
//		int y = q.f(12, 6, -18);
//		if(y>=0){
//			System.out.println(y);
//		}
//		else{
//			System.out.println("no answer!");
//		}
//		double z= Math.sqrt(y);
//		System.out.println(z);
//		
//		double w=q.r(12, 6, z);
//		System.out.println(w);
//		
//		double e=q.o(12, 6, z);
//		System.out.println(e);
	
		
	}

}

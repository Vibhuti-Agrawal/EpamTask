public class SIandCI{
	public static double simpleInterest(double pr,double t,double r){
		return (pr*t*r)/100;
}
	public static double compoundInterest(double pr,double t,double r){
		return pr * Math.pow(1.0+r/100.0,t) - pr;
}
}

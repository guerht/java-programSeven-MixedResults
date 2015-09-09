/*
 * Project: MixedResults.java
 * Description: Playing with Math and Math classes
 * Author: Seunghoon Park
 * Date: 8 September 2015
 */
public class MixedResults {
	public static void main(String args[]) {
		System.out.println(3+5.0/2+5*2-3);
		System.out.println(3.0+5/2+5*2-3);
		System.out.println( (int)(3.0+5)/(2+5.0)*2-3);
		// initial varaibles
		double d1 = 37.9;
		double d2 = 1004.128;
		int i1 = 12;
		int i2 = 18;
		System.out.println("problem 1: "+(57.2*(i1/i2)+1)); // 1.0
		System.out.println("problem 2: "+(57.2*((double)i1/i2)+1)); // 39.13333
		System.out.println("problem 3: "+(15-i1*(d1*3)+4)); // -1345.399999
		System.out.println("problem 4: "+(15-i1*(int)(d1*3)+4)); //-1337
		System.out.println("problem 5: "+(15-i1*((int)d1*3)+4)); // -1313
		//exercises 10-15 page 5-4
		System.out.println("\nExercise 10\n");
		int p = 3;
		double d = 10.3;
		int j = (int)5.9;
		System.out.println(p+p*d-3*j); // 18.9
		System.out.println("\nExercise 11\n");
		int p1 = 3;
		double do1 = 10.3;
		int j1 = (int)5.9;
		System.out.println(p1+p1*(int)do1-3*j1); // 18
		System.out.println("\nExercise 12-15\n");
		int divident = 12, divisor = 4, quotient, remainder;
		int divident2 = 13 , divisor2 = 3 , quotient2, remainder2;
		quotient = divident / divisor; // 3
		remainder = divident % divisor; // 0
		quotient2 = divident2 / divisor2; //4
		remainder2 = divident2 % divisor2; // 1
		System.out.println(quotient);
		System.out.println(remainder);
		System.out.println(quotient2);
		System.out.println(remainder2);
		System.out.println("\nExercise 17\n");
		final String M = "ugg"; // M is final, cannot be altered
		// M = "wow"; will result to compile error

		/*
		 * Math class methods: 
		 * Math.abs(x); // abssolute value (int,double)
		 * Math.pow(x,y); // exponent (x to the power of y)
		 * Math.sqrt(x); // square root (double)
		 * Math.ceil(x); // ceiling (the next highest whole number)
		 * Math.floor(x); // Floor (the next lowest whole number)
		 * Math.min(x,y); // minimum value of x or y;
		 * Math.max(x,y); // maximum value of x or y;
		 * Math.random(x); // returns a random number between 0<=x<1
		 * Math.round(x); // rounds the number
		 * Math.PI // constant variable, returns 3.141592653...
		 */
		System.out.println("\nMaths class methods!!!\n");
		System.out.println(Math.abs(-312.7));
		System.out.println(Math.pow(5,5));
		System.out.println(Math.sqrt(2));
		System.out.println(Math.ceil(99.1));
		System.out.println(Math.floor(100.9));
		System.out.println(Math.min(2,25));
		System.out.println(Math.max(2,25));
		System.out.println(Math.round(99.5));
		System.out.println(Math.random()+"\t"+Math.random());
		System.out.println(Math.PI);

		// MODIFIED 9 SEP 2015
		/* 
		 * Other Math methods
		 * Math.log(x); // log base e of x
		 * Math.sin(x); // sine of angle x in radians
		 * Math.cos(x); // cosine of angle x in radians
		 * Math.tan(x); // tangent of x in radians
		 * Math.asin(x); // arcsine of x in range -PI/2 to PI/2
		 * Math.acos(x); // arccosine of x in range -PI/2 to PI/2
		 * Math.atan(x); // arctan of x in range -PI/2 to PI/2
		 * Math.toDegrees(x); // converts radians to degrees
		 * Math.toRadians(x); // converts degrees to radians
		 */

		/*
		 * Project: ComputeThis
		 *
		 * Print: d1 = 3PIsin(187deg) + |cos(122deg)| = -0.61867223758067
		 * Print: d2 = (14.72)^3.801 + ln72 = 27496.988867001543
		 */
		double d10 = 3 * Math.PI * Math.sin(Math.toRadians(187)) + Math.abs(Math.cos(Math.toRadians(122)));
		double d20 = Math.pow(14.72,3.801) + Math.log(72);
		System.out.println("d1 = " + d10);
		System.out.println("d2 = " + d20);
	}
}
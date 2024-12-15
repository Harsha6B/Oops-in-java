import java.util.*;
public class Quadequ{
    public static void main(String[] args){
	      System.out.println("Harsha B");
        System.out.println("1BM23CS107");s
	      Scanner scn = new Scanner(System.in);
	      int a = scn.nextInt(); 
        int b = scn.nextInt(); 
        int c = scn.nextInt(); 
        int d = b*b-4*a*c;
        if (d>=0){
            double r1 = (-b+Math.sqrt(d)/(2*a));
            double r2 = (-b-Math.sqrt(d)/(2*a));
            if(d==0){
                System.out.println("Real Solutions " + r1);
            }
            else{
                System.out.println("Real Solutions " + r1 + " " + r2);
            }
        }
        else{
            System.out.println("No Real Solutions");
        }
            }
}

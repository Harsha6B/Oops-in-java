import java.util.*;
class WrongAge extends Exception
{
    public WrongAge(String msg){
       super(msg);
    }
}
class Father
{
   int age;
   Father(int age) throws WrongAge{
      if(age<0){
         throw new WrongAge("Age can not be negative");
      }
      this.age=age;
   }
}

class Son extends Father
{
    int SonAge;
    Son(int Fage,int Sage) throws WrongAge{
        super(Fage);
        if(Sage>=Fage){
           throw new WrongAge("Son's age cannot be greater than or equal to Father's age");
        }
        if(Sage<0){
            throw new WrongAge("Age can not be negative");
        }
        SonAge=Sage;
    }
}

public class ExceptionMain
{
   public static void main(String [] args){
      System.out.println("1BM23CS107");
      System.out.println("Harsha B");
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter father's age:");
      int FatherAge=scn.nextInt();
    
      System.out.println("Enter son's age:");
      int SonAge=scn.nextInt();

      try
      {
          Father f=new Father(FatherAge);
          System.out.println("Father's Age is valid:"+ f.age);

          Son s=new Son(FatherAge,SonAge);
          System.out.println("Son's age is valid:"+ s.SonAge);
      }
      catch(WrongAge e){
          System.out.println(e.getMessage());
      }
   }
}

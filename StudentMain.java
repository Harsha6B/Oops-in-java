import java.util.*;
class Student{
     String USN;
     String name;
     int no_sub;
     int credits[];
     int marks[];

    void getd(){
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter USN: ");
      USN=scn.nextLine();
      System.out.println("Enter name: ");
      name=scn.nextLine();
      System.out.println("Enter number of subjects: ");
      no_sub=scn.nextInt();
      
      credits=new int[no_sub];
      marks=new int[no_sub];
      for(int i=0;i<no_sub;i++){
          System.out.println("Enter credits: ");
          credits[i]=scn.nextInt();
          System.out.println("Enter Mraks: ");
          marks[i]=scn.nextInt();
     }
  }
  
  void putd(){
       System.out.println("USN:" + USN);
       System.out.println("Name:"+name);
       System.out.println("Number of Subjects:" + no_sub);
       for(int i=0;i<no_sub;i++){
            System.out.println("Subject"+(i+1)+ ":"+"marks= "+ marks[i]+ "credits="+credits[i]);
       }
       double sgpa=cal_sgpa();
       System.out.println("SGPA:" + sgpa);
  }
  double cal_sgpa(){
       int total_credits=0;
       int total_points=0;
       for(int i=0;i<no_sub;i++){
            total_credits+=credits[i];
            int grade_p=gradepoints(marks[i]);
            total_points+=grade_p *credits[i];
      }
      return (double) total_points/total_credits;
 }
 
 int gradepoints(int marks){
     if(marks>=90) return 10;
     else if(marks>=80) return 9;
     else if(marks>=70) return 8;
     else if(marks>=60) return 7;
     else if(marks>=50) return 6;
     else if(marks>=40) return 5;
     else return 0;
  }
}

class StudentMain{
     public static void main(String[] args){
       Student s1=new Student();
       s1.getd();
       s1.putd();
    }
}



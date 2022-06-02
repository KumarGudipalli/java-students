package java_assign;

public class Assignmnet {
 private String name;
 private int age;
 private int marks;
 
 public String getName()
 {
   return name;	 
 }
 public int getAge()
 {
	 return age;
 }
 
 public void setName(String N) 
 {
	 this.name=N;
 }
 
 public void setAge(int a) {
	 if(a > 18 && a<60)
	 {
		 this.age=a;	 
	 }
	
 }
 public int getMarks()
 {
     	return marks; 
 }
 public void setMarks(int M)
 {
	 if(M>0 && M<500) {
		   this.marks=M;
	 }
 }

}

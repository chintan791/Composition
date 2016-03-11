import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CompositionBasics {
	
	static String nameOfSchool="";
public static void main(String[] args) {
	
Person bobby = new Person();
 
ArrayList<Education> schools = new ArrayList<Education>(); 

Scanner sc= new Scanner(System.in);

System.out.println("Enter 1st school: ");

nameOfSchool = sc.nextLine();

for (int i =1; i<4; i++)
{

Education s = new Education();
s.setNameOfSchool(nameOfSchool);
//s.setYears();
schools.add(s);
System.out.println("Enter school "+ i);
nameOfSchool = sc.nextLine();
}

bobby.setEducation(schools);
for (Education school:bobby.getEducation()){
System.out.println(school.getNameOfSchool());
}

Job engineer= new Job();
bobby.setJob(engineer);
bobby.getJob().setSalary(1000);;

bobby.getJob().setRole("Doc");

System.out.println(bobby.getJob().getSalary());

System.out.println(bobby.getJob().getRole());

    System.out.println(bobby.getEducation());

System.out.println(bobby.toString());
}
}

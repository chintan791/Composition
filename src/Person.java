import java.util.ArrayList;
import java.util.*;

public class Person {
//composition has-a relationship
private Job job;

private ArrayList<Education> education;

public Job getJob() {
	return job;
}
public void setJob(Job job) {
	this.job = job;
}


public ArrayList<Education> getEducation() {
	return education;
}
public void setEducation(ArrayList<Education> education) {
	this.education = education;
}

public String toString(){
	return (job.toString() + education.toString());
}



}
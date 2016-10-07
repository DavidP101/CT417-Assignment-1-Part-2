/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.ct417.maven.assignment.part;

import ie.nuigalway.ct417.maven.assignment.CourseProgramme;
import ie.nuigalway.ct417.maven.assignment.Module;
import ie.nuigalway.ct417.maven.assignment.Student;
import ie.nuigalway.ct417.maven.assignment.UniversityRegister;
import org.joda.time.DateTime;

/**
 *
 * @author David
 */
public class Test {

    
    public static void main(String args[]){
        
        //make some Students
        Student s1 = new Student("Tom", 21, 123, "02/03/92");
        Student s2 = new Student("Sarah", 22, 1234, "03/04/91");
        Student s3 = new Student("Jim", 23, 12345, "05/05/91");
        
        //make some Modules
        Module CT123 = new Module("Programming", "CT123");
        Module CT124 = new Module("Discrete Maths", "CT124");
        
        //Assign the students to the modules
        CT123.addStudent(s1);
        CT123.addStudent(s2);
        CT124.addStudent(s2);
        CT124.addStudent(s3);
        
        //specify a start and end date for courses
        DateTime startDate = new DateTime(2013, 9, 1, 9, 0);
        DateTime endDate = new DateTime(2017, 5, 26, 5, 0);
        
        //define a couple of courses
        CourseProgramme CSIT  = new CourseProgramme("CSIT", startDate, endDate);
        CourseProgramme Maths = new CourseProgramme("Maths", startDate, endDate);
        
        //add a module each to the courses
        CSIT.addModule(CT123);
        Maths.addModule(CT124);
        
        //define a list of courses i.e. university register
        UniversityRegister ur = new UniversityRegister();
        
        //add the courses to the university register
        ur.addCourse(CSIT);
        ur.addCourse(Maths);
        
        //print out courses, corresponding modules and students
        ur.printCoursesInformation();
    }
    
    
}

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
        Student s1 = new Student("Tom", 21, 123, "02/03/92");
        Student s2 = new Student("Sarah", 22, 1234, "03/04/91");
        Student s3 = new Student("Jim", 23, 12345, "05/05/91");
        
        Module CT123 = new Module("Programming", "CT123");
        Module CT124 = new Module("Discrete Maths", "CT124");
        
        CT123.addStudent(s1);
        CT123.addStudent(s2);
        CT124.addStudent(s2);
        CT124.addStudent(s3);
        DateTime startDate = new DateTime(2013, 9, 1, 9, 0);
        DateTime endDate = new DateTime(2017, 5, 26, 5, 0);
        CourseProgramme CSIT  = new CourseProgramme("CSIT", startDate, endDate);
        CourseProgramme Maths = new CourseProgramme("Maths", startDate, endDate);
        CSIT.addModule(CT123);
        Maths.addModule(CT124);
        UniversityRegister ur = new UniversityRegister();
        ur.addCourse(CSIT);
        ur.addCourse(Maths);
        ur.printCoursesInformation();
    }
    
    
}

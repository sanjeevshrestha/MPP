/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob2A;

/**
 *
 * @author 984970
 */
public class Student {

    private String name;
    private GradeReport grade;

    public Student() {
        this.grade = new GradeReport(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GradeReport getGrade() {
        return grade;
    }

    public void setGrade(GradeReport grade) {
        this.grade = grade;
    }
    
    public String toString()
    {
        return "Grade : "+this.grade;
    }

}

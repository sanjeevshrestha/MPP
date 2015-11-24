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
public class GradeReport{

    private Student student;
    
    public GradeReport(Student student)
    {
        this.student=student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}

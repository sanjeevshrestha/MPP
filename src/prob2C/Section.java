/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob2C;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 984970
 */
public class Section {

    private long sectionNum;

    private List<Student> students;

    public Section() {
        students = new ArrayList<>();
        
        Student std=new Student(this);
        students.add(std);
    }

    public long getSectionNum() {
        return sectionNum;
    }

    public void setSectionNum(long sectionNum) {
        this.sectionNum = sectionNum;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}

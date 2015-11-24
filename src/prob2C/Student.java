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
public class Student {

    private String name;
    private List<Section> sections;

    public Student() {
        sections = new ArrayList<>();
    }

    public Student(Section section) {
        sections = new ArrayList<>();
        this.sections.add(section);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

}

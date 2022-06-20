package Collections.sets;

import java.util.*;

class TeacherDetails
{
    private int sno,stuCapacity,TeacherClass,teachersal;
    private String teacherName,teacherPhnum;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getStuCapacity() {
        return stuCapacity;
    }

    public void setStuCapacity(int stuCapacity) {
        this.stuCapacity = stuCapacity;
    }

    public int getTeacherClass() {
        return TeacherClass;
    }

    public void setTeacherClass(int teacherClass) {
        TeacherClass = teacherClass;
    }

    public int getTeachersal() {
        return teachersal;
    }

    public void setTeachersal(int teachersal) {
        this.teachersal = teachersal;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherPhnum() {
        return teacherPhnum;
    }

    public void setTeacherPhnum(String teacherPhnum) {
        this.teacherPhnum = teacherPhnum;
    }

    public TeacherDetails(int sno,String teacherName,int teacherClass,int stuCapacity,  int teachersal,  String teacherPhnum) {
        this.sno = sno;
        this.stuCapacity = stuCapacity;
        this.TeacherClass = teacherClass;
        this.teachersal = teachersal;
        this.teacherName = teacherName;
        this.teacherPhnum = teacherPhnum;
    }

    @Override
    public String toString() {
        return "Teacher Sno = " + sno +" Strength  in a Class room  =" + stuCapacity +"  Teacher Dealing Class is ::" +
                TeacherClass + " Teacher Salary Per Month ::" + teachersal +" Teacher Name is :: '" + teacherName +
                " Teacher Phone number is =" + teacherPhnum ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeacherDetails)) return false;
        TeacherDetails that = (TeacherDetails) o;
        return getTeacherName().equals(that.getTeacherName()) && getTeacherPhnum().equals(that.getTeacherPhnum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTeacherName(), getTeacherPhnum());
    }
}
public class PracticeSet {
    public static void main(String[] args) {
        Map<Integer,TeacherDetails> mapteach = new HashMap<>();
        Set<TeacherDetails> setteach = new HashSet<>();
        TeacherDetails teach1 = new TeacherDetails(2001,"SWATHI",5,40,10000,"8466999045");
        TeacherDetails teach2 = new TeacherDetails(2002,"lavanya",3,30,8000,"8466999085");
        TeacherDetails teach3 = new TeacherDetails(2003,"SWAPNA",6,60,15000,"8466999095");
        mapteach.put(1,teach1);
        mapteach.put(2,teach2);
        mapteach.put(3,teach3);
        TeacherDetails print = mapteach.get(2);
        TeacherDetails print2 = mapteach.get(1);
        System.out.println(print.toString());
        System.out.println(print2.toString());
        TeacherDetails set1 = new TeacherDetails(2001,"SWATHI",5,40,10000,"8466999045");
        TeacherDetails set4 = new TeacherDetails(2001,"SWATHI",5,40,10000,"8466999045");
        TeacherDetails set2 = new TeacherDetails(2002,"lavanya",3,30,8000,"8466999085");
        TeacherDetails set3 = new TeacherDetails(2003,"SWAPNA",6,60,15000,"8466999095");
        TeacherDetails set5 = new TeacherDetails(2003,"SWAPNA",6,60,15000,"8466999095");
        setteach.add(set1);
        setteach.add(set2);
        setteach.add(set3);
        setteach.add(set4);
        setteach.add(set5);
        System.out.println("SIZE OF SET IS ::"+setteach.size());
        System.out.println(setteach.toString());


    }
}

package week17.workshop;

import java.util.ArrayList;
public class Runner {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();

        Student ayushObj = new Student("Ayush", "9876543210", "L1N1");
        Student rahulObj = new Student("Rahul", "9876543211", "L1M1");
        Student gauravObj = new Student("Gaurav", "9876543212", "L1N2");

        studentList.add(ayushObj);
        studentList.add(rahulObj);
        studentList.add(gauravObj);

        //before remove
        showStudentList(studentList);


        //remove
        for(Student st:studentList)
        {
            if(st.getName().equals("Gaurav"))
            {
                studentList.remove(st);
                break;
            }
        }

        //after remove
        showStudentList(studentList);



    }
    public static void showStudentList(ArrayList<Student> studentList)
    {
        for(Student st:studentList)
        {
            System.out.println(st.getName()+" "+st.getPhone()+" "+st.getGroup());
        }
        System.out.println();
    }
}

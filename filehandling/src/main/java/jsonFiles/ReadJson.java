package jsonFiles;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJson {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        File file = new File(System.getProperty("user.dir") + "\\data\\student.json");

        Student student = mapper.readValue(file, Student.class);

        System.out.println("Student id: " + student.getStudentId());
        System.out.println("Student first name: " + student.getName().getFirst() + " " + student.getName().getLast());
        System.out.println("Student age: " + student.getAge());
        System.out.println("Student department: " + student.getDepartment());
        System.out.println("Student Contact Details");
        System.out.println("Email: " + student.getContact().getEmail());
        System.out.println("Phone: " + student.getContact().getPhone());
        System.out.println("Student Address:");
        System.out.println("Street: " + student.getContact().getAddress().getStreet());
        System.out.println("City: " + student.getContact().getAddress().getCity());
        System.out.println("State: " + student.getContact().getAddress().getState());
        System.out.println("Postal Code: " + student.getContact().getAddress().getPostalCode());
        System.out.println("Courses:");
        for (Course course : student.getCourses()) {
            System.out.println("Course Code: " + course.getCourseCode());
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("-----");
        }
    }
}

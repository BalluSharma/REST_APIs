package net.javaguides.springboot_rest_api.controller;

import net.javaguides.springboot_rest_api.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    //http://localhost:8080/student
   @GetMapping("student")
    public ResponseEntity<Student> getStudent(){
        Student student = new Student(
          1,
          "Ballu",
          "Sharma"
        );
        //return new ResponseEntity<>(student,HttpStatus.OK);
     // return ResponseEntity.ok(student);
      return ResponseEntity.ok().header("custom-header","ramesh")
              .body(student);
   }

    //http://localhost:8080/students
     @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
       List<Student> students = new ArrayList<>();
       students.add(new Student(1,"Ballu","Sharma"));
         students.add(new Student(2,"Umesh","Sharma"));
         students.add(new Student(3,"ShyamBabu","Sharma"));
         students.add(new Student(4,"Narendra","Sharma"));
         students.add(new Student(5,"Thakurdas","Sharma"));
       return ResponseEntity.ok(students);
   }

   //spring boot rest api with path variable
    //{id}-URI template variable
    //http://localhost:8080/students/1/admin/administrator

    @GetMapping("{id}/{first-name}/{last-name}")
    public ResponseEntity<Student> studentPathVariable(@PathVariable("id") int studentId,
                                      @PathVariable("first-name") String firstname,@PathVariable("last-name") String lastname){
       Student student =  new Student(studentId,firstname,lastname);
       return ResponseEntity.ok(student);
   }

    //Spring boot REST API with Request Param
    // http://localhost:8080/students/query?id=1&firstName=Neha&lastName=Sharma   (Query parameter)

    @GetMapping("query")
    public ResponseEntity<Student> studentRequestVariable(@RequestParam int id,
                                         @RequestParam String firstName,@RequestParam String lastName){
       Student student =  new Student(id,firstName,lastName);
        return ResponseEntity.ok(student);
   }

    // Spring boot REST API that handle HTTP POST Request
    // @PostMapping and @RequestBody
    // https://localhost:8080/students/create
    @PostMapping("create")
    // @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstname());
        System.out.println(student.getLastname());
        return new ResponseEntity<>(student,HttpStatus.CREATED);
    }

    //Spring Boot REST API that handle HTTP PUT Request - updating existing resource
    @PutMapping("{id}/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id") int studentId){
        System.out.println(student.getFirstname());
        System.out.println(student.getLastname());
        return ResponseEntity.ok(student);
    }

    //Spring Boot REST API that handles HTTP DELETE request - deleting existing resource
    @DeleteMapping("{id}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId){
        System.out.println(studentId);
       return ResponseEntity.ok("Student deleted Successfully");
    }
}

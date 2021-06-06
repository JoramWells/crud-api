package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    public void addNewStudent(Student student){
        studentRepository.save(student);
    }

    public void deleteStudent(int id){
        boolean exists = studentRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException(
                    "Student with " + id + " not found"
            );
        }
        studentRepository.deleteById(id);
    }

    public void updateStudent(int id, String name, String email){
//        Student student = studentRepository.findById(id);
//            new IllegalStateException(
//                    "Student with " + id " not found"
//            );
//        })



    }
}

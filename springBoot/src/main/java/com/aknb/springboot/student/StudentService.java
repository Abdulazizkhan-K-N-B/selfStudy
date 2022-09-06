package com.aknb.springboot.student;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> optionalStudent = studentRepository.findStudentByEmail(student.getEmail());

        if (optionalStudent.isPresent()) {
            throw new IllegalStateException("email taken");
        }

        studentRepository.save(student);

        System.out.println(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exist = studentRepository.existsById(studentId);

        if (!exist) {
            throw new IllegalStateException(String.format("student with id %d doesn't exist", studentId));
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId,
                              String name,
                              String email) {
        Student student = studentRepository
                .findById(studentId)
                .orElseThrow(
                        () -> new IllegalStateException(
                                String.format("Student doesn't exist with this id: %d", studentId)
                        )
                );

        if (name != null
                && name.length() > 0
                && !Objects.equals(student.getName(), name)) {

            student.setName(name);
        }

        if (email != null
                && email.length() > 0
                && !Objects.equals(student.getEmail(), email)) {

            Optional<Student> optionalStudent = studentRepository.findStudentByEmail(email);

            if (optionalStudent.isPresent()){
                throw new IllegalStateException("This email already registered!");
            }
            student.setEmail(email);
        }

        studentRepository.save(student);
    }
}

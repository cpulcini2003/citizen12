package com.example.citizen;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Long> {
    // @Query("SELECT s FROM Student s WHERE s.email = ?1")
    //Optional<Student> findStudentByEmail(String email);
    // @Query("SELECT s FROM Student)
    //List<Student> findStudentsByEmail(String email);
}
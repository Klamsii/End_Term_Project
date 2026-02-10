package org.example.endterm_course_api.repository;

import org.example.endterm_course_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

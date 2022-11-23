package ru.ant.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ant.springbootcrud.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
}

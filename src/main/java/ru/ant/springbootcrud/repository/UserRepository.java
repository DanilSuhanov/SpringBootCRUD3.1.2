package ru.ant.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ant.springbootcrud.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

package eu.pontsystems.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.pontsystems.tutorial.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findById(int id);
}

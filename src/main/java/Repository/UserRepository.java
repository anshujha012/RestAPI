package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import model.User;

@RestResource(exported = false)
public interface UserRepository extends JpaRepository<User, String> {

}
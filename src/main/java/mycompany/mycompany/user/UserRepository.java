package mycompany.mycompany.user;

import org.apache.tomcat.jni.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}

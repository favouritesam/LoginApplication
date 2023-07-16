package figmaLoginApp.data.repository;

import figmaLoginApp.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface UserRepository extends MongoRepository<User,String> {

}

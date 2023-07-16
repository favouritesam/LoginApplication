package figmaLoginApp.utils;

import figmaLoginApp.data.models.User;
import figmaLoginApp.dto.request.RegisterUserRequest;
import figmaLoginApp.dto.response.RegisterUserResponse;
import org.apache.coyote.Response;

public class Mapper {
    public  static User map(RegisterUserRequest registerUserRequest){
        User user = new User();
        user.setUserName(registerUserRequest.getUserName());
        user.setPassword(registerUserRequest.getPassword());
        user.setEmail(registerUserRequest.getEmail());

        return user;
    }
    public  static RegisterUserResponse map(User user, RegisterUserResponse registerUserResponse){
        registerUserResponse.setPassword(user.getPassword());
        registerUserResponse.setUserName(user.getUserName());
        return registerUserResponse;

    }

}

package figmaLoginApp.service;

import figmaLoginApp.data.models.User;
import figmaLoginApp.data.repository.UserRepository;
import figmaLoginApp.dto.request.LoginRequest;
import figmaLoginApp.dto.request.RegisterUserRequest;
import figmaLoginApp.dto.response.LoginResponse;
import figmaLoginApp.dto.response.RegisterUserResponse;
import figmaLoginApp.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public RegisterUserResponse registerNewUser(RegisterUserRequest registerUserRequest) {

    User user = Mapper.map(registerUserRequest);
    User savedUser = userRepository.save(user);
    RegisterUserResponse registerUserResponse = new RegisterUserResponse();
    return Mapper.map(savedUser, registerUserResponse);
    }

    @Override
    public RegisterUserResponse login(LoginRequest loginRequest) {
        var userName = loginRequest.getUserName();
        var password = loginRequest.getPassword();

        List<User> users = userRepository.findAll();
        for (User user: users){
            if (user.getUserName().equals(userName)&& user.getPassword().equals(password));
            LoginResponse loginResponse = new LoginResponse();
            loginResponse.setSuccessful(true);
        }

        return null;
    }

    @Override
    public User findUser(String password) {
        return null;
    }
}

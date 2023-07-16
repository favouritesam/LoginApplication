package figmaLoginApp.service;


import figmaLoginApp.dto.request.RegisterUserRequest;
import figmaLoginApp.dto.response.RegisterUserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LoginUserServiceTest {


        @Autowired
        private UserService userService;


        @Test
        void register() {
            RegisterUserRequest user = new RegisterUserRequest();
            user.setUserName("favour");
            user.setEmail("johndoe@gmail.com");
            user.setPassword("chiChi11");
            RegisterUserResponse response =  userService.registerNewUser(user);

            assertEquals(user.getUserName(), response.getUserName());
            assertEquals(user.getPassword(),response.getPassword());
            assertEquals("registration successful", response.getMessage());
        }


    @Test
    void login() {
    }

    }

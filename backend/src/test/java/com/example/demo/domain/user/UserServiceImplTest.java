package com.example.demo.domain.user;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.demo.domain.helper.UserGeneratorHelper;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class UserServiceImplTest {
    @Captor
    ArgumentCaptor<User> userCaptor;
    @Spy
    @Autowired
    private UserService userService;
    @MockBean
    private UserRepository userRepository;

    @Disabled
    @Test
    @DisplayName("Test to get all Test user")
    void getAllUsers() {
        //Given
        List<User> expectedResult = UserGeneratorHelper.generateUserList();
        //When
        when(userRepository.findAll()).thenReturn(expectedResult);
        List<User> actualResult = userService.getAllUsers();
        //Then
        verify(userRepository, times(1)).findAll();
        assertThat(expectedResult).hasSameElementsAs(actualResult);
    }

    @Disabled
    @Test
    @DisplayName("Test to get Test user by Id")
    void getUserById() {

        UUID uuid = UUID.fromString("00000000-000-0000-0000-000000000001");
        //Given
        List<User> expectedResult = UserGeneratorHelper.generateUserList();
        //When
        when(userRepository.findById(uuid)).thenReturn(Optional.ofNullable(expectedResult.get(0)));
        User actualResult = userService.getUserById(uuid);
        //Then
        verify(userRepository, times(1)).findById(uuid);
        Assertions.assertEquals(expectedResult.get(0), actualResult);
    }
}

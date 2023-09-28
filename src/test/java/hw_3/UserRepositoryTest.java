package hw_3;

import hw_3.tdd.User;
import hw_3.tdd.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class UserRepositoryTest {

    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
    }

    @Test
    void findByName() {
        userRepository.addUsers();
        assertTrue(userRepository.findByName("user 1"));
        assertTrue(userRepository.findByName("user 5"));
    }

    @Test
    void addUsers() {
        userRepository.addUsers();
        UserRepository test = new UserRepository();
        assertNotEquals(userRepository, test);
    }
    @Test
    void usersCounterCheck() {
        userRepository.addUsers();
        assertThat(userRepository.data.size()).isEqualTo(7);
    }

    @Test
    void ksdgjs(){
        userRepository.data.add(new User("userTest1", "qwerty", true));
        userRepository.data.add(new User("userTest2", "qwerty", false));
        userRepository.kickOutNotAdmin();
        assertThat(userRepository.data.size()).isEqualTo(1);
    }
}
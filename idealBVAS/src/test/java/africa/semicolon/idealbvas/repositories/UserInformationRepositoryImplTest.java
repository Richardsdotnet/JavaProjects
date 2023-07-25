package africa.semicolon.idealbvas.repositories;

import africa.semicolon.idealbvas.models.UserInformation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserInformationRepositoryImplTest {
    private final UserInformationRepository userInformationRepository = new UserInformationRepositoryImpl();
    private UserInformation savedUserInformation;
    @BeforeEach
    void setUp(){
        savedUserInformation  = userInformationRepository.save(new UserInformation());
    }

    @Test
    void findByIdTest(){
        UserInformation foundUserInformation = userInformationRepository.findById(savedUserInformation.getId());
        assertNotNull(foundUserInformation);
    }

    @Test
    void findAllTest(){
        List<UserInformation> userInformationCollection = userInformationRepository.findAll();
        assertEquals(1, userInformationCollection.size());
    }
    @Test
    void saveTest(){
        assertNotNull(savedUserInformation);
        assertNotNull(savedUserInformation.getId());
    }
    @Test
    void deleteByIdTest(){
        userInformationRepository.deleteById(savedUserInformation.getId());
        assertEquals(0,userInformationRepository.findAll().size());
    }
}

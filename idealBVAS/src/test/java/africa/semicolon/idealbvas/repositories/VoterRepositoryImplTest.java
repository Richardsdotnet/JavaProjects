package africa.semicolon.idealbvas.repositories;

import africa.semicolon.idealbvas.models.Gender;
import africa.semicolon.idealbvas.models.Voter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VoterRepositoryImplTest {

    private final VoterRepository voterRepository = new VoterRepositoryImpl();
    private Voter savedVoter;

    @BeforeEach
    public void setUp(){
        Voter voter = buildTestVoter();
        savedVoter = voterRepository.save(voter);
    }

    @Test
    public void testSaveVoter(){
        assertNotNull(savedVoter);
        assertNotNull(savedVoter.getId());
    }

    @Test
    public void testFindById(){
        Voter foundVoter = voterRepository.findById(savedVoter.getId());
        assertNotNull(foundVoter);
    }
    @Test
    private Voter buildTestVoter(){
        Voter voter = new Voter();
        voter.setName("Jane Doe");
        voter.setAge(20);
        voter.setGender(Gender.FEMALE);
        return voter;
    }
    @Test
    public void testFindAllVoters(){
        Voter secondVoter = new Voter();
        Voter thirdVoter = new Voter();
        voterRepository.save(secondVoter);
        voterRepository.save(thirdVoter);
        List<Voter> voters = voterRepository.findAll();
        assertEquals(3, voters.size());
        assertNotNull(voters.get(0));
        assertNotNull(voters.get(1));
        assertNotNull(voters.get(2));
    }

    @Test
    public void testDeleteById(){
        Voter secondVoter = new Voter();
        Voter secondSavedVoter = voterRepository.save(secondVoter);
        List<Voter> voters = voterRepository.findAll();
        assertEquals(2,voters.size());
        voterRepository.deleteById(secondSavedVoter.getId());
        voters = voterRepository.findAll();
        assertEquals(1,voters.size());
    }
}
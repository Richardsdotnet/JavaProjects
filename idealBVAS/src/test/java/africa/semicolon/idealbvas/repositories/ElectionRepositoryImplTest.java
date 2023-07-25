package africa.semicolon.idealbvas.repositories;


import africa.semicolon.idealbvas.models.Election;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ElectionRepositoryImplTest {
    private final ElectionRepository electionRepository = new ElectionRepositoryImpl();
    private Election savedElection;

    @BeforeEach
    void setUp(){
        savedElection = electionRepository.save(new Election());
    }

    @Test
    void findByIdTest(){
        var foundElection = electionRepository.findById(savedElection.getId());
        assertNotNull(foundElection);
    }

    @Test
    void findAllTest(){
        assertEquals(1,electionRepository.findAll().size());
    }

    @Test
    void saveTest(){
        assertNotNull(savedElection);
    }

    @Test
    void deleteByIdTest(){
        electionRepository.deleteById(savedElection.getId());
        assertEquals(0, electionRepository.findAll().size());
    }
}

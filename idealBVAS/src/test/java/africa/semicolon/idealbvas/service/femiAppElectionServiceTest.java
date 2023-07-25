package africa.semicolon.idealbvas.service;

import africa.semicolon.idealbvas.dto.request.CreateElectionRequest;
import africa.semicolon.idealbvas.dto.response.CreateElectionResponse;
import africa.semicolon.idealbvas.services.ElectionService;
import africa.semicolon.idealbvas.services.femiAppElectionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class femiAppElectionServiceTest {
    private final ElectionService electionService = new femiAppElectionService();

    @BeforeEach
    void setUp(){

    }

    @Test
    void createElectionTest(){
        CreateElectionRequest createElectionRequest = new CreateElectionRequest();
        createElectionRequest.setElectionCategory("GUBERNATORIAL");
        createElectionRequest.setElectionDate("2023-02-25");
        List<String> parties = getParties();
        createElectionRequest.setParties(parties);
        List<String> states = getStates();
        createElectionRequest.setStates(states);
        CreateElectionResponse createElectionResponse = electionService.create(createElectionRequest);
        assertNotNull(createElectionResponse);
    }

    private List<String> getStates() {
        List<String> states = new ArrayList<>();
        states.add("PDP");
        states.add("APC");
        states.add("TOWNHALL");
        states.add("LP");
        return states;
    }

    private List<String> getParties() {
        List<String> parties = new ArrayList<>();
        parties.add("PDP");
        parties.add("APC");
        parties.add("TOWNHALL");
        parties.add("LP");
        return parties;
    }

    @Test
    private void getAllElectionsTest(){

    }
}

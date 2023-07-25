package africa.semicolon.idealbvas.repositories;

import africa.semicolon.idealbvas.models.Party;
import africa.semicolon.idealbvas.models.UserInformation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartyRepositoryImplTest {
    private final PartyRepository partyRepository = new PartyRepositoryImpl();
    private Party savedParty;

    @BeforeEach
    public void setUp(){
        Party party = new Party();
        savedParty = partyRepository.save(party);
    }

    @Test
    public void testSaveParty(){
        assertNotNull(savedParty);
    }
    @Test
    public void testFindById(){
        Party foundVoter = partyRepository.findById(savedParty.getId());
        assertNotNull(foundVoter);
    }
    @Test
    private Party buildTestVoter(){
        Party party = new Party();
        UserInformation userInformation = new UserInformation();
        party.setUserInformation(userInformation);
        return party;
    }
    @Test
    public void testFindAllVoters(){
        Party secondParty = new Party();
        Party thirdParty = new Party();
        partyRepository.save(secondParty);
        partyRepository.save(thirdParty);
        List<Party> parties = partyRepository.findAll();
        assertEquals(3, parties.size());
        assertNotNull(parties.get(0));
        assertNotNull(parties.get(1));
        assertNotNull(parties.get(2));
    }

    @Test
    public void testDeleteById(){
        Party secondParty = new Party();
        Party secondSavedParty = partyRepository.save(secondParty);
        List<Party> parties = partyRepository.findAll();
        assertEquals(2,parties.size());
        partyRepository.deleteById(secondSavedParty.getId());
        parties = partyRepository.findAll();
        assertEquals(1,parties.size());
    }

    @Test
    public void testFindByName(){
        Party party = new Party();
        party.setName("PDP");
        partyRepository.save(party);
        Party foundParty = partyRepository.findByName("PDP");
        assertNotNull(foundParty);
    }
}
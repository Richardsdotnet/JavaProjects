package africa.semicolon.idealbvas.service;
import africa.semicolon.idealbvas.dto.request.PartyRegistrationRequest;
import africa.semicolon.idealbvas.dto.response.PartyRegistrationResponse;
import africa.semicolon.idealbvas.exceptions.PartyRegistrationException;
import africa.semicolon.idealbvas.exceptions.VoterRegistrationException;
import africa.semicolon.idealbvas.services.PartyService;
import africa.semicolon.idealbvas.services.femiAppPartyService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class femiAppPartyServiceTest {
    private  final PartyService partyService = new femiAppPartyService();

    @Test
    void partyRegistrationTest(){
        PartyRegistrationRequest partyRegistrationRequest = new PartyRegistrationRequest();
        partyRegistrationRequest.setUsername("ugbo");
        partyRegistrationRequest.setPassword("me12355");

        try {
            PartyRegistrationResponse partyRegistrationResponse = partyService.register(partyRegistrationRequest);
            assertNotNull(partyRegistrationResponse);
        }catch (PartyRegistrationException | VoterRegistrationException exception){
            System.out.println(exception);
        }
    }
}
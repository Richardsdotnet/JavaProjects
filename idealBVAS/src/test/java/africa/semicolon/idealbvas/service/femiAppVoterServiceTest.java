package africa.semicolon.idealbvas.service;
import africa.semicolon.idealbvas.dto.request.VoterRegistrationRequest;
import africa.semicolon.idealbvas.dto.response.VoterRegistrationResponse;
import africa.semicolon.idealbvas.exceptions.VoterRegistrationException;
import africa.semicolon.idealbvas.services.VoterService;
import africa.semicolon.idealbvas.services.femiAppVoterService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class femiAppVoterServiceTest {

    private final VoterService voterService = new femiAppVoterService();
    @BeforeEach
    void setUp(){

    }

    @Test
    void registerTest() throws VoterRegistrationException {
        VoterRegistrationRequest registrationRequest = new VoterRegistrationRequest();
        registrationRequest.setAge(100);
        registrationRequest.setName("sherriff");
        registrationRequest.setLga("townHall");
        registrationRequest.setGender("OTHERS");
        registrationRequest.setUserName("vawulence123@sheriff.com");
        registrationRequest.setPassword("idan123");
        registrationRequest.setState("Idan");
        registrationRequest.setTown("Sabo");
        registrationRequest.setStreet("Iyana");
        registrationRequest.setHouseNumber("4");

       try{
           VoterRegistrationResponse registrationResponse = voterService.register(registrationRequest);
           assertNotNull(registrationResponse);
           assertNotNull(registrationResponse.getVotersIdentificationNumber());
       }catch (VoterRegistrationException exception){
           System.out.println(exception);
       }
    }
}
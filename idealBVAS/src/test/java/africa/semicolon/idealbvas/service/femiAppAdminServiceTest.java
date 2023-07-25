package africa.semicolon.idealbvas.service;

import africa.semicolon.idealbvas.dto.request.AdminRegistrationRequest;
import africa.semicolon.idealbvas.dto.response.AdminRegistrationResponse;
import africa.semicolon.idealbvas.exceptions.AdminRegistrationException;
import africa.semicolon.idealbvas.services.AdminService;
import africa.semicolon.idealbvas.services.femiAppAdminService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class femiAppAdminServiceTest {
    private final AdminService adminService = new femiAppAdminService();


    @Test
    void partyRegistrationTest(){
        AdminRegistrationRequest adminRegistrationRequest = new AdminRegistrationRequest();
        adminRegistrationRequest.setUsername("ugbo");
        adminRegistrationRequest.setPassword("me12355");

        try {
            AdminRegistrationResponse adminRegistrationResponse = adminService.register(adminRegistrationRequest);
            assertNotNull(adminRegistrationResponse);
        } catch (AdminRegistrationException e) {
            System.out.println(e);
        }
    }
}
package africa.semicolon.idealbvas.repositories;

import africa.semicolon.idealbvas.models.Address;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddressRepositoryImplTest {

    private final AddressRepository addressRepository = new AddressRepositoryImpl();
    private Address savedAddress;

    @BeforeEach
    public void setUp(){
        Address address = buildAddressTest();
        savedAddress = addressRepository.save(address);
    }
    @Test
    private Address buildAddressTest() {
        Address address = new Address();
        address.setHouseNumber("3");
        address.setState("Abia");
        address.setTown("Aba");
        return address;
    }

    @Test
    public void testSaveAddress(){
        assertNotNull(savedAddress);
        assertNotNull(savedAddress.getId());
    }

    @Test
    public void testFindById(){
        Address foundAddress = addressRepository.findById(savedAddress.getId());
        assertNotNull(foundAddress);
    }

    @Test
    public void testFindAllVoters(){
        Address secondAddress = new Address();
        Address thirdAddress = new Address();
        addressRepository.save(secondAddress);
        addressRepository.save(thirdAddress);
        List<Address> addresses = addressRepository.findAll();
        assertEquals(3, addresses.size());
    }

    @Test
    public void testDeleteById(){
        Address secondAddress = new Address();
        Address secondSavedAddress = addressRepository.save(secondAddress);
        List<Address> addresses = addressRepository.findAll();
        assertEquals(2, addresses.size());
        addressRepository.deleteById(secondSavedAddress.getId());
        addresses = addressRepository.findAll();
        assertEquals(1,addresses.size());
    }
}
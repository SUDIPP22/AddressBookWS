package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookServiceTest {
    @Test
    void givenPersonDetails_WhenChecked_ShouldReturnTrue() {
        AddressBookService addressBookService = new AddressBookService();
        boolean result = addressBookService.validateName("Sudip");
        Assertions.assertTrue(result);
    }
}

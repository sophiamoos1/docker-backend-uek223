package com.example.demo.domain.myListEntry;

import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@Disabled
@DataJpaTest
class MyListEntryRepositoryTest {
    public MyListEntryRepository getRepository() {
        return repository;
    }

    public void setRepository(MyListEntryRepository repository) {
        this.repository = repository;
    }

    @Autowired
    MyListEntryRepository repository;

    @Disabled
    @Test
    void findByInexistingId() {
        UUID id = UUID.fromString("88c68380-b97d-4921-ab2f-baec181b1006");
        Optional<MyListEntry> listEntry = repository.findById(id);
        Assertions.assertTrue(!listEntry.isPresent());
    }
}

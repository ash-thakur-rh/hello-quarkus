package org.ashish.service;

import org.ashish.dto.PersonDTO;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;
import java.util.Optional;

@ApplicationScoped
public class PersonService {

    public Optional<PersonDTO> getPersonByName(String name) {
        // Return a person only if the name is "John"
        if ("John".equalsIgnoreCase(name)) {
            return Optional.of(new PersonDTO("John", LocalDateTime.now()));
        }
        return Optional.empty();
    }
}

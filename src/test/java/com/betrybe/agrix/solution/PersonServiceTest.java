package com.betrybe.agrix.solution;

import com.betrybe.agrix.ebytr.staff.entity.Person;
import com.betrybe.agrix.ebytr.staff.exception.PersonNotFoundException;
import com.betrybe.agrix.ebytr.staff.repository.PersonRepository;
import com.betrybe.agrix.ebytr.staff.service.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PersonServiceTest {

	@Mock
	private PersonRepository personRepository;

	@InjectMocks
	private PersonService personService;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testGetPersonById() {
      Person mockPerson = new Person();
      when(personRepository.findById(1L)).thenReturn(Optional.of(mockPerson));

      Person result = personService.getPersonById(1L);

      assertEquals(mockPerson, result);
	}

	@Test
	public void testGetPersonByIdNotFound() {
      when(personRepository.findById(1L)).thenReturn(Optional.empty());

      assertThrows(PersonNotFoundException.class, () -> personService.getPersonById(1L));
	}

	@Test
	public void testGetPersonByUserName() {
      Person mockPerson = new Person();
      when(personRepository.findByUsername("testUser")).thenReturn(Optional.of(mockPerson));

      Person result = personService.getPersonByUsername("testUser");

      assertEquals(mockPerson, result);
	}

	@Test
	public void testGetPersonByUserNameNotFound() {
      when(personRepository.findByUsername("testUser")).thenReturn(Optional.empty());

      assertThrows(PersonNotFoundException.class, () -> personService.getPersonByUsername("testUser"));
	}

	@Test
	public void testCreatePerson() {
      Person mockPerson = new Person();
      when(personRepository.save(any())).thenReturn(mockPerson);

      Person result = personService.create(new Person());

      assertEquals(mockPerson, result);
	}
}

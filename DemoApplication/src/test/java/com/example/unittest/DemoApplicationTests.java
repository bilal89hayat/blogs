package com.example.unittest;

import com.example.unittest.model.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.unittest.repository.PersonRepository;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Test
	public void should_get_h2_db_records() {

		Person personActual = personRepository.save(new Person("Bilal"));

        Optional<Person> expected = personRepository.findById(personActual.getId());
		System.out.println("name is :" + expected.get().getName());
		Assert.assertEquals(personActual.getName(),expected.get().getName());
	}

}

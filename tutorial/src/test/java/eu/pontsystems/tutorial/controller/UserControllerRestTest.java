package eu.pontsystems.tutorial.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(value=UserControllerRest.class)
class UserControllerRestTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UserControllerRest ucr;
	
	//Teszteli hogy a visszakapott érték egy Json objektum
	@Test
	public void testKiirReturn() throws Exception {
		
		
		String uri="/api/kiir";
		
		RequestBuilder requestBuilder=MockMvcRequestBuilders.get(uri).contentType(MediaType.APPLICATION_JSON);
		mockMvc.perform(requestBuilder).andExpect(status().isOk()).andExpect(content().contentType("application/json"));
		
	}
	
	//Teszteli hogy a visszakapott HTTP státusz 200-as (ok)
	@Test
	public void testMentesStatus() throws Exception {
		
		String uri="/api/mentes";
		
		RequestBuilder requestBuilder=MockMvcRequestBuilders.post(uri).param("name", "Judit").param("age", "12").param("email", "aa@bb.hu");
		mockMvc.perform(requestBuilder).andExpect(status().isOk());
		
	}

}

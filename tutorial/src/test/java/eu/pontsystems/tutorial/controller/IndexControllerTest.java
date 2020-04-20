package eu.pontsystems.tutorial.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(value=IndexController.class)
class IndexControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private IndexController ic;
	
	//Teszteli hogy a megfelelő view-ot adja-e vissza
	@Test
	void testIndexView() throws Exception{
		
		String uri="/index";
		
		RequestBuilder requestBuilder=MockMvcRequestBuilders.get(uri);
		
		String result=mockMvc.perform(requestBuilder).andReturn().getModelAndView().getViewName();
		System.out.println("view "+result);
		assertEquals("index", result);
		
//		assertEquals("index", response);
	}

}

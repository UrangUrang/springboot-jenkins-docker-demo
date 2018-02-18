package com.urang.dockerplay;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class DockerplayControllerTest {

  private MockMvc mockMvc;

  @Before
  public void setUp() {
    mockMvc = MockMvcBuilders
        .standaloneSetup(new DockerplayController())
          .build();
  }

  @Test
  public void index_ShowView() throws Exception {
    mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(
        view().name("index"));
  }

  @Test
  public void index_CanWork() {
    // setup:
    DockerplayController controller = new DockerplayController();
    String expected = "index";

    // when:
    String actual = controller.index();

    // then:
    assertTrue(actual.equals(expected));
  }

}

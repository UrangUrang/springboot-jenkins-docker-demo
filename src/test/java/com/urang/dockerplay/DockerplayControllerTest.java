package com.urang.dockerplay;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DockerplayControllerTest {

  @Test
  public void index_CanWork() {
    // setup:
    DockerplayController controller = new DockerplayController();
    String expected = "Hello World!!!!!";

    // when:
    String actual = controller.index();

    // then:
    assertTrue(actual.equals(expected));
  }

}

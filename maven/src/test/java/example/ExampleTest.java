package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

  @Test
  public void testJoin() {
    Assertions.assertEquals("Solutions team", Example.join("Solutions", "team"));
  }

}

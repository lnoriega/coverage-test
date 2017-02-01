import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by luisnoriega on 2/1/17.
 */
public class HelloServiceTest {


    @Test
    public void shouldSayHello() throws Exception {
        HelloService helloService = new HelloService();
        assertThat(helloService.sayHello(), is("hello"));
    }

}
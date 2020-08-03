import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void  sayhi_should_return_hello_world(){
        HelloWorld h = new HelloWorld();
        String result = h.sayhi();
        assertEquals("Hello ",result);
    }
    @Test
    public void  sayhi_with_phatthanan_should_return_hello_world(){
        HelloWorld h = new HelloWorld();
        String result = h.sayhi("Phatthanan");
        assertEquals("Hello Phatthanan",result);
    }
    @Test
    public void  sayhi_with_kanun_should_return_hello_world(){
        HelloWorld h = new HelloWorld();
        String result = h.sayhi("Kanun");
        assertEquals("Hello Kanun",result);
    }

}
import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {
    @Test
    public void create_new_buffer_should_empty(){
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue("Buffer not empty",result);
    }
    @Test
    public void create_new_buffer_with_default_size_should_10(){
        CircularBuffer cb = new CircularBuffer();
        for(int i=0;i<10;i++){
            cb.writeData("A"+i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer not emoty naja ", result);
    }
    @Test
    public void write_A_to_buffer_should_read_A(){
        CircularBuffer cb  = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A" , cb.readData());
        assertEquals("B" , cb.readData());
    }
}
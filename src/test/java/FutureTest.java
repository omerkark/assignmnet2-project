import bgu.spl.mics.Future;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FutureTest {

    private Future<Object> future;
    private Object o;

    @Before
    public void setUp() throws Exception {
        future = new Future();

    }

    @Test
    public void get() {
        future.get();

    }

    @Test
    public void resolve() {
    }

    @Test
    public void isDone() {
    }

    @Test
    public void get1() {
    }
}
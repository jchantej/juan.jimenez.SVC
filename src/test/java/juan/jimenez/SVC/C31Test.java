package juan.jimenez.SVC;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class C31Test {
    private C31 c31;

    @Test
    public void testC31m1() {
        c31 = new C31();
        assertEquals("m1" ,c31.m1());
    }
    
    @Test
    public void testC31m2() {
        c31 = new C31();
        assertEquals("m2" ,c31.m2());
    }
    
    @Test
    public void testC31mB() {
        c31 = new C31();
        assertEquals("mB" ,c31.mB());
    }


}

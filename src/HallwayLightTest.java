import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class HallwayLightTest {
    HallwayLight test0, test1, test2;
    @BeforeEach
    void setUp() {
        test0 = new HallwayLight();
        test1 = new HallwayLight(1,1);
        test2 = new HallwayLight(1,0);
    }

    @Test
    void Test0() {
        test0.toggleFirstSwitch();
        test0.toggleFirstSwitch();
        test0.toggleSecondSwitch();
        assertEquals(1, test0.getLampState());
    }

    @Test
    void test1() {
        test1.toggleFirstSwitch();
        assertEquals(1,test1.getLampState());
    }

    @Test
    void test2() {
        test2.toggleFirstSwitch();
        assertEquals(0,test2.getLampState());
    }
}
import com.lemon.wifibar.Liquid;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class LiquidTest {

    Liquid v1 = new Liquid(new BigDecimal("2"),new BigDecimal("100"));
    Liquid v2 = new Liquid(new BigDecimal("3"),new BigDecimal("0"));
    Liquid v3 = new Liquid(new BigDecimal("5"),new BigDecimal("50"));


    @Test
    public void test1(){
        v2.mix(v1);
        assertEquals(v2.getAlcoholic(),new BigDecimal("40"));
        assertEquals(v1.getVolume(),new BigDecimal("0"));
        assertEquals(v2.getVolume(), new BigDecimal("5"));
    }

    @Test
    public void test2(){
        v1.mix(v2);
        v1.mix(v3);

        assertEquals(v1.getAlcoholic(),new BigDecimal("45"));
        assertEquals(v1.getVolume(),new BigDecimal("10"));
        assertEquals(v2.getVolume(), new BigDecimal("0"));
        assertEquals(v3.getVolume(), new BigDecimal("0"));

    }

    @Test
    public void getterSetter(){
        v1.setVolume(new BigDecimal("1"));
        assertEquals(v1.getVolume(),new BigDecimal("1"));

    }
}

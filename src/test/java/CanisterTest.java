import com.lemon.wifibar.Canister;
import com.lemon.wifibar.Liquid;
import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;


public class CanisterTest {
    BigDecimal c1 = new BigDecimal("3");
    BigDecimal c2 = new BigDecimal("5");
    Liquid v1 = new Liquid(BigDecimal.valueOf(Double.MAX_VALUE),new BigDecimal("100"));
    Liquid v2 = new Liquid(BigDecimal.valueOf(Double.MAX_VALUE),new BigDecimal("0"));

    Canister canister3 = new Canister(c1,new Liquid(new BigDecimal("0"),new BigDecimal("0")));
    Canister canister5 = new Canister(c2,new Liquid(new BigDecimal("0"),new BigDecimal("0")));

    @Test
    public void test1(){
        canister3.append(v2);
        canister5.transfuse(canister3);
        canister3.append(v1);
        canister5.transfuse(canister3);
        canister3.pourOut();
        canister3.transfuse(canister5);
        canister5.pourOut();


        assertEquals(canister3.getLiquid().getVolume(), new BigDecimal("3"));
        assertEquals(canister5.getLiquid().getVolume(), new BigDecimal("0"));
        assertEquals(canister3.getLiquid().getAlcoholic(), new BigDecimal("40"));


    }
}

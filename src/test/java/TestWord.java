import org.junit.Assert;
import org.junit.Test;

public class TestWord {

    @Test
    public void checkWordEntered(){
        String word = "fluff";
        Assert.assertEquals("fluff", word);
    }
}

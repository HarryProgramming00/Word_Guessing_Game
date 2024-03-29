import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;

public class TestWord {

    @Test
    public void checkWordEntered(){
        String word = "fluff";
        Assert.assertEquals("fluff", word);
    }

    @Test
    public void getWord(){

        String word = "Hello";

        int wordLength = word.length();

        Assert.assertEquals(5, wordLength);
    }
}



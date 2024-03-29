import javax.swing.*;

public class UserInput {

    static String getWord(){
        String word;

        do {
            word = JOptionPane.showInputDialog("Please input a five letter word to try");
        }while(word.length() != 5);

        return word;
    }
}

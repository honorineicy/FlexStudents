import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Students {
    public static void main(String[] args) {
        List<String> Students = new ArrayList<>();
        Students.add("Michou");
        Students.add("Jane");
        Students.add("Mimi");
        Students.add("Nana");
        Students.add("Jojo");
        Students.add("Lily");
        Students.add("Nono");
        Students.add("Toto");
        Students.add("Cicy");

        int randomIndex = (int)(Math.random()*Students.size());
        JOptionPane.showMessageDialog(null, Students.get(randomIndex));
    }

}


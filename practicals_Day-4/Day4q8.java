import java.io.*;
import java.util.EnumSet;
enum Color {
    RED, GREEN, BLUE, YELLOW, ORANGE
}
public class Day4q8 {
    public static void main(String[] args) {
        EnumSet<Color> originalSet = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
        System.out.println("Original EnumSet: " + originalSet);
        EnumSet<Color> complementSet = EnumSet.complementOf(originalSet);
        System.out.println("Complement of the EnumSet: " + complementSet);
        EnumSet<Color> subSet = EnumSet.range(Color.GREEN, Color.BLUE);
        System.out.println("SubSet of the EnumSet: " + subSet);
        EnumSet<Color> superSet = EnumSet.allOf(Color.class);
        superSet.removeAll(originalSet);
        System.out.println("SuperSet of the EnumSet: " + superSet);
        Color[] colorsArray = {Color.RED, Color.GREEN, Color.BLUE};
        EnumSet<Color> enumSetFromArray = EnumSet.noneOf(Color.class);
        for (Color color : colorsArray) {
            enumSetFromArray.add(color);
        }
        System.out.println("EnumSet from array: " + enumSetFromArray);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("enumSet.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(originalSet);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("EnumSet serialized successfully.");
            FileInputStream fileInputStream = new FileInputStream("enumSet.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            EnumSet<Color> deserializedSet = (EnumSet<Color>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("EnumSet deserialized successfully: " + deserializedSet);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

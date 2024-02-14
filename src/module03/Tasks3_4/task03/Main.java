package module03.Tasks3_4.task03;

import java.io.*;

public class Main {
    private static final String FILENAME = "src/module03/Tasks3_4/task03/enrollments.ser";
    public static void main(String[] args) {
        Enrollment enrollment = new Enrollment();

        File f = new File(FILENAME);

        if (f.exists() && f.isFile()) {
            try (
                    FileInputStream inputStream = new FileInputStream(FILENAME);
                    ObjectInputStream objects = new ObjectInputStream(inputStream);
                    ){
                enrollment = (Enrollment) objects.readObject();

            }catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            Student student = new Student("Jafar", 25);
            Course course = new Course("SLC000", "Spanish Language", "Eduardo");
            enrollment = new Enrollment(student,course,"07.02.2024");

            try (
                    FileOutputStream inputStream = new FileOutputStream(FILENAME);
                    ObjectOutputStream objects = new ObjectOutputStream(inputStream);
            ){
                objects.writeObject(enrollment);

            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println();
    }
}

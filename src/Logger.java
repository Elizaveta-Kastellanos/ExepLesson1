import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    public static void WriteFile(Person person) throws IOException {
        String file = person.getFirstname() + ".txt";
        boolean check = new File(file).exists();
        try(FileWriter fw = new FileWriter(file, check)){
            StringBuilder sb = new StringBuilder(person.getFirstname() + " " + person.getLastname() + " "
                    + person.getPatronymic() + " " + person.getBirthday() + " " + person.getPhoneNumber() + " "
                    + person.getGender());
            fw.write(sb.toString() + "\n");
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

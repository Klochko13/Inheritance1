//import java.io.File;
//import java.io.IOException;
//import java.io.FileWriter;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        Specialist leo = new Specialist("Rosenberg", "Ken", 35, "Lower", "Vice", 35, 22, "Get money", 3);
//        Human[] group = new Human[]
//                {
//                        new Student("Pinlman", "Jessie", 25, "Chemistry", "WW_22", 90, 95),
//                        new Teacher("Pinl", "Jes", 25, "Chemistry", 50),
//                        new Graduate("Shreder", "Hank", 40, "Criminalistik", "OBN", 50, 70, "How"),
//                        new Specialist("Versetti", "Tommy", 30, "Theft", "Vice", 98, 99, "Get money back", 5),
//                        new Teacher("Diaz", "Ricardo", 50, "Weapons disrtibution", 250),
//                        leo
//                };
//        //Override методы выполняют Specialization
//        for (int i = 0; i < group.length; i++) {
//            System.out.println(group[i]);
//        }
//
//        File file = new File("group.txt"); //создание файла с именем group
//        System.out.println(file.getAbsolutePath());
//        file.delete();
//        file.createNewFile();
//
//        if (file.createNewFile()) //тут уже создается физический файл
//        {
//            System.out.println("File created");
//        }
//        else
//        {
//            System.out.println("File exists");
//        }
////записать что-то в файл
//        FileWriter writer = new FileWriter(file);
//
//        for(int i =0; i < group.length; i++)
//        {
//            writer.write(group[i].toString() + "\n");
//            writer.write(group[i].toString());
//            writer.write ("\n");
//        }
//        writer.close(); //потоки обязательно нужно закрывать
//    }
//}
// */
         import java.io.BufferedReader;
         import java.io.FileReader;
         import java.io.IOException;
         import java.util.ArrayList;
         import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> groups = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("DZ28.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                String type = parts[0];
                String lastName = parts[1];
                String firstName = parts[2];
                int age = Integer.parseInt(parts[3]);
                String speciality;
                String group;
                int rating;
                int attendance;
                String subject;
                switch (type) {
                    case "Student":
                        speciality = parts[4];
                        group = parts[5];
                        rating = Integer.parseInt(parts[6]);
                        attendance = Integer.parseInt(parts[7]);
                        groups.add(new Student(lastName, firstName, age, speciality, group, rating, attendance));
                        break;
                    case "Teacher":
                        speciality = parts[4];
                        int experience= Integer.parseInt(parts[5]);
                        groups.add(new Teacher(lastName, firstName, age, speciality, experience));
                        break;
                    case "Graduate":
                        speciality = parts[4];
                        group= parts[5];
                        rating= Integer.parseInt(parts[6]);
                        attendance= Integer.parseInt(parts[7]);
                        subject = parts[8];
                        groups.add(new Graduate(lastName, firstName, age, speciality, group, rating, attendance, subject));
                        break;
                    case "Specialist":
                        speciality = parts[4];
                        group = parts[5];
                        rating= Integer.parseInt(parts[6]);
                        attendance= Integer.parseInt(parts[7]);
                        subject = parts[8];
                        int grade = Integer.parseInt(parts[9]);
                        groups.add(new Specialist(lastName, firstName, age, speciality, group, rating, attendance, subject, grade));
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
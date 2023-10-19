import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        //Inheritance:
        /*Human tommy = new Human("Vercetti", "Tomas", 30);
        System.out.println(tommy);

        Student student = new Student("Pinkman", "Jessie", 25, "Chemistry", "WW_220", 90, 95);
        System.out.println(student);

        Teacher teacher = new Teacher("White", "Walter", 50, "Chemistry", 25);
        System.out.println(teacher);

        Graduate graduate = new Graduate(
                        "Schreder", "Hank", 40,
                        "Criminalistic", "OBN", 70, 50,
                        "How to catch Heisenberg"
                        );
        System.out.println(graduate);

        Student student1 = new Student(tommy, "Theft", "Vice", 90, 98);
        System.out.println(student1);

        Specialist hank = new Specialist(graduate, 3);
        System.out.println(hank);*/

        //Polymorphism:
        //Ad-hoc polymorphism

        //upcast - преобразование дочернего объекта в базовый.
        //Generalisation - обобщение объектов.
//        Specialist leo = new Specialist("Rosenberg", "Ken", 35, "Lower", "Vice", 35, 22, "Get money", 3);
//        Human[] group = new Human[]
//                {
//                        new Student("Pinkman", "Jessie", 25, "Chemistry", "WW_220", 90, 95),
//                        new Teacher("White", "Walter", 50, "Chemistry", 25),
//                        new Graduate("Schreder", "Hank", 40, "Criminalistic", "OBN", 70, 50, "How to catch Heisenberg"),
//                        new Specialist("Vercetti", "Tommy", 30, "Theft", "Vice", 98, 99, "Get money back", 5),
//                        new Teacher("Diaz", "Ricardo", 50, "Weapons distribution", 20),
//                        leo
//                };

        //Override методы выполняют Specialization
        //Downcast - преобразование базового объекта в дочерний класс
//        for(int i = 0; i < group.length; i++)
//        {
//            System.out.println(group[i]);
//        }
//
//        File file = new File("group.txt");
//        System.out.println(file.getAbsoluteFile());
//        file.delete();
//        file.createNewFile();
//
//        FileWriter writer = new FileWriter(file);
//
//        for(int i = 0 ; i < group.length; i++)
//        {
//            writer.write(group[i].toString());
//            writer.write('\n');
//        }
//        writer.close(); //Потоки обязательно нужно закрывать
        FileReader fr= new FileReader("group.txt");
        Scanner scan = new Scanner(fr);
        int i = 0;

        while (scan.hasNextLine()) {
            //String [] test = new String[i+1];
            /* test[i] =*/ scan.nextLine();
            //System.out.println(test[i]);
            i++;
        }
        String [] test1 = new String[i];
        FileReader fr1= new FileReader("group.txt");
        Scanner scan1 = new Scanner(fr1);
        for (int j = 0; j < test1.length; j++) {
            test1[j] = scan1.nextLine();
           // System.out.println(test1[j]);
        }
        System.out.println("_________________________");

        fr.close();
        for (int j = 0; j < test1.length ; j++) {
            System.out.println(test1[j]);}
        Human[] group = new Human[i];
        for (int j = 0; j < group.length; j++) {
          // group[i] = test1[i]; // ААААААААААААААААААААААА!!!!!!!!!!!!! Как это преобразовать в объект?!?!??!?

        }


    }
}
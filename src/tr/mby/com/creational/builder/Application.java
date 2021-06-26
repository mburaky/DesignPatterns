package tr.mby.com.creational.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = sdf.parse("25/06/2021");
        Date d2 = sdf.parse("14/07/2021");

        Task task1 = new TaskBuilder()
                .setDescription("Task1 Definition")
                .setDone(true)
                .setDueDate(d1)
                .setSummary("Task1 Summary")
                .build();

        Task task2 = new TaskBuilder()
                .setDescription("Task2 Definition")
                .setDone(false)
                .setDueDate(d2)
                .setSummary("Task2 Summary")
                .build();

        System.out.println(task1.toString());
        System.out.println(task2.toString());

        // OUTPUT
        // Task{id=-6216973107702436696, summary='Task1 Summary', description='Task1 Definition', done=true, dueDate=Fri Jun 25 00:00:00 BST 2021}
        // Task{id=7248410034016857146, summary='Task2 Summary', description='Task2 Definition', done=false, dueDate=Wed Jul 14 00:00:00 BST 2021}
    }
}

package learning.gradle.todo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        while(++i > 0){
            logger.info(i + ". please input to item name:");
            TodoItem item = new TodoItem(s.nextLine());
            System.out.println(item);

        }
    }
}

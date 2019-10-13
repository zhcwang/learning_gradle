package learning.gradle.todo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        while(++i > 0){
            System.out.println(i + ". please input to item name:");
            TodoItem item = new TodoItem(s.nextLine());
            System.out.println(item);
        }
    }
}

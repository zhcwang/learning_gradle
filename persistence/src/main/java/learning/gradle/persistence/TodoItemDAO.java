package learning.gradle.persistence;

import learning.gradle.model.TodoItem;

public class TodoItemDAO {

    public void save(TodoItem item){
        System.out.println("保存成功:" + item);
    }
}

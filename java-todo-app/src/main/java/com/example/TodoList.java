package main.java.com.example;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<ToDoItem> items = new ArrayList<>();

    public void addItem(ToDoItem item) {
        items.add(item);
    }

    public void removeItem(int index){
        items.remove(index);
    }

    public void updateItem(int index, ToDoItem item){
        items.set(index, item);
    }

    public List<ToDoItem> getItems(){
        return items;
    }
}
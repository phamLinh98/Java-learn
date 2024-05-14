package main.java.com.example;

public class ToDoItem { 
    public String title;
    public String completed;
}

class ToDoList {
    private List<ToDoItem> items = new ArrayList<ToDoItem>();
    
    public void addItem(ToDoItem item) {
        items.add(item);
    }

    public void removeItem(ToDoItem item) {
        items.remove(index);
    }

    public void updateItems(int index, TodoItem item) {
        items.set(index, item);
    }

    public List<ToDoItem> getItems() {
        return items;
    }
}



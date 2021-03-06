package maven.project.controller;

import maven.project.model.TodoData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TodoItemController {

    // model attributes ==
    @ModelAttribute
    public TodoData toDoData() {
        return new TodoData();
    }

    // == handler methods ==
    // http://localhost:9080/todo-list/items
    @GetMapping("items")
    public String items() {
        return "items";
    }

}

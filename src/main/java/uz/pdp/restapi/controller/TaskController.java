package uz.pdp.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.restapi.entity.Task;
import uz.pdp.restapi.payload.ApiResponse;
import uz.pdp.restapi.payload.TaskDto;
import uz.pdp.restapi.service.TaskService;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("api/taskGetAll")
    public List<Task> getTask(){
        List<Task> tasks = taskService.getTasks();
        return tasks;
    }

    @GetMapping("api/taskGetById/{id}")
    public Task gettaskById(@PathVariable Integer id){
        Task taskById = taskService.getTaskById(id);
        return taskById;
    }

    @PostMapping("api/taskAdd")
    public ApiResponse addTask(@RequestBody TaskDto taskDto){
        ApiResponse addTask = taskService.addTask(taskDto);
        return addTask;
    }

    @PutMapping("api/taskUpdate/{id}")
    public ApiResponse updateTask(@PathVariable Integer id, @RequestBody TaskDto taskDto){
        ApiResponse updateTask = taskService.updateTask(id, taskDto);
        return updateTask;
    }

    @DeleteMapping("api/taskDelete/{id}")
    public ApiResponse deleteTask(@PathVariable Integer id){
        ApiResponse deleteTask = taskService.deleteTask(id);
        return  deleteTask;
    }
}

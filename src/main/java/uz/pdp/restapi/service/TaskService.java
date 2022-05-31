package uz.pdp.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.restapi.entity.Language;
import uz.pdp.restapi.entity.Task;
import uz.pdp.restapi.payload.ApiResponse;
import uz.pdp.restapi.payload.TaskDto;
import uz.pdp.restapi.repository.AnswerRepository;
import uz.pdp.restapi.repository.ExampleRepository;
import uz.pdp.restapi.repository.LanguageRepository;
import uz.pdp.restapi.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    ExampleRepository exampleRepository;

    @Autowired
    TaskRepository taskRepository;

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    LanguageRepository languageRepository;

    public List<Task> getTasks(){
        List<Task> taskList = taskRepository.findAll();
        return  taskList;
    }

    public Task getTaskById(Integer id){
        Optional<Task> taskRepositoryById = taskRepository.findById(id);
        if(!taskRepositoryById.isPresent()){
            return null;
        }
        return taskRepositoryById.get();
    }

    public ApiResponse addTask( TaskDto taskDto){
        Optional<Language> optionalLanguage = languageRepository.findById(taskDto.getLanguage_id());
        if(!optionalLanguage.isPresent()){
            return new ApiResponse("no such language", false);
        }
        Task task = new Task();
        task.setName(taskDto.getName());
        task.setText(taskDto.getText());
        task.setSolution(taskDto.getSolution());
        task.setHint(taskDto.getHint());
        task.setMethod(taskDto.getMethod());
        task.setLanguage(optionalLanguage.get());   //language
        taskRepository.save(task);
        return new ApiResponse("added", true);
    }
    public ApiResponse updateTask(Integer id, TaskDto taskDto){
        Optional<Language> optionalLanguage = languageRepository.findById(taskDto.getLanguage_id());
        if(!optionalLanguage.isPresent()){
            return new ApiResponse("no such language", false);
        }
        Optional<Task> optionalTask = taskRepository.findById(id);
        if(!optionalTask.isPresent()){
            return new ApiResponse("no such task", false);
        }
        Task task = optionalTask.get();
        task.setName(taskDto.getName());
        task.setText(taskDto.getText());
        task.setSolution(taskDto.getSolution());
        task.setHint(taskDto.getHint());
        task.setMethod(taskDto.getMethod());
        task.setLanguage(optionalLanguage.get());   //language
        taskRepository.save(task);
        return new ApiResponse("added", true);
    }

    public ApiResponse deleteTask(Integer id){
        taskRepository.deleteById(id);
        return new ApiResponse("deleted", true);
    }

}

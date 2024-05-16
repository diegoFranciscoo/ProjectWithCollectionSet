package academy.devdojo.maratonajava.javacore.Task;

import java.util.HashSet;
import java.util.Set;

public class TaskList {
    private Set<Task> taskSet;

    public TaskList() {
        this.taskSet = new HashSet<>();
    }

    public void addTask(String description){
        taskSet.add(new Task(description));
    }
    public void removeTask(String description){
        Task taskRemove = null;
        if(!taskSet.isEmpty()){
            for (Task t : taskSet){
                if(t.getDescription().equalsIgnoreCase(description)){
                    taskRemove = t;
                    break;
                }
            }
            taskSet.remove(taskRemove);
        }else {
            System.out.println("Empty");
        }
    }
    public void showTask(){
        System.out.println(taskSet);
    }
    public int numberOfTask(){
        return taskSet.size();
    }
    public void completeTask(String description){
        if(!taskSet.isEmpty()){
            for(Task t : taskSet){
                if(t.getDescription().equalsIgnoreCase(description) && !t.isComplete()){
                    t.setComplete(true);
                }
            }
        }else {
            System.out.println("Empty");
        }
    }
public void pendingTask(String description){
    if(!taskSet.isEmpty()){
        for(Task t : taskSet){
            if(t.getDescription().equalsIgnoreCase(description) && t.isComplete()){
                t.setComplete(false);
            }
        }
    }else {
        System.out.println("Empty");
    }
}
public Set<Task> completedTasks(){
        Set<Task> tasksCompleted = new HashSet<>();
        if(!taskSet.isEmpty()){
            for (Task t : taskSet){
                if (t.isComplete()){
                    tasksCompleted.add(t);
                }
            }
        }else {
            System.out.println("Empty");
        }
        return tasksCompleted;
}

    public Set<Task> incompleteTasks(){
        Set<Task> pedingTasks = new HashSet<>();
        if(!taskSet.isEmpty()){
            for (Task t : taskSet){
                if (!t.isComplete()){
                    pedingTasks.add(t);
                }
            }
        }else {
            System.out.println("Empty");
        }
        return pedingTasks;
    }

    public void deleteTasks() {
        taskSet.clear();
    }


}

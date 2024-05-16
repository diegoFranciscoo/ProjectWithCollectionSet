package academy.devdojo.maratonajava.javacore.Task;

public class TaskTest {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask("fazer algo");
        taskList.addTask("estudar java");
        taskList.addTask("ver filmes");
        taskList.addTask("jogar bola");
        taskList.showTask();

        taskList.removeTask("fazer algo");
        taskList.showTask();

        System.out.println(taskList.numberOfTask());

        taskList.completeTask("estudar java");
        taskList.completeTask("ver filmes");
        taskList.showTask();

        taskList.pendingTask("ver filmes");
        taskList.showTask();

        System.out.println(taskList.completedTasks());
        System.out.println(taskList.incompleteTasks());


        taskList.deleteTasks();
        taskList.showTask();

    }
}

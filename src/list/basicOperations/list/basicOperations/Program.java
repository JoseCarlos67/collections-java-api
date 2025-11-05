package list.basicOperations.list.basicOperations;

public class Program {
  public static void main(String[] args) {
    TaskList taskList = new TaskList();

    System.out.println(taskList.getTheTotalNumberOfTasks());

    taskList.addTask("tarefa 1");
    taskList.addTask("tarefa 2");
    taskList.addTask("tarefa 2");
    System.out.println(taskList.getTheTotalNumberOfTasks());

    taskList.removeTask("tarefa 1");

    System.out.println(taskList.getTheTotalNumberOfTasks());

    taskList.obtainTaskDescription();
  }
}

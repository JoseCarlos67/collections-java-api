package list.basicOperations.list.basicOperations;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
  private List<Task> taskList;

  public TaskList() {
    this.taskList = new ArrayList<>();
  }

  public void addTask(String description) {
    taskList.add(new Task(description));
  }

  public void removeTask(String description) {
    List<Task> tasksToRemove = new ArrayList<>();

    for (Task task : taskList) {
      if (task.getDescription().equalsIgnoreCase(description))
        tasksToRemove.add(task);
    }

    taskList.removeAll(tasksToRemove);
  }

  public int getTheTotalNumberOfTasks() {
    return taskList.size();
  }

  public void obtainTaskDescription() {
    System.out.println(taskList);
  }
}

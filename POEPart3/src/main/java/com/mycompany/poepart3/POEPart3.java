/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart3;

/**
 *
 * @author RC_Student_lab
 */
public class POEPart3 {

    public static void main(String[] args) {
        import java.util.ArrayList;
import java.util.List;

class TaskManager {
    static List<String> developers = new ArrayList<>();
    static List<String> taskNames = new ArrayList<>();
    static List<Integer> taskIds = new ArrayList<>();
    static List<Integer> taskDurations = new ArrayList<>();
    static List<String> taskStatuses = new ArrayList<>();

    public static void main(String[] args) {
        populateTestData();

        
        System.out.println("Tasks with status 'Done':");
        displayDoneTasks();

       
        System.out.println("\nTask with the longest duration:");
        displayLongestTask();

        
        System.out.println("\nSearch for task 'Create Login':");
        searchTaskByName("Create Login");

       
        System.out.println("\nTasks assigned to 'Samantha Paulson':");
        searchTasksByDeveloper("Samantha Paulson");

        
        System.out.println("\nDelete task 'Create Reports':");
        deleteTask("Create Reports");

       
        System.out.println("\nAll captured tasks:");
        displayReport();
    }

    
    public static void populateTestData() {
        developers.add("Mike Smith");
        taskNames.add("Create Login");
        taskIds.add(1);
        taskDurations.add(5);
        taskStatuses.add("To Do");

        developers.add("Edward Harrison");
        taskNames.add("Create Add Features");
        taskIds.add(2);
        taskDurations.add(8);
        taskStatuses.add("Doing");

        developers.add("Samantha Paulson");
        taskNames.add("Create Reports");
        taskIds.add(3);
        taskDurations.add(2);
        taskStatuses.add("Done");

        developers.add("Glenda Oberholzer");
        taskNames.add("Add Arrays");
        taskIds.add(4);
        taskDurations.add(11);
        taskStatuses.add("To Do");
    }

    
    public static void displayDoneTasks() {
        for (int i = 0; i < taskNames.size(); i++) {
            if (taskStatuses.get(i).equals("Done")) {
                System.out.println("Developer: " + developers.get(i) + ", Task Name: " + taskNames.get(i) + ", Task Duration: " + taskDurations.get(i));
            }
        }
    }

    
    public static void displayLongestTask() {
        if (!taskDurations.isEmpty()) {
            int maxDuration = taskDurations.get(0);
            int index = 0;
            for (int i = 1; i < taskDurations.size(); i++) {
                if (taskDurations.get(i) > maxDuration) {
                    maxDuration = taskDurations.get(i);
                    index = i;
                }
            }
            System.out.println("Developer: " + developers.get(index) + ", Duration: " + maxDuration);
        }
    }

    
    public static void searchTaskByName(String taskName) {
        if (taskNames.contains(taskName)) {
            int index = taskNames.indexOf(taskName);
            System.out.println("Task Name: " + taskNames.get(index) + ", Developer: " + developers.get(index) + ", Task Status: " + taskStatuses.get(index));
        } else {
            System.out.println("Task not found");
        }
    }

    
    public static void searchTasksByDeveloper(String developer) {
        boolean found = false;
        for (int i = 0; i < developers.size(); i++) {
            if (developers.get(i).equals(developer)) {
                System.out.println("Task Name: " + taskNames.get(i) + ", Task Status: " + taskStatuses.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tasks found for this developer");
        }
    }

   
    public static void deleteTask(String taskName) {
        if (taskNames.contains(taskName)) {
            int index = taskNames.indexOf(taskName);
            developers.remove(index);
            taskNames.remove(index);
            taskIds.remove(index);
            taskDurations.remove(index);
            taskStatuses.remove(index);
            System.out.println("Task '" + taskName + "' successfully deleted");
        } else {
            System.out.println("Task not found");
        }
    }

    
    public static void displayReport() {
        for (int i = 0; i < taskNames.size(); i++) {
            System.out.println("Task ID: " + taskIds.get(i) + ", Developer: " + developers.get(i) + ", Task Name: " + taskNames.get(i) + ", Task Duration: " + taskDurations.get(i) + ", Task Status: " + taskStatuses.get(i));
        }
    }
}

    }
}

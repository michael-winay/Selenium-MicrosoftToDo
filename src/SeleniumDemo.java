public class SeleniumDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:/Users/mgwin/Documents/EdgeDriver/msedgedriver.exe");

        //Login: Successful
        LoginSuccessfulTest test1 = new LoginSuccessfulTest();
        test1.setUp();
        if (test1.loginSuccessful()) {
            System.out.println("Test 1 passed");
        }

        //Login: Invalid Credentials
        //LoginInvalidCredentialsTest test2 = new LoginInvalidCredentialsTest();
        //test2.setUp();
        //if (test2.loginInvalidCredentials()) {
        //    System.out.println("Test 2 passed");
        //}

        //Add a Task
        //AddTaskTest test3 = new AddTaskTest();
        //test3.setUp();
        //if (test3.addTask()) {
        //    System.out.println("Test 3 passed");
        //}

        //Add a "My Day" Task
        //AddMyDayTaskTest test4 = new AddMyDayTaskTest();
        //test4.setUp();
        //if (test4.addMyDayTask()) {
        //    System.out.println("Test 4 passed");
        //}

        //Create a List
        //CreateListTest test5 = new CreateListTest();
        //test5.setUp();
        //if (test5.createList()) {
        //    System.out.println("Test 5 passed");
        //}

        //Mark a Task as Completed
        //CompleteTaskTest test6 = new CompleteTaskTest();
        //test6.setUp();
        //if (test6.completeTask()) {
        //    System.out.println("Test 6 passed");
        //}

        //Set a Reminder for a Task
        //SetTaskReminderTest test7 = new SetTaskReminderTest();
        //test7.setUp();
        //if (test7.setTaskReminder()) {
        //    System.out.println("Test 7 passed");
        //}

        //Set a Due Date for a Task
        //SetTaskDueDateTest test8 = new SetTaskDueDateTest();
        //test8.setUp();
        //if (test8.setTaskDueDate()) {
        //    System.out.println("Test 8 passed");
        //}

        //Set Task to Repeat Weekly
        //RepeatTaskWeeklyTest test9 = new RepeatTaskWeeklyTest();
        //test9.setUp();
        //if (test9.repeatTaskWeekly()) {
        //    System.out.println("Test 9 passed");
        //}

        //Mark a Task as Important
        //MarkTaskImportantTest test10 = new MarkTaskImportantTest();
        //test10.setUp();
        //if (test10.markTaskImportant()) {
        //    System.out.println("Test 10 passed");
        //}

        //Sort Tasks Alphabetically
        //SortTasksDueDateTest test11 = new SortTasksDueDateTest();
        //test11.setUp();
        //if (test11.sortTasksDueDate()) {
        //    System.out.println("Test 11 passed");
        //}

        //Sort Tasks by Due Date
        //SortTasksAlphabeticallyTest test12 = new SortTasksAlphabeticallyTest();
        //test12.setUp();
        //if (test12.sortTasksAlphabetically()) {
        //    System.out.println("Test 12 passed");
        //}

        //Add a Task to My Day
        //AddTaskToMyDayTest test13 = new AddTaskToMyDayTest();
        //test13.setUp();
        //if (test13.addTaskToMyDay()) {
        //    System.out.println("Test 13 passed");
        //}

        //Edit a Task's Due Date
        //EditTaskDueDateTest test14 = new EditTaskDueDateTest();
        //test14.setUp();
        //if (test14.editTaskDueDate()) {
        //    System.out.println("Test 14 passed");
        //}

        //Delete a Task
        //DeleteTaskTest test15 = new DeleteTaskTest();
        //test15.setUp();
        //if (test15.deleteTask()) {
        //    System.out.println("Test 15 passed");
        //}
    }
}

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExample {

    public static void main(String[] args) {
        // Create a ThreadPoolExecutor with a fixed-size pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

        // Submit tasks to the thread pool
        for (int i = 0; i < 5; i++) {
            Task task = new Task("Task " + i);
            System.out.println("Submitting: " + task.getName());
            executorService.submit(task);
        }

        // Shutdown the executor service
        executorService.shutdown();
    }
}

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " Start. " + name);
            // Simulate some task execution
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " End. " + name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


import java.util.UUID;

/**
 * -XX:+UnlockDiagnosticVMOptions -XX:+TraceClassLoading 
 * -XX:+LogCompilation -XX:+PrintAssembly
 */
public class App {
    public static void main(String[] args) throws Exception {
        // 10bb888c-9ee0-4d02-a10f-7e8a93b7fa6e
        System.out.println(UUID.randomUUID());
        System.out.println("Hello, World!");
    }
}

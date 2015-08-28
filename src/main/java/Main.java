import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    final Logger log = LoggerFactory.getLogger(getClass());

    void foo() {
        MDC.put("User", "Colin");
        MDC.put("Thread Name", Thread.currentThread().getName());
        log.debug("Hello!");
    }

    public static void main(final String[] args) {
        new Main().foo();
    }
}
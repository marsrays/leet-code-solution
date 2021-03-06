/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leet.code.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = { "leet.code.solution" })
@PropertySource(value = { "undertow.properties" }, encoding = "UTF-8")
public class Main {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Main.class);
        application.addListeners(new ApplicationPidFileWriter());
        application.run(args);
    }

}

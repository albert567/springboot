package cn.altctrl.springboot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="student")
@Setter
@Getter
public class Student {
    private String name;
    private Integer age;
}

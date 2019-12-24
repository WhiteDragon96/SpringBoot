package com.example.demo.component;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "file.component")
public class FileComponent {

    String parentPath;//file.component.parentPath

    String fileType;//file.component.fileType

    int maxSize;//file.component.maxSize
}

package com.example.second.componet;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "cs.file")
@Component
public class FileConfig {

    String parentPath;//d:/Spring
    String picPath;//d:/Spring/pic
    String txtPath;//d:/Spring/txt
    int minFile;
}

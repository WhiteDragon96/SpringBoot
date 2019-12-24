package com.example.second.componet;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component
@Data
@ConfigurationProperties(prefix = "file.component")
public class User {

    String filePath;

    String fileName;

    String picFilePath;

    int fileMax;

    Map<String,String> fileMap;

    List<String> fileList;

    UserDetail userDetail;

}

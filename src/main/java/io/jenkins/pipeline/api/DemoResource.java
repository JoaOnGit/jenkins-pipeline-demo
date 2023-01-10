package io.jenkins.pipeline.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/demo")
public class DemoResource {

    public void start(){
        System.out.println("Demo App with Jenkins Pipeline with Docker");
    }
}

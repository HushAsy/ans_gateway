package org.hush.consume_;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: hewater
 * @create: 2018-11-04 22:09
 **/
@RestController
public class Controller {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("index")
    public String router() {
        // 根据应用名称调用服务
        String json = restTemplate.getForObject(
        "http://serviceProvider/info", String.class);
        return json;
    }

}

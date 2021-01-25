package com.feker.kafka.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/kafka")
public class ProductController {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    /**
     * 生产者发送消息
     * @return
     */
    @GetMapping("/send")
    public String send(@RequestParam(value = "topic") String topic, @RequestParam(value = "msg") String msg){
        kafkaTemplate.send(topic, msg);

//        log.info("发送消息的topic为: {}! 发送的内容为: {}", topic, msg);

        System.out.println("发送消息的topic为: "+topic+"   发送的内容为: "+msg);
        return "发送消息成功!";
    }
}

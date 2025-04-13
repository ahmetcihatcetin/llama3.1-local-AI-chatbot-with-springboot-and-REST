package com.llama3_1_springboot3_4_4_java.ai_chatbot_restful.controller;

import com.llama3_1_springboot3_4_4_java.ai_chatbot_restful.response.SpringLlamaAiResponse;
import com.llama3_1_springboot3_4_4_java.ai_chatbot_restful.service.SpringLlamaAiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpringLlamaRestController {
    @Autowired
    private SpringLlamaAiService springLlamaAiService;

    @GetMapping("api/v1/ai/generate")
    public ResponseEntity<SpringLlamaAiResponse> generate(@RequestParam(value = "promptMessage", defaultValue = "Why is the sky blue?")String promptMessage) {
        final SpringLlamaAiResponse springLlamaAiResponse = springLlamaAiService.generateMessage(promptMessage);
        return ResponseEntity.status(HttpStatus.OK).body(springLlamaAiResponse );      
    }
}

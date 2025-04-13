package com.llama3_1_springboot3_4_4_java.ai_chatbot_restful.response;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SpringLlamaAiResponse {
    private String message;
}
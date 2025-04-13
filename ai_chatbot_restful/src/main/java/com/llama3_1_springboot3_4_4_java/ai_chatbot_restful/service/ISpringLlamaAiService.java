package com.llama3_1_springboot3_4_4_java.ai_chatbot_restful.service;

import com.llama3_1_springboot3_4_4_java.ai_chatbot_restful.response.SpringLlamaAiResponse;

public interface ISpringLlamaAiService {
    SpringLlamaAiResponse   generateMessage(String prompt);
}
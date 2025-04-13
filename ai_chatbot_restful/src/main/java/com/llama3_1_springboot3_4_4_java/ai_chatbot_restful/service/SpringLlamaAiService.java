package com.llama3_1_springboot3_4_4_java.ai_chatbot_restful.service;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llama3_1_springboot3_4_4_java.ai_chatbot_restful.response.SpringLlamaAiResponse;

@Service
public class SpringLlamaAiService implements ISpringLlamaAiService {

    @Autowired
    private OllamaChatModel chatModel;
    
    @Override
    public  SpringLlamaAiResponse generateMessage(String promt){
        final   String llamaResponse = chatModel.call(promt);
        return  new SpringLlamaAiResponse().setMessage(llamaResponse);
    }
}

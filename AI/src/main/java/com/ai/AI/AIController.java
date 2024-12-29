package com.ai.AI;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.ai.ollama.OllamaChatClient;

@RestController
//@RequestMapping("/ai")
public class AIController {

//    private OllamaChatClient client;
//
//    private static final String PROMPT="What is Java?";
//
//    public AIController(OllamaChatClient client){
//        this.client = client;
//    }
//
//    @GetMapping("ai/prompt")
//    public String promptResponse(
//            @RequestParam("prompt") String prompt
//    ){
//        //String response = client.call(PROMPT);
//        String response = client.call(prompt);
//        return response;
//    }

    private final ChatModel chatModel;

    public AIController(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/")
    public String prompt(@RequestParam String m){
        return chatModel.call(m);
    }
}

package com.suprhulk;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;
import io.github.cdimascio.dotenv.Dotenv;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);

        Dotenv config;

        System.out.print("Enter your query: ");
        String query = sc.nextLine();
        query = query +" in less than 2000 tokens";
        String temp = "CompletionChoice(text="+query;
        OpenAiService service = new OpenAiService(Dotenv.configure().load().get("TOKEN"));
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt(query)
                .model("text-davinci-003")
                .maxTokens(2000)
                .echo(true)
                .build();

        try {
            String s = String.valueOf(service.createCompletion(completionRequest).getChoices().get(0));
            int i=0;
            for(; i<temp.length(); i++) {
                if(s.charAt(i)!=temp.charAt(i)) {
                    break;
                }
            }
            System.out.println(s.substring(i, s.indexOf("index=0")));
        }
        catch (Exception e) {
            System.err.println("Failed to generate response: " + e.getMessage());
        }
    }
}
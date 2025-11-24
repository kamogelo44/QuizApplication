/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quizapplication;

/**
 *
 * @author Obakeng Phale
 */
public class Question {
    private String category;
    private String questionText;
    private String[] options;
    private String correctAnswer;
    public Question(
            String category, 
            String questionText, String[]options, 
            String correctAnswer){
        this.category = category;
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
    public void displayQuestion(){
        System.out.println("Category: "+ category 
                + "\nQuestion: "+ questionText);
        for(String option: options)
            System.out.println(option);       
    }
    
    public String getCorrectAnswer() {
        return correctAnswer;
    }
}

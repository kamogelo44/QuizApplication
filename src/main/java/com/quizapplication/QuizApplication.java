/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.quizapplication;
import java.util.Scanner;
/**
 *
 * @author Obakeng Phale
 */
public class QuizApplication {
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        Question[] quiz = new Question[] {
            
            //Programming Fundamentals
            new Question("*****Programming Fundamentals*****",
                        "What does the acronym \"OOP\" stand for?",
                        new String[]{
                        "A) Object-Oriented Programming",
                        "B) Object-Optimized Programming", 
                        "C) Operational Object Protocol",
                        "D) Organized Operational Programming"
                        },
                        "A"),
                
            new Question("Programming Fundamentals",
                        "Which data structure follows the LIFO (Last-in-First-Out) principle?",
                        new String[]{
                        "A) Queue",
                        "B) Stack", 
                        "C) Array",
                        "D) Linked List"
                        },
                        "B"),
        
            new Question("Programming Fundamentals",
                        "What is the time complexity of binary search?",
                        new String[]{
                        "A) O(n)",
                        "B) O(n^2)", 
                        "C) O(log n)",
                        "D) O(1)"
                        },
                        "C"),
        
            //Web Development
            new Question("Web Development",
                        "Which HTML tag is used to create a hyperlink?",
                        new String[]{
                        "A) <link>",
                        "B) <a>", 
                        "C) <href>",
                        "D) <hyperlink>"
                        },
                        "B"),
                        
            new Question("Web Development",
                        "What does CSS stand for?",
                        new String[]{
                        "A) Computer Style Sheets",
                        "B) Creative Style System", 
                        "C) Cascading Style Sheets",
                        "D) Colorful Style Sheets"
                        },
                        "C"),
                        
            new Question("Web Development",
                        "Which of the following is used to make a website responsive?",
                        new String[]{
                        "A) JavaScript",
                        "B) HTML", 
                        "C) CSS Media Queries",
                        "D) PHP"
                        },
                        "C"),
                        
            new Question("Web Development",
                        "Which JavaScript method is used to select an element by its ID?",
                        new String[]{
                        "A) document.querySelector()",
                        "B) document.getElementById()", 
                        "C) document.getElementByClass()",
                        "D) document.findElement()"
                        },
                        "B"),
                        
            //Database
            new Question("Database",
                        "Which SQL clause is used to filter records?",
                        new String[]{
                        "A) FILTER",
                        "B) WHERE", 
                        "C) HAVING",
                        "D) CONDITION"
                        },
                        "B"),
                        
            new Question("Database",
                        "What is the purpose of a primary key in a database?",
                        new String[]{
                        "A) To improve query performance",
                        "B) To uniquely identify each record in a table", 
                        "C) To establish relationships between tables",
                        "D) Both B and C"
                        },
                        "D"),
                        
            //Data Structures
            new Question("Data Structures",
                        "In a binary tree, what is a node with no children called?",
                        new String[]{
                        "A) Root node",
                        "B) Internal node", 
                        "C) Leaf node",
                        "D) Terminal node"
                        },
                        "C"),
                        
            new Question("Data Structures",
                        "Which sorting algorithm has the worst-case time complexity of O(n²)?",
                        new String[]{
                        "A) Merge Sort",
                        "B) Quick Sort", 
                        "C) Heap Sort",
                        "D) Bubble Sort"
                        },
                        "D"),
                        
            new Question("Data Structures",
                        "Which data structure uses First-In-First-Out (FIFO) principle?",
                        new String[]{
                        "A) Stack",
                        "B) Queue", 
                        "C) Tree",
                        "D) Graph"
                        },
                        "B")
        };
        int score = 0;

        // Display all questions
        for(int i = 0; i < quiz.length; i++) {
            System.out.println("***************************");
            System.out.println("Question " + (i + 1) + ":");
            quiz[i].displayQuestion();
           System.out.print("Enter your answer (A/B/C/D): ");
            String userAnswer = input.nextLine().toUpperCase(); 
            // Validation - check if answer is A, B, C, or D
            
            while (!userAnswer.matches("[A-D]")) {
                System.out.print("Invalid input. Please enter A, B, C, or D: ");
                userAnswer = input.nextLine().toUpperCase();
            }
            if (userAnswer.equals(quiz[i].getCorrectAnswer())) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
            System.out.println(); 
            
            // Display final score
            System.out.println("Your final score: " + score + "/" + quiz.length);

        }
    }
}
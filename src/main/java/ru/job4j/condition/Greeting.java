package ru.job4j.condition;

public class Greeting {

    public static void main(String[] args) {
        int year = 2024;
        StringBuilder idea = new StringBuilder("I like Java! ");
        idea.append("But I am a newbie. ");
        idea.append(year);
        System.out.println(idea.toString());
    }
}

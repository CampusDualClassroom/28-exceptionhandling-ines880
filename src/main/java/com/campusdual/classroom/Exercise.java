package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        try {
            throw new Exception("Excepción controlada dentro del método main");
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

    }
}

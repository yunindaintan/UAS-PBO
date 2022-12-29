package Program_No5;


import <any?>;
import Program_No5.Animal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Fish extends Animal implements Pet {
    private String name;
    public Fish () {
        super (0);
    }
    @Override
    public void setName (String name) {
        this.name = name;
    }
    @Override
    public String getName () {
        return name;
    }
    @Override
    public void play () {
        System.out.println("Fish/ikan berenang di dalam aquarium.");
    }
    @Override
    public void walk () {
        super.walk();
        System.out.println("Fish/ikan tidak berjalan, mereka berenang.");
    }
    @Override
    public void eat () {
        System.out.println("Fish/ikan memakan lumut.");
    }
    
}

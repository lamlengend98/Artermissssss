/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_student;

/**
 *
 * @author USER
 */
public class Teacher extends Person{
    private String rank;

    public Teacher() {
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t\t" + this.getRank(); 
    }

    @Override
    public void print() {
        super.print();
        System.out.print("Rank: ");
        this.setRank(input.nextLine());
    }
 
    
}

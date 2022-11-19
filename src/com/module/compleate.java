package com.module;

    public class compleate {//клас в якому все збирається
    public void main(){
        Pjoin(new station());
        System.out.println(" ");
        Premove(new station());

    }
    public void Pjoin(station creator){
        System.out.println(creator.addPassenger());
        System.out.println(creator.Createroute());
    }
    public void Premove(station creator){
        System.out.println(creator.Deleteroupe());
        System.out.println(creator.Remove_Pessenger());
    }
}

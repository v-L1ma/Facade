package com.facade.model;

public class Combo {

    private Bebida bebida;
    private Sobremesa sobremesa;
    private Burger burguer;

    public Combo(Bebida bebida, Sobremesa sobremesa, Burger burguer){
        this.bebida = bebida;
        this.burguer = burguer;
        this.sobremesa = sobremesa;
    }

    public void getItems(){
        System.out.println("Burguer: " + burguer.getNome());
        System.out.println("Bebida: " + bebida.getNome());
        System.out.println("Sobremesa: " + sobremesa.getNome());
    }

    public double getPrecoTotal(){
        return bebida.getPreco() + sobremesa.getPreco() + burguer.getPreco();

    }
}

package com.facade.facade;

import com.facade.model.Bebida;
import com.facade.model.Burger;
import com.facade.model.Combo;
import com.facade.model.Sobremesa;

public class ComboFacade {

    private Combo combo;

    public Combo criarCombo(int escolha){
        switch (escolha){
            case 1:
                Bebida dolly = new Bebida("Dolly", 3.99);
                Sobremesa sorvete = new Sobremesa("Sorvete", 6.00);
                Burger bigMac = new Burger("BigMac", 20.00);
                combo = new Combo(dolly,sorvete,bigMac);
                return combo;
            case 2:
                Bebida coca = new Bebida("Coca", 15.99);
                Sobremesa brownie = new Sobremesa("Brownie", 10.00);
                Burger whooper = new Burger("Whooper", 20.00);
                combo = new Combo(coca,brownie,whooper);
                return combo;

            default:
                System.out.println("Por favor insira um combo válido");
                return null;
        }
    }

    public void exibirItems(){
        combo.getItems();
    }

    public double getPrecoTotal(){
        return combo.getPrecoTotal();
    }

}

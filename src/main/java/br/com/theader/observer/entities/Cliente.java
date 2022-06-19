package br.com.theader.observer.entities;

import br.com.theader.observer.interfaces.IObserver;

public class Cliente implements IObserver {
    private String User;

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public Cliente(String user) {
        User = user;
    }

    @Override
    public void Update(Boolean Disponibilidade, String _Produto) {
        if(Disponibilidade)
            System.out.println("Produto: "+ _Produto + " Disponível");
        else
            System.out.println("Produto: "+ _Produto + " Não está Disponível no momento");
    }
}

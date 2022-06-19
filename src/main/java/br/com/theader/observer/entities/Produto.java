package br.com.theader.observer.entities;

import br.com.theader.observer.interfaces.IObserver;
import br.com.theader.observer.interfaces.ISubject;

import java.util.ArrayList;
import java.util.List;

public class Produto implements ISubject {
    private String Produto;
    private Boolean Disponivel;

    private List<IObserver> lstObserver = new ArrayList<>();

    public Produto(String _Produto, Boolean _Disponivel){
        this.Produto = _Produto;
        this.Disponivel = _Disponivel;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String produto) {
        Produto = produto;
    }

    public Boolean getDisponivel() {
        return Disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        Disponivel = disponivel;
        NotifyAllObservers();
    }

    @Override
    public void RegistrarObserver(IObserver _Observer) {
        lstObserver.add(_Observer);
    }

    @Override
    public void RemoverObserver(IObserver _Observer) {
        lstObserver.remove(_Observer);
    }

    @Override
    public void NotifyAllObservers() {
        for(IObserver obs : lstObserver){
            obs.Update(this.getDisponivel(), this.getProduto());
        }
    }

}

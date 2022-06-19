package br.com.theader.observer.interfaces;

public interface ISubject {
    void RegistrarObserver(IObserver _Observer);
    void RemoverObserver(IObserver _Observer);
    void NotifyAllObservers();
}

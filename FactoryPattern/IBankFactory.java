package FactoryPattern;

public interface IBankFactory {
    IBank GetBank(String bankCode);
}

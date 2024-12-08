package services.pagamento;

//import CarrinhoDeCompras;

public class Pagamento implements InterfacePagamento{

    @Override
    public double pagar(double valor, double totalDaCompra) {
        if (valor < totalDaCompra) return -1;
        return totalDaCompra - valor;
    }
    
}
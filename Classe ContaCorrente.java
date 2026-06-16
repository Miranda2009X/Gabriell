public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String titular, double saldoInicial, double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (getSaldo() + limite) >= valor) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        System.out.println("passou do limite,erro " + getTitular());
        return false;1
    }

    @Override
    public String extrato() {
        return super.extrato() + " | Limite: R$ " + String.format("%.2f", limite);
    }
}

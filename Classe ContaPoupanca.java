public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldoInicial, double taxaRendimento) {
        super(titular, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public void renderJuros() {
        double juros = getSaldo() * taxaRendimento;
        depositar(juros);
    }

    @Override
    public String extrato() {
        return super.extrato() + " | Taxa Rendimento: " + (taxaRendimento * 100) + "%";
    }
}

public class Main {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente("Carlos", 500.0, 300.0);
        ContaPoupanca cp = new ContaPoupanca("Ana", 1000.0, 0.01);
        
        cc.depositar(200.0);
        cc.sacar(900.0); 
      
        cp.depositar(500.0);
        cp.renderJuros(); 

       
        ContaBancaria[] contas = new ContaBancaria[2];
        contas[0] = cc;
        contas[1] = cp;

        System.out.println("\n--- Executando Extratos via Polimorfismo ---");
        for (ContaBancaria conta : contas) {
            
            System.out.println(conta.extrato());
        }
    }
}

public class Conta {
    private int numero;
    private String agencia;
    private String name;
    private Double saldo;
    
    public Conta(int numero, String agencia, String name, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.name = name;
        this.saldo = saldo;
    }
    public void depositar(Double valor){
        if (valor != null && valor > 0) {
        saldo += valor;
    }
    }
    public void sacar(Double valor){
        if (valor <= saldo){
            saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente para saque.");
        }
    
        }
       public void exibirSaldo() {
    System.out.printf("Titular: %s | Saldo: R$ %.2f\n", name, saldo);
}
 }
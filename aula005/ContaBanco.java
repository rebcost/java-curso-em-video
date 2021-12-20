public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0);
    }

    public void estadoAtual() {
        System.out.println("Num Conta: "+this.numConta);
        System.out.println("Tipo da Conta: "+this.tipo);
        System.out.println("Dono: "+this.dono);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Status: "+this.status);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);

        if(this.getTipo() == "CC"){
            setSaldo(50);
        }else if (this.getTipo() == "CP") {
            setSaldo(150);
        }
        System.out.println("Conta aberta com suceso!"); 
    }

    public void fecharConta() {
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta em débito");
        }else{
            this.setStatus(false);
        }
        System.out.println("Conta fechada com sucesso!");
    }

    public void depositar(float saldo) {
        if(this.isStatus()){
            this.setSaldo(this.getSaldo()+ saldo);
            System.out.println("Deposito realizado com sucesso na conta de "+this.dono);
        }else{
            System.out.println("Impossível depositar conta fechada!");
        }
    }

    public void sacar(float valor) {
        if(this.isStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);          
                System.out.println("Saque realizado com sucesso na conta de !"+this.dono);      
            }else{
                System.out.println("Saldo Insufissiente para sacar");
            }
        }else{
            System.out.println("Impossível realizar saque conta desativada!");
        }
    }

    public void pagarMensalidade() {
        int valor = 0;
        if(this.getTipo().equals("CC")){
            valor = 12;
        }else if(this.getTipo().equals("CP")){
            valor = 20;
        }
        if(this.isStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo()- valor);
                System.out.println("Mensalidade Paga com Sucesso");
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossível Pagar");
        }
    }
}

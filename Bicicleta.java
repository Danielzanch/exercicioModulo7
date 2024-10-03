public class Bicicleta {
    
    private String cor;
    private String modelo;
    private String uso;

    public Bicicleta(String cor, String modelo, String uso) {
        this.cor = cor;
        this.modelo = modelo;
        this.uso = uso;
    }

    // le a cor da bicicleta
    public String getCor() {
        return cor;
    }

    // altera a informação da cor 
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo =modelo;
    }

    public String getuso() {
        return uso;
    }

    public void setuso(String uso) {
        this.uso = uso;
    }

    // exibe as informações que seão impressas na tela
    public void print() {
        System.out.println(cor);
        System.out.println(modelo);
        System.out.println(uso);
    }

    // carrega as informações e imprime na tela com a classe print()
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Azul", "BarraFort", "Dia-a-Dia");

        bicicleta.print();
    }
}
package AtividadeChat;

public class LigarCarro {
    public String ligarCarro(Carro carro) {
        return "O carro: " + carro.getModelo() + " está ligado!\n" +
               "Marca: " + carro.getMarca() + "\n" +
               "Ano: " + carro.getAno() + "\n" +
               "O " + carro.getModelo() + " está desligado.\n";
    }
}

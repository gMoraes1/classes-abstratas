public class locadora { 
    public static void main(String[] args) {
        Veiculo estoque[];
        estoque = new Veiculo[5];

        estoque[0] = new Carro("Celta", "JDK002", 50f);
        estoque[1] = new Moto("honda psx", "jre234", 25f, 5f);
        estoque[2] = new Quadriciculo("Polar1", "mac 0003", 100.0f, 400.0f);
        estoque[3] = new Carro("hb20", "JDKer432", 250f);
        estoque[4] = new Moto("adv", "ave502", 15f, 0f);

        for (Veiculo v: estoque) {
            System.out.println("veiculo v = "+v.getModelo()+ " alugel = R$ "+v.calcularAluguel(7));
        }


    }
}

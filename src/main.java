public class main {
    public static void main(String[] args) {
        Transporte colectivo = new Colectivo(180);
        Transporte tren = new Tren(250);
        Transporte subte = new Subte(200);

        colectivo.iniciarViaje();
        System.out.println("Tarifa Colectivo: $" + colectivo.calcularTarifa());
        colectivo.detenerViaje();
        
        tren.iniciarViaje();
        System.out.println("Tarifa Tren: $" + tren.calcularTarifa());
        tren.detenerViaje();

        subte.iniciarViaje();
        System.out.println("Tarifa Subte: $" + subte.calcularTarifa());
        subte.detenerViaje();
        
        
        colectivo.iniciarViaje();
        System.out.println("Tarifa Colectivo: $" + colectivo.calcularTarifa());
        colectivo.detenerViaje();
        
        
        colectivo.iniciarViaje();
        System.out.println("Tarifa Colectivo: $" + colectivo.calcularTarifa());
        colectivo.detenerViaje();
        

        System.out.println("Total de viajes realizados: " + Viajes.getTotalViajes());
        System.out.println("Total gastado en viajes: $" + Viajes.getTotalGastado());

    }
}

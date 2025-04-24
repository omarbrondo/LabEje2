public abstract class Viajes {
    protected static final double TARIFA_MINIMA = 150;
    protected static int totalViajes = 0;
    protected static double totalGastado = 0;

    public static int getTotalViajes() {
        return totalViajes;
    }

    public static double getTotalGastado() {
        return totalGastado;
    }

    public void registrarViaje(double tarifa) {
        totalViajes++;
        totalGastado += tarifa;
    }
}



class Colectivo extends Viajes implements Transporte {
    private double tarifa;

    public Colectivo(double tarifa) {
        super();
        this.tarifa = Math.max(tarifa, TARIFA_MINIMA);
    }

    @Override
    public void iniciarViaje() {
        System.out.println("Colectivo iniciando viaje...");
        registrarViaje(tarifa);
    }


    @Override
    public void detenerViaje() {
        System.out.println("Colectivo deteniendo viaje...");
    }

    @Override
    public double calcularTarifa() {
        return tarifa;
    }
}

class Tren extends Viajes implements Transporte {
    private double tarifa;

    public Tren(double tarifa) {
        super();
        this.tarifa = Math.max(tarifa, TARIFA_MINIMA);
    }

    @Override
    public void iniciarViaje() {
        System.out.println("Tren iniciando viaje...");
        registrarViaje(tarifa);
    }

    @Override
    public void detenerViaje() {
        System.out.println("Tren deteniendo viaje...");
    }

    @Override
    public double calcularTarifa() {
        return tarifa;
    }
}

class Subte extends Viajes implements Transporte {
    private double tarifa;

    public Subte(double tarifa) {
        super();
        this.tarifa = Math.max(tarifa, TARIFA_MINIMA);
    }

    @Override
    public void iniciarViaje() {
        System.out.println("Subte iniciando viaje...");
        registrarViaje(tarifa);
    }

    @Override
    public void detenerViaje() {
        System.out.println("Subte deteniendo viaje...");
    }

    @Override
    public double calcularTarifa() {
        return tarifa;
    }
}
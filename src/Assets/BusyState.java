package Assets;

public class BusyState implements State_Asset {
    @Override
    public void handle(Asset asset) {
        System.out.println("El asset con ID " + asset.getId_asset() + " está ocupado (en uso).");
    }


    @Override
    public void loan(Asset asset) {
        System.out.println("Acción no permitida: El asset ya está prestado.");
    }

    @Override
    public void sendToMaintenance(Asset asset) {
        System.out.println("Acción no permitida: Debe devolverse antes de ir a mantenimiento.");
    }

    @Override
    public void returnAsset(Asset asset) {
        System.out.println("Devolviendo asset a disponible.");
        asset.setState(new AvailableState()); // Vuelve a estar libre
    }
}


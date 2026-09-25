package Assets;

public class AvailableState implements State_Asset {
    @Override
    public void handle(Asset asset) {
        System.out.println("El asset con ID " + asset.getId_asset() + " está disponible.");

    }

    @Override
    public void loan(Asset asset) {
        System.out.println("Prestando el asset...");
        asset.setState(new BusyState()); // Cambia a ocupado
    }

    @Override
    public void sendToMaintenance(Asset asset) {
        System.out.println("Enviando a mantenimiento...");
        asset.setState(new MaintenanceState()); // Cambia a mantenimiento
    }

    @Override
    public void returnAsset(Asset asset) {
        System.out.println("El asset ya se encuentra disponible.");
    }
}





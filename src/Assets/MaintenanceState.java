package Assets;

public class MaintenanceState implements State_Asset {
    @Override
    public void handle(Asset asset) {
        System.out.println("El asset con ID " + asset.getId_asset() + " está en mantenimiento.");
    }

    @Override
    public void loan(Asset asset) {
        System.out.println("Acción no permitida: No se puede prestar un asset que está en mantenimiento.");
    }

    @Override
    public void sendToMaintenance(Asset asset) {
        System.out.println("El asset ya se encuentra en mantenimiento.");
    }

    @Override
    public void returnAsset(Asset asset) {
        System.out.println("Mantenimiento finalizado. Devolviendo el asset a estado disponible.");
        asset.setState(new AvailableState()); // Vuelve a estar disponible
    }



}
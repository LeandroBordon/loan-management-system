package Assets;

public interface State_Asset {
    void handle(Asset asset);
    void loan(Asset asset);
    void sendToMaintenance(Asset asset);
    void returnAsset(Asset asset);
}

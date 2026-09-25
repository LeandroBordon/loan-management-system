package Assets;

import lombok.Getter;
import lombok.Setter;

public class Asset {
    @Getter
    @Setter
    private Long id_asset;
    private String category;
    @Setter
    private State_Asset state;

    public Asset(Long id_asset, String category, State_Asset state) {
        this.id_asset = id_asset;
        this.category = category;
        this.state = new AvailableState();
    }

    public void action(){
        state.handle(this);
    }

    public void loan() {
        state.loan(this);
    }

    public void sendToMaintenance() {
        state.sendToMaintenance(this);
    }

    public void returnAsset() {
        state.returnAsset(this);
    }

}

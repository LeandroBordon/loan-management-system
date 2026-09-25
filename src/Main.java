import Assets.Asset;
import Assets.AvailableState;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Asset nuevo = new Asset((long) 2L,"coso",new AvailableState());
        nuevo.action();
        nuevo.loan();
        nuevo.action();
        System.out.println(nuevo.getId_asset());

    }
}
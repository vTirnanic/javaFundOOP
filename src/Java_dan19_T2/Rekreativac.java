package Java_dan19_T2;

import java.util.ArrayList;

public class Rekreativac extends Planinar{
    public Rekreativac(ArrayList<Planina> listaPl, int maxU) {
        super(listaPl, maxU);
    }

    @Override
    public void izbaci() {
        for (int i = getListaPl().size() - 1; i >= 0; i--) {
            if (getListaPl().get(i).getVisina() > getMaxU() ||
                    getListaPl().get(i).isOpasnost()) {
                getListaPl().remove(i);
            }
        }
    }
}

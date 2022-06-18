package pl.pjatk.jazs22982nbp.data;

import java.util.ArrayList;

public class RateQueryResult {

    private ArrayList<Rate> rates;

    public RateQueryResult(ArrayList<Rate> rates) {
        this.rates = rates;
    }

    public ArrayList<Rate> getRates() {
        return rates;
    }

    public void setRates(ArrayList<Rate> rates) {
        this.rates = rates;
    }
}

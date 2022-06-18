package pl.pjatk.jazs22982nbp.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rate {
    @Id
    private String no;
    private String date;
    private int mid;

    public Rate() {
    }

    public Rate(String no, String date, int mid) {
        this.no = no;
        this.date = date;
        this.mid = mid;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return date;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.date = effectiveDate;
    }

    public double getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }
}


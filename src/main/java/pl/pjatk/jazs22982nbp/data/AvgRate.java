package pl.pjatk.jazs22982nbp.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "db_nbp")
@ApiModel(value = "NBP", description = "NBP from DB")
public class AvgRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "NBP id",required = true)
    private Integer id;
    @ApiModelProperty(value = "Type",required = false)
    @Enumerated(EnumType.STRING)
    private Zloto zloto;
    @ApiModelProperty(value = "Date start",required = false)
    private String dataStart;
    @ApiModelProperty(value = "Date end",required = false)
    private String dataEnd;
    @ApiModelProperty(value = "Kurs",required = false)
    private int kurs;
    @ApiModelProperty(value = "Timestamp", required = true)
    private Timestamp dataStamp;

    public AvgRate(Integer id, Zloto zloto, String dataStart, String dataEnd, int kurs, Timestamp dataStamp) {
        this.id = id;
        this.zloto = zloto;
        this.dataStart = dataStart;
        this.dataEnd = dataEnd;
        this.kurs = kurs;
        this.dataStamp = dataStamp;
    }

    public AvgRate() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Zloto getZloto() {
        return zloto;
    }

    public void setZloto(Zloto zloto) {
        this.zloto = zloto;
    }

    public String getDataStart() {
        return dataStart;
    }

    public void setDataStart(String dataStart) {
        this.dataStart = dataStart;
    }

    public String getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(String dataEnd) {
        this.dataEnd = dataEnd;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public Timestamp getDataStamp() {
        return dataStamp;
    }

    public void setDataStamp(Timestamp dataStamp) {
        this.dataStamp = dataStamp;
    }
}
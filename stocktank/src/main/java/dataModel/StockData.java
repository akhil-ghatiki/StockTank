package dataModel;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author akhil_ghatiki
 * @date 4/15/2018
 * @time 1:09 PM
 */
public class StockData {

    @JsonProperty("Meta Data")
    private MetaData metaData;

    public StockData() {

    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    @Override
    public String toString() {
        return "StockData{" +
                "metaData=" + metaData +
                '}';
    }
}

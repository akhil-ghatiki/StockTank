package dataModel;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedHashMap;

/**
 * @author akhil_ghatiki
 * @date 4/15/2018
 * @time 1:09 PM
 */
public class StockData {

    /**
     * {
     * "Meta Data": {
     * <Data>
     * },
     * "Time Series (15min)": {
     * "2018-04-24 16:00:00": {
     * <Data>
     * },
     * "2018-04-24 15:45:00": {
     * <Data>
     * },
     * "2018-04-24 15:30:00": {
     * <Data>
     * }
     * ----more such keys----
     */

    @JsonProperty("Meta Data")
    private MetaData metaData;

    @JsonAlias({"Time Series (60min)", "Time Series (15min)", "Time Series (1min)", "Time Series (Daily)"})
    private LinkedHashMap<String,StockDetails> timeSeries;

    public StockData() {

    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public LinkedHashMap<String,StockDetails> getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(LinkedHashMap<String, StockDetails> timeSeries) {
        this.timeSeries = timeSeries;
    }

    @Override
    public String toString() {
        return "StockData{" +
                "metaData=" + metaData +
                ", timeSeries=" + timeSeries +
                '}';
    }
}

package org.aghatiki.stocktank.dataModel;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.LinkedHashMap;

/**
 * @author akhil_ghatiki
 * @date 4/15/2018
 * @time 1:09 PM
 */
public class TimeSeries {

    /*"Time Series (60min)": {
        "2018-04-13 16:00:00": {
            "1. open": "93.2400",
            "2. high": "93.3600",
            "3. low": "92.4400",
            "4. close": "93.0800",
            "5. volume": "7628444"
        }*/
    //@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd hh:mm:ss")
    //@JsonProperty("2018-04-13 16:00:00")
    @JsonIgnore
    private LinkedHashMap<String, StockDetails> stockDetails = new LinkedHashMap<>();  // LinkedHashMap are being used to maintain the insertion order of the data.
    // You can go with just HashMap if insertion is not important.

    public TimeSeries() {

    }

    @JsonAnyGetter
    public LinkedHashMap<String, StockDetails> getStockDetails() {
        return stockDetails;
    }

    @JsonAnySetter
    public void setStockDetails(LinkedHashMap<String, StockDetails> stockDetails) {
        this.stockDetails = stockDetails;
    }

    @Override
    public String toString() {
        return "stockDetails:" + stockDetails;
    }
}

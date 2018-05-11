package org.aghatiki.stocktank.dataModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author akhil_ghatiki
 * @date 4/15/2018
 * @time 8:16 PM
 */
public class StockDetails {

    /*"2018-04-13 16:00:00": {
            "1. open": "93.2400",
            "2. high": "93.3600",
            "3. low": "92.4400",
            "4. close": "93.0800",
            "5. volume": "7628444"
        }*/

    @JsonProperty("1. open")
    private String Open;

    @JsonProperty("2. high")
    private String High;

    @JsonProperty("3. low")
    private String Low;

    @JsonProperty("4. close")
    private String Close;

    @JsonProperty("5. volume")
    private String Volume;

    public StockDetails() {
    }

    @JsonIgnore
    public String getOpen() {
        return Open;
    }

    @JsonIgnore
    public void setOpen(String open) {
        Open = open;
    }

    @JsonIgnore
    public String getHigh() {
        return High;
    }

    @JsonIgnore
    public void setHigh(String high) {
        High = high;
    }

    @JsonIgnore
    public String getLow() {
        return Low;
    }

    @JsonIgnore
    public void setLow(String low) {
        Low = low;
    }

    @JsonIgnore
    public String getClose() {
        return Close;
    }

    @JsonIgnore
    public void setClose(String close) {
        Close = close;
    }

    @JsonIgnore
    public String getVolume() {
        return Volume;
    }

    @JsonIgnore
    public void setVolume(String volume) {
        Volume = volume;
    }

    @Override
    public String toString() {
        return "{" +
                "\"Open\":\"" + Open + '\"' +
                ",\"High\":\"" + High + '\"' +
                ",\"Low\":\"" + Low + '\"' +
                ",\"Close\":\"" + Close + '\"' +
                ",\"Volume\":\"" + Volume + '\"' +
                '}';
    }
}

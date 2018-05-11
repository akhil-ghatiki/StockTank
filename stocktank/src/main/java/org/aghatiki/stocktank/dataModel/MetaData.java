package org.aghatiki.stocktank.dataModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author akhil_ghatiki
 * @date 4/15/2018
 * @time 1:09 PM
 */
public class MetaData {

    /*"Meta Data": {
        "1. Information": "Intraday (60min) prices and volumes",
        "2. Symbol": "MSFT",
        "3. Last Refreshed": "2018-04-13 16:00:00",
        "4. Interval": "60min",
        "5. Output Size": "Compact",
        "6. Time Zone": "US/Eastern"
    }*/

    @JsonProperty("1. Information")
    private String Information;

    @JsonProperty("2. Symbol")
    private String Symbol;

    public MetaData() {

    }

    @JsonIgnore
    public String getInformation() {
        return Information;
    }

    @JsonIgnore
    public void setInformation(String information) {
        Information = information;
    }

    @JsonIgnore
    public String getSymbol() {
        return Symbol;
    }

    @JsonIgnore
    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    @Override
    public String toString() {
        return "\"Information\":\"" + Information + '\"' +
                ", \"Symbol\":\"" + Symbol + '\"';
    }
}

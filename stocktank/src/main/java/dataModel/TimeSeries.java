package dataModel;

import com.fasterxml.jackson.annotation.JsonProperty;

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

    /*ObjectMapper mapper;

    Map<LocalDate,StockDetails> map;

    public TimeSeries(){
        mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
    }*/

    //@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd hh:mm:ss")
    @JsonProperty("2018-04-13 16:00:00")
    private StockDetails stockDetails;

    public TimeSeries() {

    }

    public StockDetails getStockDetails() {
        return stockDetails;
    }

    public void setStockDetails(StockDetails stockDetails) {
        this.stockDetails = stockDetails;
    }

    @Override
    public String toString() {
        return "TimeSeries{" +
                "stockDetails=" + stockDetails +
                '}';
    }
}

package org.aghatiki.stocktank.contoller;

import org.aghatiki.stocktank.dataModel.StockData;
import org.aghatiki.stocktank.stockTankProperties.DataSource;
import org.aghatiki.stocktank.utilities.Utils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author akhil_ghatiki
 * @date 4/26/2018
 * @time 12:17 PM
 */
@RestController
public class StockTankController {

    /***
     * This method returns all the stock details for the URL "http://localhost:8080/allstocks"
     * The request parameters are picked from the url for Ex: "http://localhost:8080/allstocks?symbol=MSFT&interval=60min" passes symbol = "MSFT" and interval = "60min" into below method
     * @return
     */
    @CrossOrigin(origins = "http://10.91.116.104:9090")
    @RequestMapping(value = "/allstocks")
    public ResponseEntity<StockData> getAllStockData(@RequestParam(value = "symbol", defaultValue = "MSFT") String symbol, @RequestParam(value = "interval", defaultValue = "60min") String interval) {
        RestTemplate restTemplate = new RestTemplate(Utils.getInstance().getRequestFactory());
        StockData stockData = restTemplate.getForObject("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=" + symbol + "&interval=" + interval + "&apikey=VASRSC36ZU68PYMD", StockData.class);
        DataSource.getInstance().setStockData(stockData);

        return new ResponseEntity<StockData>(DataSource.getInstance().getStockData(), HttpStatus.OK);
    }
}

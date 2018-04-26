package org.aghatiki.stocktank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author akhil_ghatiki
 * @date 4/15/2018
 * @time 1:09 PM
 */

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        /*Refer to Utils.java class regarding the requestFactory*/
        /*RestTemplate restTemplate = new RestTemplate(Utils.getInstance().getRequestFactory());
        StockData stockData = restTemplate.getForObject("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=60min&apikey=VASRSC36ZU68PYMD", StockData.class);
        DataSource.getInstance().setStockData(stockData);*/
        //System.out.println(stockData.toString());
        SpringApplication.run(App.class, args);
    }
}

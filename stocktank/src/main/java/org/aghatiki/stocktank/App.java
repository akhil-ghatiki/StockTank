package org.aghatiki.stocktank;

import dataModel.StockData;
import org.springframework.web.client.RestTemplate;

/**
 * @author akhil_ghatiki
 * @date 4/15/2018
 * @time 1:09 PM
 */
public class App 
{
    public static void main( String[] args )
    {
        RestTemplate restTemplate = new RestTemplate();
        //Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        StockData stockData = restTemplate.getForObject("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=60min&apikey=VASRSC36ZU68PYMD", StockData.class);
        //System.out.println(quote.toString());
        System.out.println(stockData.toString());
    }
}

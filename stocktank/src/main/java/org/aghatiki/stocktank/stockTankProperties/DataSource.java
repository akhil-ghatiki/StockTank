package org.aghatiki.stocktank.stockTankProperties;

import org.aghatiki.stocktank.dataModel.StockData;

/**
 * @author akhil_ghatiki
 * @date 4/26/2018
 * @time 11:15 AM
 */
public class DataSource {

    /*This is class with static instance. All the data from the aplhavantage API and database will be stored in this instance.
     * */
    private static DataSource Instance = null;

    private StockData m_stockData;

    /***
     * Constructor is made private to avoid making instances of this class.All the access to data in this class should happen through the static instance only.
     */
    private DataSource() {

    }

    public static DataSource getInstance() {
        if (Instance == null) {
            Instance = new DataSource();
        }
        return Instance;
    }

    public StockData getStockData() {
        return m_stockData;
    }

    public void setStockData(StockData m_stockData) {
        this.m_stockData = m_stockData;
    }
}

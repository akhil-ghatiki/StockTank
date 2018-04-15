package org.aghatiki.stocktank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    @JsonProperty("id")
    private Long id;

    // @JsonProperty("quote")
    //private String quote;

    public Value() {
    }

    public Long getId() {
        return this.id;
    }

   /* public String getQuote() {
        return this.quote;
    }*/

    public void setId(Long id) {
        this.id = id;
    }

    /*public void setQuote(String quote) {
        this.quote = quote;
    }
*/
    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                //", quote='" + quote + '\'' +
                '}';
    }
}
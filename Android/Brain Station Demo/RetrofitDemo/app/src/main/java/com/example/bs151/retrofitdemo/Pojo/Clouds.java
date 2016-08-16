package com.example.bs151.retrofitdemo.Pojo;

/**
 * Created by BS151 on 7/19/2016.
 */
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Clouds {
    @SerializedName("all")
    @Expose
    private long all;

    /**
     *
     * @return
     * The all
     */
    public long getAll() {
        return all;
    }

    /**
     *
     * @param all
     * The all
     */
    public void setAll(long all) {
        this.all = all;
    }
}

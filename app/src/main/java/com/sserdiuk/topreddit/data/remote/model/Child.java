
package com.sserdiuk.topreddit.data.remote.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Child {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("data")
    @Expose
    private RemotePostEntity data;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public RemotePostEntity getData() {
        return data;
    }

    public void setData(RemotePostEntity data) {
        this.data = data;
    }

}

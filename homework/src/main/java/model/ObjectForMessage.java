package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ObjectForMessage implements Serializable {
    private List<String> data = new ArrayList<>();

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        for(String str : data)
        {
            this.data.add(str);
        }
       // this.data = data;
    }
}
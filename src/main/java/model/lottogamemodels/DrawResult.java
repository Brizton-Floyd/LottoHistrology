package model.lottogamemodels;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DrawResult {

    private Date drawDate;
    private String drawResult;
    private List<DrawResult> results;

    public DrawResult(){
        results = new ArrayList<>();
    }

    public List<DrawResult> getResults() {
        return results;
    }
}

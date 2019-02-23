package model.lottogamemodels;

import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class DrawResult {

    public static int drawNumberCount = 0;
    private LocalDate drawDate;
    private String drawResult;
    private int drawNumber;
    private String bonusNumber = "0";
    private List<DrawResult> results;

    public DrawResult(){
        results = new ArrayList<>();
    }

    public void setDrawResults(List<DrawResult> drawResults){
        this.results = new ArrayList<>(drawResults);
    }


    public static void formatDrawData(String drawData, DrawResult result){
        List<String> data = new ArrayList<>( Arrays.asList(drawData.split(",")) );
        List<Integer> drawNumbers = data.subList(4, data.size()).stream().map(Integer::parseInt).collect(Collectors.toList());
        if(drawNumbers.size() == 7){
            drawNumbers.remove(drawNumbers.size() -1);
            result.bonusNumber = Integer.toString(drawNumbers.get(drawNumbers.size()-1));
            drawNumbers.remove(drawNumbers.size()-1);
        }
        Collections.sort(drawNumbers);

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < drawNumbers.size(); i++){
            String numAsString = Integer.toString(drawNumbers.get(i));
            if(numAsString.length() == 1){
                numAsString = "0"+numAsString;
            }

            builder.append(numAsString).append("-");
        }

        data.remove(0);
        String[] date = new String[data.subList(0,4).size()];
        date = data.subList(0,3).toArray(date);
        String dateString = convertToDateString(date);

        builder.setCharAt(builder.lastIndexOf("-"),' ');
        result.drawResult = builder.toString().trim();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        result.drawDate = LocalDate.parse(dateString, formatter);
        result.drawNumber = ++DrawResult.drawNumberCount;
        System.out.println(Arrays.toString(data.toArray()));
    }

    private static String convertToDateString(String[] date) {
        StringBuilder builder = new StringBuilder();
        for(String d : date){
            if(d==null)
                continue;

            if(d.length() == 1){
                d = "0"+d;
                builder.append(d).append("/");
            }
            else {
                builder.append(d).append("/");

            }
        }

        builder.setCharAt(builder.lastIndexOf("/"),' ');
        return builder.toString().trim();
    }

    public List<DrawResult> getResults() {
        return results;
    }

    public LocalDate getDrawDate() {
        return drawDate;
    }

    public String getDrawResult() {
        return drawResult;
    }

    public String getBonusNumber() {
        return bonusNumber;
    }

    public int getDrawNumber() {
        return drawNumber;
    }
}

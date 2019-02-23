package constants;

public enum URLs {
    TEXAS_CASH_FIVE("https://txlottery.org/export/sites/lottery/Games/Cash_Five/Winning_Numbers/cashfive.csv","Cash Five"),
    POWERBALL("https://txlottery.org/export/sites/lottery/Games/Powerball/Winning_Numbers/powerball.csv","Powerball"),
    MEGAMILLIONS("https://txlottery.org/export/sites/lottery/Games/Mega_Millions/Winning_Numbers/megamillions.csv","MegaMillions"),
    LOTTO_TEXAS("https://txlottery.org/export/sites/lottery/Games/Lotto_Texas/Winning_Numbers/lottotexas.csv","Lotto Texas"),
    TEXAS_TWO_STEP("https://txlottery.org/export/sites/lottery/Games/Texas_Two_Step/Winning_Numbers/texastwostep.csv","Texas Two Step"),
    PICK_THREE_MORINING("https://txlottery.org/export/sites/lottery/Games/Pick_3/Winning_Numbers/pick3morning.csv","Pick 3 Morning"),
    PICK_THREE_DAY("https://txlottery.org/export/sites/lottery/Games/Pick_3/Winning_Numbers/pick3day.csv", "Pick 3 Day"),
    PICK_THREE_EVENING("https://txlottery.org/export/sites/lottery/Games/Pick_3/Winning_Numbers/pick3evening.csv", "Pick 3 Evening"),
    PICK_THREE_NIGHT("https://txlottery.org/export/sites/lottery/Games/Pick_3/Winning_Numbers/pick3night.csv","Pick 3 Night"),
    DAILY_FOUR_MORNING("https://txlottery.org/export/sites/lottery/Games/Daily_4/Winning_Numbers/daily4morning.csv","Pick 4 Morning"),
    DAILY_FOUR_DAY("https://txlottery.org/export/sites/lottery/Games/Daily_4/Winning_Numbers/daily4day.csv","Pick 4 Day"),
    DAILY_FOUR_EVENING("https://txlottery.org/export/sites/lottery/Games/Daily_4/Winning_Numbers/daily4evening.csv","Pick 4 Evening"),
    DAILY_FOUR_NIGHT("https://txlottery.org/export/sites/lottery/Games/Daily_4/Winning_Numbers/daily4night.csv","Pick 4 Night");

    private String url;
    private String gameName;

    URLs(String url, String gameName){
        this.url = url;
        this.gameName = gameName;
    }

    public String getUrl(){
        return url;
    }

    public String getGameName(){return gameName;}
}

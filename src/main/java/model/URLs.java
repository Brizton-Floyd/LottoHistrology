package model;

public enum URLs {
    TEXAS_CASH_FIVE("https://txlottery.org/export/sites/lottery/Games/Cash_Five/Winning_Numbers/cashfive.csv"),
    POWERBALL("https://txlottery.org/export/sites/lottery/Games/Powerball/Winning_Numbers/powerball.csv"),
    MEGAMILLIONS("https://txlottery.org/export/sites/lottery/Games/Mega_Millions/Winning_Numbers/megamillions.csv"),
    LOTTO_TEXAS("https://txlottery.org/export/sites/lottery/Games/Lotto_Texas/Winning_Numbers/lottotexas.csv"),
    TEXAS_TWO_STEP("https://txlottery.org/export/sites/lottery/Games/Texas_Two_Step/Winning_Numbers/texastwostep.csv"),
    PICK_THREE_MORINING("https://txlottery.org/export/sites/lottery/Games/Pick_3/Winning_Numbers/pick3morning.csv"),
    PICK_THREE_DAY("https://txlottery.org/export/sites/lottery/Games/Pick_3/Winning_Numbers/pick3day.csv"),
    PICK_THREE_EVENING("https://txlottery.org/export/sites/lottery/Games/Pick_3/Winning_Numbers/pick3evening.csv"),
    PICK_THREE_NIGHT("https://txlottery.org/export/sites/lottery/Games/Pick_3/Winning_Numbers/pick3night.csv"),
    DAILY_FOUR_MORNING("https://txlottery.org/export/sites/lottery/Games/Daily_4/Winning_Numbers/daily4morning.csv"),
    DAILY_FOUR_DAY("https://txlottery.org/export/sites/lottery/Games/Daily_4/Winning_Numbers/daily4day.csv"),
    DAILY_FOUR_EVENING("https://txlottery.org/export/sites/lottery/Games/Daily_4/Winning_Numbers/daily4evening.csv"),
    DAILY_FOUR_NIGHT("https://txlottery.org/export/sites/lottery/Games/Daily_4/Winning_Numbers/daily4night.csv");

    private String url;

    URLs(String url){
        this.url = url;
    }

    public String getUrl(){
        return url;
    }
}

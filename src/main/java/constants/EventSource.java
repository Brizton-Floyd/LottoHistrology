package constants;

public enum EventSource {

    BET_SLIP_ANALYSIS("Bet Slip Analysis"),
    GAME_PANEL("Load Game Panel"),
    GAP_SPACING("Gap Spacing Chart"),
    LOTTO_DASHBOARD("Lotto Dashboard"),
    GAME_OUT_ANALYSIS("Game Out Chart"),
    LOTTERY_NUMBER_GAPS("Lottery Number Gaps"),
    COMPANION_NUMBER("Companion Numbers"),
    POSITION_HIT_SEQUENCE("Position Sequence Chart"),
    MULTiPLE("Multiple Chart");

    private String text;

    EventSource(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

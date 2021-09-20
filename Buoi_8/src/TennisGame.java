public class TennisGame {
    public static final int zeroPoint = 0;
    public static final int onePoint = 1;
    public static final int twoPoints = 2;
    public static final int threePoint = 3;
    public static String getScore(String player1Name, String player2Name, int playerScore1, int playerScore2) {
        boolean isEqualPlayerScore = (playerScore1 == playerScore2);
        String score = "";
        int tempScore = 0;
        if (isEqualPlayerScore) {
            switch (playerScore1) {
                case zeroPoint:
                    score = "Love-All";
                    break;
                case onePoint:
                    score = "Fifteen-All";
                    break;
                case twoPoints:
                    score = "Thirty-All";
                    break;
                case threePoint:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (playerScore1 >= 4 || playerScore2 >= 4) {
            int minusResult = playerScore1 - playerScore2;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = playerScore1;
                else {
                    score += "-";
                    tempScore = playerScore2;
                }
                switch (tempScore) {
                    case zeroPoint:
                        score += "Love";
                        break;
                    case onePoint:
                        score += "Fifteen";
                        break;
                    case twoPoints:
                        score += "Thirty";
                        break;
                    case threePoint:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}

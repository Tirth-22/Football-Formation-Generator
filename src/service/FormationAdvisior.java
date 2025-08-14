package service;

import model.Player;

public class FormationAdvisior {

    public static String advise(int matchType, Player[] team) {
        int defenders = 0, attackers = 0, midfielders= 0;

        for (Player p : team) {
            String pos = p.getPosition();

            if (pos.equals("GK")) {
                continue;
            }
            if (pos.equals("LB") || pos.equals("RB") || pos.equals("CB")) {
                defenders++;
            } else if (pos.equals("LM") || pos.equals("RM") || pos.equals("CM") || pos.equals("CAM")) {
                midfielders++;
            } else if (pos.equals("ST") || pos.equals("LW") || pos.equals("RW") || pos.equals("CF")) {
                attackers++;
            }
        }

        StringBuffer sb = new StringBuffer();

        sb.append("Player Distribution -> Defenders : ").append(defenders).append(", midfielders: ").append(midfielders)
            .append(", attackers : ").append(attackers).append("\n");
        
        if (matchType == 1) {
            if (defenders >= 4 && midfielders >= 3 && attackers >= 2) {
                sb.append("- 4-4-2\n- 4-3-3\n- 3-5-2\n");
            } else if (defenders < 4) {
                sb.append("- 3-4-3 (more attacking)\n- 3-5-2\n- 4-3-3\n");
            } else {
                sb.append("- 5-3-2 (more defensive)\n- 4-4-2\n- 4-2-3-1\n");
            }
        } else if (matchType == 2) {
            if (defenders >= 5) {
                sb.append("- 5-3-2\n- 5-4-1\n- 4-5-1\n");
            } else if (midfielders >= 4) {
                sb.append("- 4-2-3-1\n- 4-3-3\n- 4-4-2\n");
            } else {
                sb.append("- 4-3-3\n- 3-5-2\n- 4-4-2\n");
            }
        } else if (matchType == 3) {
            if (defenders >= 4 && midfielders >= 4) {
                sb.append("- 4-3-3\n- 4-5-1\n- 4-2-3-1\n");
            } else {
                sb.append("- 4-4-2\n- 5-4-1\n- 3-5-2\n");
            }
        } else {
            sb.append("Unknown match type.\n");
        }
        return sb.toString();
    }
}

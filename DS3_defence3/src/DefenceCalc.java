public class DefenceCalc {
    int min;
    int defMax;
    int defIncrement;
    int atkMax;
    int atkIncrement;

    public DefenceCalc(int min, int defMax, int defIncrement, int atkMax, int atkIncrement) {
        this.min = min;
        this.defMax = defMax;
        this.defIncrement = defIncrement;
        this.atkMax = atkMax;
        this.atkIncrement = atkIncrement;
    }

    public String lineZero() {
        String output = "0 ";
        for (int i=min; i<=defMax; i+=defIncrement) {
            output += (i + " ");
        }
        return output;
    }

    public String line(int atk) {
        String output = (atk + " ");
        double value=0;
        for (int def=min; def<=defMax; def+=defIncrement) {
            if (def > 8*(double)atk) value = 0.1 *(double)atk;
            else if ((double)def > (double)atk) value = (19.2/49 * ((double)atk/(double)def-0.125)*((double)atk/(double)def-0.125) +0.1) * (double)atk;
            else if ((double)def > 0.4*(double)atk) value = (-0.4/3 * ((double)atk/(double)def-2.5)*((double)atk/(double)def-2.5) +0.7) * (double)atk;
            else if ((double)def > 0.125*(double)atk) value = (-0.8/121 * ((double)atk/(double)def-8)*((double)atk/(double)def-8) +0.9) * (double)atk;
            else value = 0.9 *(double)atk;
            output += ((int)value + " ");
        }
        return output;
    }
}

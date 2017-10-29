package by.epam.jb.les06;

/**
 * Created by Anastasiya_Rahonskay on 10/27/2017.
 */
public class Rational {
    private int num;
    private int den;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public boolean isValidDen(int den) {
        if (den > 0) {
            return true;
        } else {
            return false;
        }
    }
}

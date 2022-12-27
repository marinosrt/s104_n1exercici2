package Main;

import java.util.*;
public class CalculoDNI {

    public CalculoDNI(){
    }

    public char getDNI(String num){
        char[] letter = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letter[Integer.parseInt(num)%23];
    }


}

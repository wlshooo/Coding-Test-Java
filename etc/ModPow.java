package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ModPow {
    public static void main(String[] args) throws IOException {
        BigInteger number, mod, exponent;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("숫자 입력");
        number = BigInteger.valueOf(Integer.parseInt(br.readLine()));

        System.out.println("지수 승 입력");
        exponent = BigInteger.valueOf(Integer.parseInt(br.readLine()));

        System.out.println("mod 입력");
        mod = BigInteger.valueOf(Integer.parseInt(br.readLine()));


        BigInteger modpow = number.modPow(exponent,mod);

        String str = number + "^" +exponent+ " mod " + mod + " is " +modpow;
        System.out.println(str);
       
    }
}

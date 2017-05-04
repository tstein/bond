package com.microsoft.bond.protocol;

import java.math.BigInteger;

public class UnsignedHelper {
    private final static BigInteger TWO_TO_65;
    private final static BigInteger LONG_MAX_PLUS_ONE;
    static {
        BigInteger ulong_max = BigInteger.valueOf(Long.MAX_VALUE);
        ulong_max = ulong_max.add(BigInteger.ONE);
        ulong_max = ulong_max.add(ulong_max);
        TWO_TO_65 = ulong_max;

        BigInteger long_max_plus_one = BigInteger.valueOf(Long.MAX_VALUE);
        long_max_plus_one = long_max_plus_one.add(BigInteger.ONE);
        LONG_MAX_PLUS_ONE = long_max_plus_one;
    }

    public static short asUnsignedShort(byte signed) {
        return (short) (signed & 0xFF);
    }

    public static int asUnsignedInt(short signed) {
        return signed & 0xFFFF;
    }

    public static long asUnsignedLong(int signed) {
        return signed & 0xFFFFFFFFL;
    }

    public static BigInteger asUnsignedBigInt(long signed) {
        if (signed >= 0) {
            return BigInteger.valueOf(signed);
        } else if (signed == Long.MIN_VALUE) {
            return LONG_MAX_PLUS_ONE;
        } else {
            return TWO_TO_65.add(BigInteger.valueOf(signed));
        }
    }
}

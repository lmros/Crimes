
public class UsCrimeObject {

    //Percentage of growth for each consecutive year.
    static void popGrowth(UsCrimeClass[] data) {
        float growthRate;
        System.out.println("Population Growth Year to Year");
        System.out.println("------------------------------");
        for (int i = 0; i < data.length - 1; i++) {
            growthRate = 100 * (float) (data[i + 1].getPopulation() - data[i].getPopulation()) / data[i].getPopulation();
            System.out.println("From " + data[i].getYear() + " to " + data[i + 1].getYear() + " the percentage of growth increased by: "
                    + String.format("%.4f", growthRate) + "%.");
        }
    }

    //Violent Crimes Total High Year
    public static int vCrimeTotalYearHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeTotalYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() > vCrimeTotalYearHi) {
            vCrimeTotalYearHi = crime.getViolentCrimeTotal();
            year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes High Total
    public static int vCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int vCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMurderRate() > vCrimeTotalHi) {
            vCrimeTotalHi = crime.getViolentCrimeTotal();
            year = crime.getYear();
            }
        }
        return vCrimeTotalHi;
    }

    //Violent Crimes Total Low Year
    public static int vCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeTotalYearLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalYearLo) {
                vCrimeTotalYearLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Total Low
    public static int vCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int vCrimeTotalLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalLo) {
                vCrimeTotalLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return vCrimeTotalLo;
    }

    //Violent Crimes Rate High Year
    public static int vCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateYearHi) {
                vCrimeRateYearHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate high
    public static float vCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateHi) {
                vCrimeRateHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateHi;
    }

    //Violent Crimes Rate low year
    public static int vCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateYearLo) {
                vCrimeRateYearLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate Low
    public static float vCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateLo) {
                vCrimeRateLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateLo;
    }

    //Murder Total High Year
    public static int mCrimeTotalYearHi(UsCrimeClass[] data) {
        int year = 0;
        float mCrimeTotalYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMurderTotal() > mCrimeTotalYearHi) {
                mCrimeTotalYearHi = crime.getMurderTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes High Total
    public static int mCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int mCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMurderTotal() > mCrimeTotalHi) {
                mCrimeTotalHi = crime.getMurderTotal();
                year = crime.getYear();
            }
        }
        return mCrimeTotalHi;
    }

    //Violent Crimes Total Low Year
    public static int mCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float mCrimeTotalYearLo = data[0].getMurderTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getMurderTotal() < mCrimeTotalYearLo) {
                mCrimeTotalYearLo = crime.getMurderTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Total Low
    public static int mCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int mCrimeTotalLo = data[0].getMurderTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getMurderTotal() < mCrimeTotalLo) {
                mCrimeTotalLo = crime.getMurderTotal();
                year = crime.getYear();
            }
        }
        return mCrimeTotalLo;
    }

    //Violent Crimes Rate High Year
    public static int mCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float mCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMurderRate() > mCrimeRateYearHi) {
                mCrimeRateYearHi = crime.getMurderRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate high
    public static float mCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float mCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMurderRate() > mCrimeRateHi) {
                mCrimeRateHi = crime.getMurderRate();
                year = crime.getYear();
            }
        }
        return mCrimeRateHi;
    }

    //Violent Crimes Rate low year
    public static int mCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float mCrimeRateYearLo = data[0].getMurderRate();
        for (UsCrimeClass crime : data) {
            if (crime.getMurderRate() < mCrimeRateYearLo) {
                mCrimeRateYearLo = crime.getMurderRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate Low
    public static float mCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float mCrimeRateLo = data[0].getMurderRate();
        for (UsCrimeClass crime : data) {
            if (crime.getMurderRate() < mCrimeRateLo) {
                vCrimeRateLo = crime.getMurderRate();
                year = crime.getYear();
            }
        }
        return mCrimeRateLo;
    }

    //Rape Crimes Total High Year
    public static int rCrimeTotalYearHi(UsCrimeClass[] data) {
        int year = 0;
        float rCrimeTotalYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getRapeTotal() > rCrimeTotalYearHi) {
                rCrimeTotalYearHi = crime.getRapeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes High Total
    public static int rCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int rCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getRapeTotal() > rCrimeTotalHi) {
                vCrimeTotalHi = crime.getRapeTotal();
                year = crime.getYear();
            }
        }
        return rCrimeTotalHi;
    }

    //Violent Crimes Total Low Year
    public static int rCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float rCrimeTotalYearLo = data[0].getRapeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getRapeTotal() < rCrimeTotalYearLo) {
                rCrimeTotalYearLo = crime.getRapeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Total Low
    public static int rCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int rCrimeTotalLo = data[0].getRapeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getRapeTotal() < rCrimeTotalLo) {
                rCrimeTotalLo = crime.getRapeTotal();
                year = crime.getYear();
            }
        }
        return rCrimeTotalLo;
    }

    //Violent Crimes Rate High Year
    public static int rCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float rCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getRapeRate() > rCrimeRateYearHi) {
                rCrimeRateYearHi = crime.getRapeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate high
    public static float rCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float rCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getRapeRate() > rCrimeRateHi) {
                rCrimeRateHi = crime.getRapeRate();
                year = crime.getYear();
            }
        }
        return rCrimeRateHi;
    }

    //Violent Crimes Rate low year
    public static int rCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float rCrimeRateYearLo = data[0].getRapeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getRapeRate() < rCrimeRateYearLo) {
                rCrimeRateYearLo = crime.getRapeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate Low
    public static float rCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float rCrimeRateLo = data[0].getRapeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getRapeRate() < rCrimeRateLo) {
                rCrimeRateLo = crime.getRapeRate();
                year = crime.getYear();
            }
        }
        return rCrimeRateLo;
    }

    //Robbery Crimes Total High Year
    public static int rbCrimeTotalYearHi(UsCrimeClass[] data) {
        int year = 0;
        float rbCrimeTotalYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getRobberyTotal() > rbCrimeTotalYearHi) {
                rbCrimeTotalYearHi = crime.getRobberyTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes High Total
    public static int rbCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int rbCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMurderRate() > vCrimeTotalHi) {
                vCrimeTotalHi = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return vCrimeTotalHi;
    }

    //Violent Crimes Total Low Year
    public static int vCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeTotalYearLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalYearLo) {
                vCrimeTotalYearLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Total Low
    public static int vCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int vCrimeTotalLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalLo) {
                vCrimeTotalLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return vCrimeTotalLo;
    }

    //Violent Crimes Rate High Year
    public static int vCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateYearHi) {
                vCrimeRateYearHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate high
    public static float vCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateHi) {
                vCrimeRateHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateHi;
    }

    //Violent Crimes Rate low year
    public static int vCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateYearLo) {
                vCrimeRateYearLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate Low
    public static float vCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateLo) {
                vCrimeRateLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateLo;
    }

    //Violent Crimes Total High Year
    public static int vCrimeTotalYearHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeTotalYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() > vCrimeTotalYearHi) {
                vCrimeTotalYearHi = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes High Total
    public static int vCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int vCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMurderRate() > vCrimeTotalHi) {
                vCrimeTotalHi = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return vCrimeTotalHi;
    }

    //Violent Crimes Total Low Year
    public static int vCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeTotalYearLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalYearLo) {
                vCrimeTotalYearLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Total Low
    public static int vCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int vCrimeTotalLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalLo) {
                vCrimeTotalLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return vCrimeTotalLo;
    }

    //Violent Crimes Rate High Year
    public static int vCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateYearHi) {
                vCrimeRateYearHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate high
    public static float vCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateHi) {
                vCrimeRateHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateHi;
    }

    //Violent Crimes Rate low year
    public static int vCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateYearLo) {
                vCrimeRateYearLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate Low
    public static float vCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateLo) {
                vCrimeRateLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateLo;
    }

    //Violent Crimes Total High Year
    public static int vCrimeTotalYearHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeTotalYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() > vCrimeTotalYearHi) {
                vCrimeTotalYearHi = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes High Total
    public static int vCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int vCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMurderRate() > vCrimeTotalHi) {
                vCrimeTotalHi = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return vCrimeTotalHi;
    }

    //Violent Crimes Total Low Year
    public static int vCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeTotalYearLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalYearLo) {
                vCrimeTotalYearLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Total Low
    public static int vCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int vCrimeTotalLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalLo) {
                vCrimeTotalLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return vCrimeTotalLo;
    }

    //Violent Crimes Rate High Year
    public static int vCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateYearHi) {
                vCrimeRateYearHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate high
    public static float vCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateHi) {
                vCrimeRateHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateHi;
    }

    //Violent Crimes Rate low year
    public static int vCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateYearLo) {
                vCrimeRateYearLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate Low
    public static float vCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateLo) {
                vCrimeRateLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateLo;
    }

    //Violent Crimes Total High Year
    public static int vCrimeTotalYearHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeTotalYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() > vCrimeTotalYearHi) {
                vCrimeTotalYearHi = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes High Total
    public static int vCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int vCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMurderRate() > vCrimeTotalHi) {
                vCrimeTotalHi = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return vCrimeTotalHi;
    }

    //Violent Crimes Total Low Year
    public static int vCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeTotalYearLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalYearLo) {
                vCrimeTotalYearLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Total Low
    public static int vCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int vCrimeTotalLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalLo) {
                vCrimeTotalLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return vCrimeTotalLo;
    }

    //Violent Crimes Rate High Year
    public static int vCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateYearHi) {
                vCrimeRateYearHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate high
    public static float vCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateHi) {
                vCrimeRateHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateHi;
    }

    //Violent Crimes Rate low year
    public static int vCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateYearLo) {
                vCrimeRateYearLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate Low
    public static float vCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateLo) {
                vCrimeRateLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateLo;
    }

    //Violent Crimes Total High Year
    public static int vCrimeTotalYearHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeTotalYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() > vCrimeTotalYearHi) {
                vCrimeTotalYearHi = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes High Total
    public static int vCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int vCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMurderRate() > vCrimeTotalHi) {
                vCrimeTotalHi = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return vCrimeTotalHi;
    }

    //Violent Crimes Total Low Year
    public static int vCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeTotalYearLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalYearLo) {
                vCrimeTotalYearLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Total Low
    public static int vCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int vCrimeTotalLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalLo) {
                vCrimeTotalLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return vCrimeTotalLo;
    }

    //Violent Crimes Rate High Year
    public static int vCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateYearHi) {
                vCrimeRateYearHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate high
    public static float vCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateHi) {
                vCrimeRateHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateHi;
    }

    //Violent Crimes Rate low year
    public static int vCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateYearLo) {
                vCrimeRateYearLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate Low
    public static float vCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateLo) {
                vCrimeRateLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateLo;
    }

    //Violent Crimes Total High Year
    public static int vCrimeTotalYearHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeTotalYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() > vCrimeTotalYearHi) {
                vCrimeTotalYearHi = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes High Total
    public static int vCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int vCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMurderRate() > vCrimeTotalHi) {
                vCrimeTotalHi = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return vCrimeTotalHi;
    }

    //Violent Crimes Total Low Year
    public static int vCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeTotalYearLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalYearLo) {
                vCrimeTotalYearLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Total Low
    public static int vCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int vCrimeTotalLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalLo) {
                vCrimeTotalLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return vCrimeTotalLo;
    }

    //Violent Crimes Rate High Year
    public static int vCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateYearHi) {
                vCrimeRateYearHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate high
    public static float vCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateHi) {
                vCrimeRateHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateHi;
    }

    //Violent Crimes Rate low year
    public static int vCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateYearLo) {
                vCrimeRateYearLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate Low
    public static float vCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateLo) {
                vCrimeRateLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateLo;
    }

    //Violent Crimes Total High Year
    public static int vCrimeTotalYearHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeTotalYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() > vCrimeTotalYearHi) {
                vCrimeTotalYearHi = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes High Total
    public static int vCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int vCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMurderRate() > vCrimeTotalHi) {
                vCrimeTotalHi = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return vCrimeTotalHi;
    }

    //Violent Crimes Total Low Year
    public static int vCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeTotalYearLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalYearLo) {
                vCrimeTotalYearLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Total Low
    public static int vCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int vCrimeTotalLo = data[0].getViolentCrimeTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeTotal() < vCrimeTotalLo) {
                vCrimeTotalLo = crime.getViolentCrimeTotal();
                year = crime.getYear();
            }
        }
        return vCrimeTotalLo;
    }

    //Violent Crimes Rate High Year
    public static int vCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateYearHi) {
                vCrimeRateYearHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate high
    public static float vCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() > vCrimeRateHi) {
                vCrimeRateHi = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateHi;
    }

    //Violent Crimes Rate low year
    public static int vCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateYearLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateYearLo) {
                vCrimeRateYearLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Violent Crimes Rate Low
    public static float vCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float vCrimeRateLo = data[0].getViolentCrimeRate();
        for (UsCrimeClass crime : data) {
            if (crime.getViolentCrimeRate() < vCrimeRateLo) {
                vCrimeRateLo = crime.getViolentCrimeRate();
                year = crime.getYear();
            }
        }
        return vCrimeRateLo;
    }

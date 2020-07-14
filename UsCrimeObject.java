
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
    //Violent Crimes Low Total
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
    //Murder High Total
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

    //Murder Total Low Year
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
    //Murder Total Low
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

    //Murder Rate High Year
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
    //Murder Rate high
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

    //Murder Rate low year
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
    //Murder Rate Low
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
    //Rape Crimes High Total
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

    //Rape Crimes Total Low Year
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
    //Rape Crimes Total Low
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

    //Rape Crimes Rate High Year
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
    //Rape Crimes Rate high
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

    //Rape Crimes Rate low year
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
    //Rape Crimes Rate Low
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
    //Robbery Crimes High Total
    public static int rbCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int rbCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getRobberyTotal() > rbCrimeTotalHi) {
                rbCrimeTotalHi = crime.getRobberyTotal();
                year = crime.getYear();
            }
        }
        return rbCrimeTotalHi;
    }

    //Robbery Crimes Total Low Year
    public static int rbCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float rbCrimeTotalYearLo = data[0].getRobberyTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getRobberyTotal() < rbCrimeTotalYearLo) {
                rbCrimeTotalYearLo = crime.getRobberyTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Robbery Crimes Total Low
    public static int rbCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int rbCrimeTotalLo = data[0].getRobberyTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getRobberyTotal() < rbCrimeTotalLo) {
                rbCrimeTotalLo = crime.getRobberyTotal();
                year = crime.getYear();
            }
        }
        return rbCrimeTotalLo;
    }

    //Robbery Crimes Rate High Year
    public static int rbCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float rbCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getRobberyRate() > rbCrimeRateYearHi) {
                rbCrimeRateYearHi = crime.getRobberyRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Robbery Crimes Rate high
    public static float rbCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float rbCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getRobberyRate() > rbCrimeRateHi) {
                rbCrimeRateHi = crime.getRobberyRate();
                year = crime.getYear();
            }
        }
        return rbCrimeRateHi;
    }

    //Robbery Crimes Rate low year
    public static int rbCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float rbCrimeRateYearLo = data[0].getRobberyRate();
        for (UsCrimeClass crime : data) {
            if (crime.getRobberyRate() < rbCrimeRateYearLo) {
                rbCrimeRateYearLo = crime.getRobberyRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Robbery Crimes Rate Low
    public static float rbCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float rbCrimeRateLo = data[0].getRobberyRate();
        for (UsCrimeClass crime : data) {
            if (crime.getRobberyRate() < rbCrimeRateLo) {
                rbCrimeRateLo = crime.getRobberyRate();
                year = crime.getYear();
            }
        }
        return rbCrimeRateLo;
    }

    //Assault Crimes Total High Year
    public static int aCrimeTotalYearHi(UsCrimeClass[] data) {
        int year = 0;
        float aCrimeTotalYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getAssaultTotal() > aCrimeTotalYearHi) {
                aCrimeTotalYearHi = crime.getAssaultTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Assault Crimes High Total
    public static int aCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int aCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getAssaultTotal() > aCrimeTotalHi) {
                aCrimeTotalHi = crime.getAssaultTotal();
                year = crime.getYear();
            }
        }
        return aCrimeTotalHi;
    }

    //Assault Crimes Total Low Year
    public static int aCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float aCrimeTotalYearLo = data[0].getAssaultTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getAssaultTotal() < aCrimeTotalYearLo) {
                aCrimeTotalYearLo = crime.getAssaultTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Assault Crimes Total Low
    public static int aCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int aCrimeTotalLo = data[0].getAssaultTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getAssaultTotal() < aCrimeTotalLo) {
                aCrimeTotalLo = crime.getAssaultTotal();
                year = crime.getYear();
            }
        }
        return aCrimeTotalLo;
    }

    //Assault Crimes Rate High Year
    public static int aCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float aCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getAssaultRate() > aCrimeRateYearHi) {
                aCrimeRateYearHi = crime.getAssaultRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Assault Crimes Rate high
    public static float aCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float aCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getAssaultRate() > aCrimeRateHi) {
                aCrimeRateHi = crime.getAssaultRate();
                year = crime.getYear();
            }
        }
        return aCrimeRateHi;
    }

    //Violent Crimes Rate low year
    public static int aCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float aCrimeRateYearLo = data[0].getAssaultRate();
        for (UsCrimeClass crime : data) {
            if (crime.getAssaultRate() < aCrimeRateYearLo) {
                aCrimeRateYearLo = crime.getAssaultRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Assault Crimes Rate Low
    public static float aCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float aCrimeRateLo = data[0].getAssaultRate();
        for (UsCrimeClass crime : data) {
            if (crime.getAssaultRate() < aCrimeRateLo) {
                aCrimeRateLo = crime.getAssaultRate();
                year = crime.getYear();
            }
        }
        return aCrimeRateLo;
    }

    //Property Crimes Total High Year
    public static int pCrimeTotalYearHi(UsCrimeClass[] data) {
        int year = 0;
        float pCrimeTotalYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getPropertyTotal() > pCrimeTotalYearHi) {
                pCrimeTotalYearHi = crime.getPropertyTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Property Crimes High Total
    public static int pCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int pCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getPropertyTotal() > pCrimeTotalHi) {
                pCrimeTotalHi = crime.getPropertyTotal();
                year = crime.getYear();
            }
        }
        return pCrimeTotalHi;
    }

    //Property Crimes Total Low Year
    public static int pCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float pCrimeTotalYearLo = data[0].getPropertyTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getPropertyTotal() < pCrimeTotalYearLo) {
                pCrimeTotalYearLo = crime.getPropertyTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Property Crimes Total Low
    public static int pCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int pCrimeTotalLo = data[0].getPropertyTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getPropertyTotal() < pCrimeTotalLo) {
                pCrimeTotalLo = crime.getPropertyTotal();
                year = crime.getYear();
            }
        }
        return pCrimeTotalLo;
    }

    //Property Crimes Rate High Year
    public static int pCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float pCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getPropertyRate() > pCrimeRateYearHi) {
                pCrimeRateYearHi = crime.getPropertyRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Property Crimes Rate high
    public static float pCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float pCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getPropertyRate() > pCrimeRateHi) {
                pCrimeRateHi = crime.getPropertyRate();
                year = crime.getYear();
            }
        }
        return pCrimeRateHi;
    }

    //Property Crimes Rate low year
    public static int pCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float pCrimeRateYearLo = data[0].getPropertyRate();
        for (UsCrimeClass crime : data) {
            if (crime.getPropertyRate() < pCrimeRateYearLo) {
                pCrimeRateYearLo = crime.getPropertyRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Property Crimes Rate Low
    public static float pCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float pCrimeRateLo = data[0].getPropertyRate();
        for (UsCrimeClass crime : data) {
            if (crime.getPropertyRate() < pCrimeRateLo) {
                pCrimeRateLo = crime.getPropertyRate();
                year = crime.getYear();
            }
        }
        return pCrimeRateLo;
    }

    //Burglary Crimes Total High Year
    public static int bCrimeTotalYearHi(UsCrimeClass[] data) {
        int year = 0;
        float bCrimeTotalYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getBurglaryTotal() > bCrimeTotalYearHi) {
                bCrimeTotalYearHi = crime.getBurglaryTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Burglary Crimes High Total
    public static int bCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int bCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getBurglaryTotal() > bCrimeTotalHi) {
                bCrimeTotalHi = crime.getBurglaryTotal();
                year = crime.getYear();
            }
        }
        return bCrimeTotalHi;
    }

    //Burglary Crimes Total Low Year
    public static int bCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float bCrimeTotalYearLo = data[0].getBurglaryTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getBurglaryTotal() < bCrimeTotalYearLo) {
                bCrimeTotalYearLo = crime.getBurglaryTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Burglary Crimes Total Low
    public static int bCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int bCrimeTotalLo = data[0].getBurglaryTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getBurglaryTotal() < bCrimeTotalLo) {
                bCrimeTotalLo = crime.getBurglaryTotal();
                year = crime.getYear();
            }
        }
        return bCrimeTotalLo;
    }

    //Burglary Crimes Rate High Year
    public static int bCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float bCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getBurglaryRate() > bCrimeRateYearHi) {
                bCrimeRateYearHi = crime.getBurglaryRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Burglary Crimes Rate high
    public static float bCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float bCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getBurglaryRate() > bCrimeRateHi) {
                bCrimeRateHi = crime.getBurglaryRate();
                year = crime.getYear();
            }
        }
        return bCrimeRateHi;
    }

    //Burglary Crimes Rate low year
    public static int bCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float bCrimeRateYearLo = data[0].getBurglaryRate();
        for (UsCrimeClass crime : data) {
            if (crime.getBurglaryRate() < bCrimeRateYearLo) {
                bCrimeRateYearLo = crime.getBurglaryRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Burglary Crimes Rate Low
    public static float bCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float bCrimeRateLo = data[0].getBurglaryRate();
        for (UsCrimeClass crime : data) {
            if (crime.getBurglaryRate() < bCrimeRateLo) {
                bCrimeRateLo = crime.getBurglaryRate();
                year = crime.getYear();
            }
        }
        return bCrimeRateLo;
    }

    //Larceny Crimes Total High Year
    public static int lCrimeTotalYearHi(UsCrimeClass[] data) {
        int year = 0;
        float lCrimeTotalYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getLarcenyTotal() > lCrimeTotalYearHi) {
                lCrimeTotalYearHi = crime.getLarcenyTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Larceny Crimes High Total
    public static int lCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int lCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getLarcenyTotal() > lCrimeTotalHi) {
                lCrimeTotalHi = crime.getLarcenyTotal();
                year = crime.getYear();
            }
        }
        return lCrimeTotalHi;
    }

    //Larceny Crimes Total Low Year
    public static int lCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float lCrimeTotalYearLo = data[0].getLarcenyTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getLarcenyTotal() < lCrimeTotalYearLo) {
                lCrimeTotalYearLo = crime.getLarcenyTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Larceny Crimes Total Low
    public static int lCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int lCrimeTotalLo = data[0].getLarcenyTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getLarcenyTotal() < lCrimeTotalLo) {
                lCrimeTotalLo = crime.getLarcenyTotal();
                year = crime.getYear();
            }
        }
        return lCrimeTotalLo;
    }

    //Larceny Crimes Rate High Year
    public static int lCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float lCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getLarcenyRate() > lCrimeRateYearHi) {
                lCrimeRateYearHi = crime.getLarcenyRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Larceny Crimes Rate high
    public static float lCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float lCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getLarcenyRate() > lCrimeRateHi) {
                lCrimeRateHi = crime.getLarcenyRate();
                year = crime.getYear();
            }
        }
        return lCrimeRateHi;
    }

    //Larceny Crimes Rate low year
    public static int lCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float lCrimeRateYearLo = data[0].getLarcenyRate();
        for (UsCrimeClass crime : data) {
            if (crime.getLarcenyeRate() < lCrimeRateYearLo) {
                lCrimeRateYearLo = crime.getLarcenyRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //Larceny Crimes Rate Low
    public static float lCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float lCrimeRateLo = data[0].getLarcenyRate();
        for (UsCrimeClass crime : data) {
            if (crime.getLarcenyRate() < lCrimeRateLo) {
                lCrimeRateLo = crime.getLarcenyRate();
                year = crime.getYear();
            }
        }
        return lCrimeRateLo;
    }

    //MotorVehicle Crimes Total High Year
    public static int mvCrimeTotalYearHi(UsCrimeClass[] data) {
        int year = 0;
        float mvCrimeTotalYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMotorVehicleTotal() > mvCrimeTotalYearHi) {
                mvCrimeTotalYearHi = crime.getMotorVehicleTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //MotorVehicle Crimes High Total
    public static int mvCrimeTotalHi(UsCrimeClass[] data) {
        int year = 0;
        int mvCrimeTotalHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMotorVehicleTotal() > mvCrimeTotalHi) {
                mvCrimeTotalHi = crime.getMotorVehicleTotal();
                year = crime.getYear();
            }
        }
        return mvCrimeTotalHi;
    }

    //MotorVehicle Crimes Total Low Year
    public static int mvCrimeTotalYearLo(UsCrimeClass[] data) {
        int year = 0;
        float mvCrimeTotalYearLo = data[0].getMotorVehicleTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getMotorVehicleTotal() < mvCrimeTotalYearLo) {
                mvCrimeTotalYearLo = crime.getMotorVehicleTotal();
                year = crime.getYear();
            }
        }
        return year;
    }
    //MotorVehicle Crimes Total Low
    public static int mvCrimeTotalLo(UsCrimeClass[] data) {
        int year = 0;
        int mvCrimeTotalLo = data[0].getMotorVehicleTotal();
        for (UsCrimeClass crime : data) {
            if (crime.getMotorVehicleTotal() < mvCrimeTotalLo) {
                mvCrimeTotalLo = crime.getMotorVehicleTotal();
                year = crime.getYear();
            }
        }
        return mvCrimeTotalLo;
    }

    //MotorVehicle Crimes Rate High Year
    public static int mvCrimeRateYearHi(UsCrimeClass[] data) {
        int year = 0;
        float mvCrimeRateYearHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMotorVehicleRate() > mvCrimeRateYearHi) {
                mvCrimeRateYearHi = crime.getMotorVehicleRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //MotorVehicle Crimes Rate high
    public static float mvCrimeRateHi(UsCrimeClass[] data) {
        int year = 0;
        float mvCrimeRateHi = 0;
        for (UsCrimeClass crime : data) {
            if (crime.getMotorVehicleRate() > mvCrimeRateHi) {
                mvCrimeRateHi = crime.getMotorVehicleRate();
                year = crime.getYear();
            }
        }
        return mvCrimeRateHi;
    }

    //MotorVehicle Crimes Rate low year
    public static int mvCrimeRateYearLo(UsCrimeClass[] data) {
        int year = 0;
        float mvCrimeRateYearLo = data[0].getMotorVehicleRate();
        for (UsCrimeClass crime : data) {
            if (crime.getMotorVehicleRate() < mvCrimeRateYearLo) {
                mvCrimeRateYearLo = crime.getMotorVehicleRate();
                year = crime.getYear();
            }
        }
        return year;
    }
    //MotorVehicle Crimes Rate Low
    public static float mvCrimeRateLo(UsCrimeClass[] data) {
        int year = 0;
        float mvCrimeRateLo = data[0].getMotorVehicleRate();
        for (UsCrimeClass crime : data) {
            if (crime.getMotorVehicleRate() < mvCrimeRateLo) {
                mvCrimeRateLo = crime.getMotorVehicleRate();
                year = crime.getYear();
            }
        }
        return mvCrimeRateLo;
    }
}

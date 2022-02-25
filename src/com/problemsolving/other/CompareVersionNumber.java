package com.problemsolving.other;

public class CompareVersionNumber {

    public static void main(String[] args) {
        System.out.println(new CompareVersionNumber().compareVersion("7.5.2.4", "7.5.3"));
    }

    public int compareVersion(String version1, String version2) {
        String dots = ".0";
        int v1dots = getNumOfDots(version1);
        int v2dots = getNumOfDots(version2);

        if (v1dots > v2dots)
            version2 = version2 + dots.repeat(Math.max(0, v1dots - v2dots));
        else if (v1dots < v2dots)
            version1 = version1 + dots.repeat(Math.max(0, v2dots - v1dots));

        int numVersion1 = getVersionNum(version1);
        int numVersion2 = getVersionNum(version2);

        return Integer.compare(numVersion1, numVersion2);
    }

    public int getNumOfDots(String version) {
        int count = 0;
        for (char c : version.toCharArray())
            if (c == '.')
                count++;
        return count;
    }

    int getVersionNum(String s) {
        int versionNum = 0;
        for (String value : s.split("\\."))
            versionNum = versionNum * 10 + Integer.parseInt(value);
        return versionNum;
    }

}

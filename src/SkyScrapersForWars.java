import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class SkyScrapersForWars {

    public static void main(String[] args) {

        int clues[] = { 0, 0, 1, 2,
                        0, 2, 0, 0,
                        0, 3, 0, 0,
                        0, 1, 0, 0 };

        Map<String,Integer> ascFactors = new HashMap<>();
        Map<String,Integer> descFactors = new HashMap<>();
        List<String> listOfNumbers = new ArrayList<>();
        List<String> listOfSolutions = new ArrayList<>();

        for (int i = 1233; i < 4322; i++) {
            if(Integer.toString(i).contains("1") &&
                    Integer.toString(i).contains("2") &&
                    Integer.toString(i).contains("3") &&
                    Integer.toString(i).contains("4")) {

                listOfNumbers.add(Integer.toString(i));
                ascFactors.put(Integer.toString(i),getAsc(Integer.toString(i)));
                descFactors.put(Integer.toString(i),getDesc(Integer.toString(i)));
            }
        }

        List<String> firstRow = new ArrayList<>();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if((ascFactors.get(listOfNumbers.get(i)) == clues[15] || clues[15] == 0) &&
                    (descFactors.get(listOfNumbers.get(i)) == clues[4] || clues[4] == 0)) {
                firstRow.add(listOfNumbers.get(i));
            }
        }
        List<String> secondRow = new ArrayList<>();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if((ascFactors.get(listOfNumbers.get(i)) == clues[14] || clues[14] == 0) &&
                    (descFactors.get(listOfNumbers.get(i)) == clues[5] || clues[5] == 0)) {
                secondRow.add(listOfNumbers.get(i));
            }
        }
        List<String> thirdRow = new ArrayList<>();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if((ascFactors.get(listOfNumbers.get(i)) == clues[13] || clues[13] == 0) &&
                    (descFactors.get(listOfNumbers.get(i)) == clues[6] || clues[6] == 0)) {
                thirdRow.add(listOfNumbers.get(i));
            }
        }
        List<String> forthRow = new ArrayList<>();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if((ascFactors.get(listOfNumbers.get(i)) == clues[12] || clues[12] == 0) &&
                    (descFactors.get(listOfNumbers.get(i)) == clues[7] || clues[7] == 0)) {
                forthRow.add(listOfNumbers.get(i));
            }
        }

        String[] numbersFirstRow = new String[4];
        String[] numbersSecondRow = new String[4];
        String[] numbersThirdRow = new String[4];

        for (int i = 0; i < firstRow.size(); i++) {
            numbersFirstRow[0] = firstRow.get(i).substring(0,1);
            numbersFirstRow[1] = firstRow.get(i).substring(1,2);
            numbersFirstRow[2] = firstRow.get(i).substring(2,3);
            numbersFirstRow[3] = firstRow.get(i).substring(3);

            for (int j = 0; j < secondRow.size(); j++) {
                if (!numbersFirstRow[0].contains(secondRow.get(j).substring(0, 1)) &&
                        !numbersFirstRow[1].contains(secondRow.get(j).substring(1, 2)) &&
                        !numbersFirstRow[2].contains(secondRow.get(j).substring(2, 3)) &&
                        !numbersFirstRow[3].contains(secondRow.get(j).substring(3))) {

                    numbersSecondRow[0] = numbersFirstRow[0] + secondRow.get(j).substring(0, 1);
                    numbersSecondRow[1] = numbersFirstRow[1] + secondRow.get(j).substring(1, 2);
                    numbersSecondRow[2] = numbersFirstRow[2] + secondRow.get(j).substring(2, 3);
                    numbersSecondRow[3] = numbersFirstRow[3] + secondRow.get(j).substring(3);

                    for (int k = 0; k < thirdRow.size(); k++) {
                        if (!numbersSecondRow[0].contains(thirdRow.get(k).substring(0, 1)) &&
                                !numbersSecondRow[1].contains(thirdRow.get(k).substring(1, 2)) &&
                                !numbersSecondRow[2].contains(thirdRow.get(k).substring(2, 3)) &&
                                !numbersSecondRow[3].contains(thirdRow.get(k).substring(3))) {

                            numbersThirdRow[0] = numbersSecondRow[0] + thirdRow.get(k).substring(0, 1);
                            numbersThirdRow[1] = numbersSecondRow[1] + thirdRow.get(k).substring(1, 2);
                            numbersThirdRow[2] = numbersSecondRow[2] + thirdRow.get(k).substring(2, 3);
                            numbersThirdRow[3] = numbersSecondRow[3] + thirdRow.get(k).substring(3);

                            for (int l = 0; l < forthRow.size(); l++) {
                                if (!numbersThirdRow[0].contains(forthRow.get(l).substring(0, 1)) &&
                                        !numbersThirdRow[1].contains(forthRow.get(l).substring(1, 2)) &&
                                        !numbersThirdRow[2].contains(forthRow.get(l).substring(2, 3)) &&
                                        !numbersThirdRow[3].contains(forthRow.get(l).substring(3))) {

                                    boolean isVerticallyOk = true;

                                    String check0 = firstRow.get(i).substring(0,1) +
                                            secondRow.get(j).substring(0,1) +
                                            thirdRow.get(k).substring(0,1) +
                                            forthRow.get(l).substring(0,1);

                                    if ((ascFactors.get(check0) == clues[0] || clues[0] == 0) && (descFactors.get(check0) == clues[11] || clues[11] == 0)) {
                                        isVerticallyOk = isVerticallyOk && true;
                                    } else {
                                        isVerticallyOk = isVerticallyOk && false;
                                    }

                                    String check1 = firstRow.get(i).substring(1,2) +
                                            secondRow.get(j).substring(1,2) +
                                            thirdRow.get(k).substring(1,2) +
                                            forthRow.get(l).substring(1,2);

                                    if ((ascFactors.get(check1) == clues[1] || clues[1] == 0) && (descFactors.get(check1) == clues[10] || clues[10] == 0)) {
                                        isVerticallyOk = isVerticallyOk && true;
                                    } else {
                                        isVerticallyOk = isVerticallyOk && false;
                                    }

                                    String check2 = firstRow.get(i).substring(2,3) +
                                            secondRow.get(j).substring(2,3) +
                                            thirdRow.get(k).substring(2,3) +
                                            forthRow.get(l).substring(2,3);

                                    if ((ascFactors.get(check2) == clues[2] || clues[2] == 0) && (descFactors.get(check2) == clues[9] || clues[9] == 0)) {
                                        isVerticallyOk = isVerticallyOk && true;
                                    } else {
                                        isVerticallyOk = isVerticallyOk && false;
                                    }

                                    String check3 = firstRow.get(i).substring(3) +
                                            secondRow.get(j).substring(3) +
                                            thirdRow.get(k).substring(3) +
                                            forthRow.get(l).substring(3);

                                    if ((ascFactors.get(check3) == clues[3] || clues[3] == 0) && (descFactors.get(check3) == clues[8] || clues[8] == 0)) {
                                        isVerticallyOk = isVerticallyOk && true;
                                    } else {
                                        isVerticallyOk = isVerticallyOk && false;
                                    }

                                    if (isVerticallyOk == true){

                                        listOfSolutions.add(firstRow.get(i));
                                        listOfSolutions.add(secondRow.get(j));
                                        listOfSolutions.add(thirdRow.get(k));
                                        listOfSolutions.add(forthRow.get(l));

                                    }

                                }

                            } // end for loop l

                        } // end if, k loop

                    } // end for loop k

                } // end if, j loop

            } // end for loop j

        }

        int[][] solutions = new int[4][4];
        solutions[0][0] = Integer.parseInt(listOfSolutions.get(0).substring(0,1));
        solutions[0][1] = Integer.parseInt(listOfSolutions.get(0).substring(1,2));
        solutions[0][2] = Integer.parseInt(listOfSolutions.get(0).substring(2,3));
        solutions[0][3] = Integer.parseInt(listOfSolutions.get(0).substring(3));

        solutions[1][0] = Integer.parseInt(listOfSolutions.get(1).substring(0,1));
        solutions[1][1] = Integer.parseInt(listOfSolutions.get(1).substring(1,2));
        solutions[1][2] = Integer.parseInt(listOfSolutions.get(1).substring(2,3));
        solutions[1][3] = Integer.parseInt(listOfSolutions.get(1).substring(3));

        solutions[2][0] = Integer.parseInt(listOfSolutions.get(2).substring(0,1));
        solutions[2][1] = Integer.parseInt(listOfSolutions.get(2).substring(1,2));
        solutions[2][2] = Integer.parseInt(listOfSolutions.get(2).substring(2,3));
        solutions[2][3] = Integer.parseInt(listOfSolutions.get(2).substring(3));

        solutions[3][0] = Integer.parseInt(listOfSolutions.get(3).substring(0,1));
        solutions[3][1] = Integer.parseInt(listOfSolutions.get(3).substring(1,2));
        solutions[3][2] = Integer.parseInt(listOfSolutions.get(3).substring(2,3));
        solutions[3][3] = Integer.parseInt(listOfSolutions.get(3).substring(3));

    }

    public static int getAsc(String str) {

        int a = Integer.parseInt(str.substring(0,1));
        int b = Integer.parseInt(str.substring(1,2));
        int c = Integer.parseInt(str.substring(2,3));
        int d = Integer.parseInt(str.substring(3));

        if(a == b || a == c || a == d || b == c || b == d || c == d) return 9;
        if(a < b && b < c && c < d) return 4;
        if(a == 4) return 1;

        int counter = 1;
        int top = 1;

        if(a > top) top = a;
        if(b > a && b > top) counter++;
        if(b > top) top = b;
        if(c > b && c > top) counter++;
        if(c > top) top = c;
        if(d > c && d > top) counter++;

        return counter;

    }

    public static int getDesc(String str) {

        int a = Integer.parseInt(str.substring(3));
        int b = Integer.parseInt(str.substring(2,3));
        int c = Integer.parseInt(str.substring(1,2));
        int d = Integer.parseInt(str.substring(0,1));

        if(a == b || a == c || a == d || b == c || b == d || c == d) return 9;
        if(a < b && b < c && c < d) return 4;
        if(a == 4) return 1;

        int counter = 1;
        int top = 1;

        if(a > top) top = a;
        if(b > a && b > top) counter++;
        if(b > top) top = b;
        if(c > b && c > top) counter++;
        if(c > top) top = c;
        if(d > c && d > top) counter++;

        return counter;

    }


}


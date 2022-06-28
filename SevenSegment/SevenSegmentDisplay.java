package SevenSegment;

public class SevenSegmentDisplay {
    private char[][] light;
    private int rows = 5;
    private int columns = 4;

    public SevenSegmentDisplay() {
        light = new char[rows][columns];
    }

    public void display() {
        for (char[] chars : light) {
            for (int j = 0; j < columns; j++) {
                if (chars[j] == '1') {
                    sleep();
                    System.out.print("#" + " ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
    private void sleep(){
        try {
            Thread.sleep(1000);
        }catch (Exception ignored){}
    }

    public void setLight(String c) {
        char[] commands = c.toCharArray();
        if (commands[commands.length - 1] == '1') {
            for (int j = 0; j < commands.length - 1; j++) {
                if (commands[j] == '1') {
                    switch (j) {
                        case 0 -> {
                            for (int i = 0; i < columns; i++) {
                                light[0][i] = '1';
                            }
                        }
                        case 1 -> {
                            for (int i = 0; i < rows / 2 + 1; i++) {
                                light[i][3] = '1';
                            }
                        }
                        case 2 -> {
                            for (int i = rows / 2; i < rows; i++) {
                                light[i][3] = '1';
                            }
                        }
                        case 3 -> {
                            for (int i = 0; i < columns; i++) {
                                light[4][i] = '1';
                            }
                        }
                        case 4 -> {
                            for (int i = rows / 2; i < rows; i++) {
                                light[i][0] = '1';
                            }
                        }
                        case 5 -> {
                            for (int i = 0; i < rows / 2 + 1; i++) {
                                light[i][0] = '1';
                            }
                        }
                        case 6 -> {
                            for (int i = 0; i < columns; i++) {
                                light[2][i] = '1';
                            }
                        }
                    }
                }
            }
        }

    }
}

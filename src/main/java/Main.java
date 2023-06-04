public class Main {
    public static void main(String[] args) {
        int spoon7 = 7;
        int spoon11 = 11;
        int target = 2;

        int[] result = findSpoonCounts(spoon7, spoon11, target);

        if (result[0] == -1) {
            System.out.println("无法量出目标酱油的重量。");
        } else {
            System.out.println("舀取" + result[0] + "次" + spoon7 + "两勺子，舀取" + result[1] + "次" + spoon11 + "两勺子。");
        }
    }

    public static int[] findSpoonCounts(int spoon7, int spoon11, int target) {
        int[] result = {-1, -1};

        for (int count11 = 0; count11 <= target / spoon11; count11++) {
            int remaining = target - count11 * spoon11;
            if (remaining % spoon7 == 0) {
                int count7 = remaining / spoon7;
                result[0] = count7;
                result[1] = count11;
                break;
            }
        }
        //输出结果
        System.out.println("舀取" + result[0] + "次" + spoon7 + "两勺子，舀取" + result[1] + "次" + spoon11 + "两勺子。");

        return result;
    }
}
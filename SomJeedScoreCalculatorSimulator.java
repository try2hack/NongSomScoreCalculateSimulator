public class SomjeedScoreCalculatorSimulator {
//by NongMoss
    public static void main(String[] args) {
        //ค่าสูงสุดต่ำสุดของคะแนนที่ได้โดยการประมาณ
        int minA = 10000, maxA = 100000, minB = 50000, maxB = 150000;
        int stageA = 0, stageB = 0, total;
        //ช่วงแรกช้าๆร่วงทั้งหมด 20 เครื่อง
        for (int i = 0; i < 20; i++) {
            int a = (int) (Math.random() * ((maxA - minA)) + 1) + minA;            
            stageA += a;
        }
        //ช่วงท้ายเร็วๆโอกาศร่วงทั้งหมด 7 เครื่อง
        for (int i = 0; i < 7; i++) {
            int b = (int) (Math.random() * ((maxB - minB)) + 1) + minB;            
            stageB += b;
        }
        total = stageA + stageB;
        System.out.println("คุณได้คะแนน "+total+" ว้าวเก่งมากๆเบย");

    }
}
import random

def somjeed_score_calculator_simulator():
    minA = 10000
    maxA = 100000
    minB = 50000
    maxB = 150000
    highest_score = 0

    # Loop to run the simulation 100 times
    for _ in range(100):
        stageA = 0
        stageB = 0

        # ช่วงแรกช้าๆร่วงทั้งหมด 20 เครื่อง
        for _ in range(20):
            a = random.randint(minA, maxA)
            stageA += a

        # ช่วงท้ายเร็วๆโอกาศร่วงทั้งหมด 7 เครื่อง
        for _ in range(7):
            b = random.randint(minB, maxB)
            stageB += b

        total = stageA + stageB

        # Update the highest score
        if total > highest_score:
            highest_score = total

    print(f"คะแนนสูงสุดที่ได้จากการทดลอง 100 ครั้งคือ {highest_score} ว้าวเก่งมากๆเบย")

# Run the function
somjeed_score_calculator_simulator()

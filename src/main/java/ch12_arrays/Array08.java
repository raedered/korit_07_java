package ch12_arrays;

public class Array08 {
    // 접근지정자 / return 자료형 / 메서드명(매개변수) { 구현부가 어떤식으로 이루어질지 return }
    public static int calcSum(int[] intArray) {
        int sum = 0;
        for(int i = 0; i < intArray.length; i++){
            sum += intArray[i];
        }

        return sum;
    }

    public static double calcAvg(int[] intArray) {
        double avg = 0;
        int sum = calcSum(intArray);  // 위에있는 calcSum method를 가지고 올수가있다
//        int sum = 0;
//
//        for(int i = 0; i < intArray.length; i++){
//            sum += intArray[i];
//            avg = (double)sum / intArray[i];
//        }

        avg = (double)sum / intArray.length;
        return avg;
    }

    public static void main(String[] args) {
        // 위에 정의한 method 호출하기 위해 객체 생성했습니다.
        Array08 array08 = new Array08();
        int[] scores = {100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100};

        // 이상의 예시 배열을 argument로 하는 총합을 구하는 method calcSum,
        // 평균을 구하는 calcAvg method를 정희하는데, call4() 유형으로 만드시오

        int sum = array08.calcSum(scores);
        double avg = array08.calcAvg(scores);

        System.out.println("총합 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");
    }
}

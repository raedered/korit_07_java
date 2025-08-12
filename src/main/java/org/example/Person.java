package org.example;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Person {
    private String name;
    private double height;
    private double weight;

    public double getBmi() {
        double result = height * 0.01;
        return weight / (result * result);
    }

    public String calcBmi() {
        double result = getBmi();
        String bmi = "";
        if(result < 18.5) {
            bmi = "저체중";
        }else if(result >= 18.5 && result <= 23){
            bmi = "정상";
        }else if(result >= 23 && result <= 25) {
            bmi = "비만 전";
        }else if(result >= 25 && result <= 30) {
            bmi = "1단계 비만";
        }else if(result >= 30 && result <= 35) {
            bmi = "2단계 비만";
        }else if(result >= 35) {
            bmi = "3단계 비만";
        }

        return name + " 님의 BMI 지수는 " + result + "으로 " + bmi + "입니다.";
    }
}

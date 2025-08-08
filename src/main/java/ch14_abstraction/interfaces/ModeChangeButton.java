package ch14_abstraction.interfaces;

public class ModeChangeButton extends Button{
    private boolean modChange;
    @Override
    public void onPressed() {
        if(modChange) {
            modChange = false;
            System.out.println("냉방으로 바뀝니다.");
        }else {
            modChange = true;
            System.out.println("난방으로 바뀝니다.");
        }
    }
}

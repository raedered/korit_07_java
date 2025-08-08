package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                powerButton, channelDownButton, channelUpButton
//        );
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();

        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를
        // 생성하는 방법
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(),
                new VolumeDownButton(), new VolumeUpButton()
        );

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();

        // #1에 대한 Main에서의 실행 방법
        System.out.println(tvRemoteController.onUpChannelUpButton1());
        // #2에 대한 Main에서의 실행 방법
        tvRemoteController.onUpChannelUpButton2();

        System.out.println("---------------------------------------------------------");
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeButton();
        tvRemoteController.onPressedUpbutton();

        System.out.println(tvRemoteController.onUpVoumeUpButton1());
        tvRemoteController.onUpVoumeUpButton2();

        System.out.println("==================================================");

        AirConditionerController airConditionerController = new AirConditionerController(
                new PowerButton(), new TemperatureDownButton(), new TemperatureUpButton(),
                new ModeChangeButton()
        );

        airConditionerController.onPressedPowerButton();
        airConditionerController.onPressedTemperatureDownButton();
        airConditionerController.onDownTemperatureDownButton();
        airConditionerController.onPressedTemperatureUpButton();
        airConditionerController.onUpTemperatureUpButton();
        airConditionerController.modeChangeButton();
        airConditionerController.modeChangeButton();
    }




}

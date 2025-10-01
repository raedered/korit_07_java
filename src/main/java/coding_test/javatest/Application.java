package coding_test.javatest;


class SettingsManager {

    private static SettingsManager instance;

    private SettingsManager() {

    }

    public static SettingsManager getInstance() {
        if(instance == null) {              // 현재 인스턴스가 없는 시점이라면 20번 코드라인이 true이므로
            instance = new SettingsManager();   // ProductView() 생성자를 호출하여 intance에 대입함.
        }
        return instance;
    }
}

public class Application {
    public static void main(String[] args) {

        SettingsManager instance1 = SettingsManager.getInstance();
        SettingsManager instance2 = SettingsManager.getInstance();

        if(instance1 == instance2) {
            System.out.println("두 인스턴스는 동일합니다.");
        }else {
            System.out.println("두 인스턴스는 다릅니다.");
        }
    }
}
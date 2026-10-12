public class Main {
    public static void main(String[] args) {
        //anonimous classes = для использования классов с нужным дополнительным функционалом единожды вместо того, чтобы писать новые классы/подклассы
        //чаще всего используется для TimerTasks / Runnable / callbacks

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override 
            void speak() {
                System.out.println("gav gav!");
            }
        }; //dog2 - анонимный класс с измененным функционалом от класса Dog()

        dog1.speak();
        dog2.speak();
    }
}

//для создания нового потока можно использовать один из двух популярных методов - класс с интерфейсом Runnable 
//и в обязательном методе run прописать свой функционал 
//(затерев этот метод с помощью Override)
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                //остановка потока на секунду
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            if (i == 5) {
                System.out.println("Время вышло!");
                System.exit(0);
            }
        }
    }
}

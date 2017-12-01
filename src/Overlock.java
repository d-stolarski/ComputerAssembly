public class Overlock {

    void increaseCpuClock(Computer computer, double increaseValue){
        computer.procesor.clocking += increaseValue;
        System.out.println("Zwiększono taktowanie procesora " + computer.procesor.producer + " o wartość "
                + increaseValue + " i ma teraz " + computer.procesor.clocking + "Ghz");
    }

    void decreaseCpuClock(Computer computer, double decreaseValue) {
        computer.procesor.clocking -= decreaseValue;
        System.out.println("Zmniejszono taktowanie procesora " + computer.procesor.producer + " o wartość "
                + decreaseValue + " i ma teraz " + computer.procesor.clocking + "Ghz");
    }
}

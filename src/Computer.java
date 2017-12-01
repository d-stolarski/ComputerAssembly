public class Computer {

    String name;
    Procesor procesor;
    Memory memory;

    Computer(String name, Procesor procesor, Memory memory) {
        this.name = name;
        this.procesor = procesor;
        this.memory = memory;
    }

    void info() {
        System.out.printf("Nazwa komputera: %s, Procesor: %s %s %.1fGhz, Pamięć: %s %s %dMB, %.1fGhz;\n\n",
                name, procesor.producer, procesor.model, procesor.clocking, memory.producer,
                memory.model, memory.value, memory.clocking);
    }

}

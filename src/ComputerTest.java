public class ComputerTest {
    public static void main(String[] args) {

        Procesor procesor1 = new Procesor("Intel", "Core i5", 3.2);
        Memory memory1 = new Memory("Samsung", "XSA", 1024, 1.6);
        Computer comp1 = new Computer("SuperComp", procesor1, memory1);

        System.out.printf("Nazwa komputera: %s, Procesor: %s %s %.1fGhz, Pamięć: %s %s %dMB, %.1fGhz;",
                comp1.name, comp1.procesor.producer, comp1.procesor.model, comp1.procesor.clocking, comp1.memory.producer,
                comp1.memory.model, comp1.memory.value, comp1.memory.clocking);

        Procesor procesor2 = new Procesor("AMD", "Athlon", 2.8);
        Memory memory2 = new Memory("Dell", "Star", 512, 1.2);
        Computer comp2 = new Computer("Lapek", procesor2, memory2);

        System.out.printf("\nNazwa komputera: %s, Procesor: %s %s %.1fGhz, Pamięć: %s %s %dMB, %.1fGhz;\n\n",
                comp2.name, comp2.procesor.producer, comp2.procesor.model, comp2.procesor.clocking, comp2.memory.producer,
                comp2.memory.model, comp2.memory.value, comp2.memory.clocking);


        Overlock ov = new Overlock();

        ov.increaseCpuClock(comp1, 0.3);
        ov.decreaseCpuClock(comp2, 0.5);
        ov.decreaseCpuClock(comp1, 0.2);
        ov.increaseCpuClock(comp2, 0.7);

        ComputerAssembly ca = new ComputerAssembly();
        Computer comp3 = ca.assembly("Laptop","AMD","Millenium",3.2,"HP","KingXR",1024,3.7);

        System.out.printf("\nNazwa komputera: %s, Procesor: %s %s %.1fGhz, Pamięć: %s %s %dMB, %.1fGhz;\n\n",
                comp3.name, comp3.procesor.producer, comp3.procesor.model, comp3.procesor.clocking, comp3.memory.producer,
                comp3.memory.model, comp3.memory.value, comp3.memory.clocking);
    }
}

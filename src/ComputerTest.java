public class ComputerTest {
    public static void main(String[] args) {

        Procesor procesor1 = new Procesor("Intel", "Core i5", 3.2);
        Memory memory1 = new Memory("Samsung", "XSA", 1024, 1.6);
        Computer comp1 = new Computer("SuperComp", procesor1, memory1);
        comp1.info();

        Procesor procesor2 = new Procesor("AMD", "Athlon", 2.8);
        Memory memory2 = new Memory("Dell", "Star", 512, 1.2);
        Computer comp2 = new Computer("Lapek", procesor2, memory2);
        comp2.info();

        Overlock ov = new Overlock();
        ov.increaseCpuClock(comp1, 0.3);
        ov.decreaseCpuClock(comp2, 0.5);
        ov.decreaseCpuClock(comp1, 0.2);
        ov.increaseCpuClock(comp2, 0.7);

        ComputerAssembly ca = new ComputerAssembly();
        Computer comp3 = ca.assembly("Laptop", "AMD", "Millenium", 3.2, "HP", "KingXR", 1024, 3.7);
        comp3.info();
    }
}

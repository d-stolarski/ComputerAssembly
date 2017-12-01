public class ComputerAssembly {

    Computer assembly(String name, String procesorProducer, String procesorModel, double procesorClocking,
                      String memoryProducer, String memoryModel, int memoryValue, double memoryClocking){

        Procesor procesor = new Procesor(procesorProducer, procesorModel, procesorClocking);
        Memory memory = new Memory(memoryProducer, memoryModel, memoryValue, memoryClocking);
        Computer computer = new Computer(name, procesor, memory);

        return computer;
    }
}

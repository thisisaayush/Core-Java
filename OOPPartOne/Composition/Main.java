package OOPPartOne.Composition;

public class Main {
    public static void main(String[] args){
        ComputerCase caseObj = new ComputerCase("2209", "Dell", "204");

        Monitor monitorObj = new Monitor( "89-Denh0", "HP", 32, "1440 x 1520");

        Motherboard motherboardObj = new Motherboard("ii-321", "Asus", 6, 8, "bvx33");

        PersonalComputer pcObj = new PersonalComputer("2209", "Dell", caseObj, monitorObj, motherboardObj);

        pcObj.getMonitor().drawPixelAt(10,10, "green");
        pcObj.getMotherboard().loadProgram("Windows Operation System");
        pcObj.getComputerCase().pressPowerButton();

    }
    
}

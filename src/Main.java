import NetWorking.SetlikaServer;
import Utilities.Converters.FloatConverter;

public class Main{
    public static void main(String[] args){

        SetlikaServer server = new SetlikaServer();
        server.StartServer(4008);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Directory BD:");
//        GlobalValue.pathToDBDirectory = Paths.get(scanner.nextLine());
//        System.out.println("Name BD:");
//        CreateFileDB.CreateNewDB(scanner.nextLine());
//
////        String input = "";
//        while (!input.equals("Stop")){
//            input = scanner.nextLine();
//            System.out.println(input);
//        }
    }
}
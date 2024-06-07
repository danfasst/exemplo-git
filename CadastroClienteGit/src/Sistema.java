public class Sistema {
    
    public static void executar() {
        adicionarCliente();
    } 

    private static void adicionarCliente() {
        
        System.out.print("Coloque o nome: ");
        String nome = Console.lerString();
        System.out.print("Coloque o telefone: ");
        String telefone = Console.lerString();
        System.out.print("Coloque o e-mail: ");
        String email = Console.lerString();
        
        Cliente cliente = new Cliente(nome, telefone, email);

        System.out.println("\nCliente cadastrado!");
    } 
}

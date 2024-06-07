public class Sistema {
    
    public static void executar() {
        adicionarCliente();
    } 

    private static void adicionarCliente() {
        
        String nome = Console.lerString("Coloque o nome:");
        String telefone = Console.lerString("Coloque o telefone:");
        String email = Console.lerString("Coloque o e-mail:");
        
        Cliente cliente = new Cliente(nome, telefone, email);

        System.out.println("\nCliente cadastrado!");
    } 
}

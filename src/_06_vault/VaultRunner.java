package _06_vault;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();
		System.out.println(vault.tryCode(4567892));	
		SecretAgent agent = new SecretAgent();
		System.out.println(agent.findCode(vault));
	}
}

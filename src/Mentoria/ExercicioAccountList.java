package Mentoria;

import Exemplos_Capitulo3.Account;

import java.util.ArrayList;
import java.util.List;

public class ExercicioAccountList {

    public static void main(String[] args)
    {
        List<Account> accounts = new ArrayList<>();

        accounts.add(new Account("Pedro", 100.00));
        accounts.add(new Account("Anna", 120.00));

        // Usei for para mostrar o saldo das contas
        for (Account account : accounts)
        {
            displayAccount(account);
        }
        Account anna = new Account("Anna", 80.00);
        List<Account> count = List.of(new Account ("Pedro", 100),anna);
    }


    // Usei método display
    public static void displayAccount(Account accountToDisplay)
    {
        System.out.printf("%s: R$%.2f %n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}










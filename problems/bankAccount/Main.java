package bankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String command = input[0];

        Map<Integer, BankAccount> accounts = new HashMap<>();

        while (!command.equals("End")) {
            String result = "";

            switch (command){
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    accounts.put(bankAccount.getId(), bankAccount);
                    result = String.format("Account ID%d created", bankAccount.getId());
                    break;
                case "Deposit":
                    int id = Integer.parseInt(input[1]);
                    double deposit = Double.parseDouble(input[2]);

                    if (accounts.containsKey(id)) {
                        BankAccount bankAccount2 = accounts.get(id);
                        bankAccount2.deposit(deposit);
                        accounts.put(id, bankAccount2);
                        result = String.format("Deposited %.0f to ID%d", deposit, id);

                    }else {
                        result = "Account does not exist";

                    }
                    break;
                case "SetInterest":
                    double interestRate = Double.parseDouble(input[1]);
                    BankAccount.setInterestRate(interestRate);

                    break;
                case "GetInterest":
                    int accountId = Integer.parseInt(input[1]);
                    int years = Integer.parseInt(input[2]);

                    if (accounts.containsKey(accountId)){
                        BankAccount bankAccount1 = accounts.get(accountId);
                       double totalInterest = bankAccount1.getInterest(years);
                       result = String.format("%.2f", totalInterest);
                    }else {
                        result = "Account does not exist";

                    }

                    break;


            }
            if (!result.isEmpty()) {
                System.out.println(result);

            }

            input = scanner.nextLine().split("\\s+");
             command = input[0];

        }

    }
}

package ChapterTen.Polymorphism;

import ChapterTen.Polymorphism.Account;

public class SavingsAccount extends Account {
    private String accountType;

    public SavingsAccount(String type){
        accountType = type;
    }

}

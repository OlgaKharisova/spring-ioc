package ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility;

import ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility.chains.CanEnterQueue;
import ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility.chains.CheckCash;
import ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility.chains.CheckDocuments;
import ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility.chains.CheckDrugs;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(true, 5000, false);
        Customs customs = new Customs(7, 6);

        Chain passangerCanFly = new CanEnterQueue(customs);
        passangerCanFly.linkWith(
                new CheckCash().linkWith(
                        new CheckDocuments().linkWith(
                                new CheckDrugs()
                        )
                )
        );

        System.out.println(passangerCanFly.check(passenger));
    }
}

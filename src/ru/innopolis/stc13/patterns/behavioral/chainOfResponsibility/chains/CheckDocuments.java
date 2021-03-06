package ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility.chains;

import ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility.Chain;
import ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility.Passenger;

public class CheckDocuments extends Chain {

    @Override
    public boolean check(Passenger passenger) {
        if (passenger.isHasDocuments()){
            return checkNext(passenger);
        }else {
            return false;
        }
    }
}

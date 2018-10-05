package ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility.chains;

import ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility.Chain;
import ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility.Passenger;

public class CheckCash extends Chain {

    private static final double MAX_CASH = 500000;

    @Override
    public boolean check(Passenger passenger) {
        if (passenger.getCash()>MAX_CASH){
            return false;
        }else {
            return checkNext(passenger);
        }
    }
}

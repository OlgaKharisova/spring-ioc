package ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility.chains;

import ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility.Chain;
import ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility.Customs;
import ru.innopolis.stc13.patterns.behavioral.chainOfResponsibility.Passenger;

public class CanEnterQueue extends Chain {

    private Customs customs;

    public CanEnterQueue(Customs customs) {
        this.customs = customs;
    }

    @Override
    public boolean check(Passenger passenger) {
        if (customs.getCapacity()>customs.getBusy()){
            return checkNext(passenger);
        }else {
            return false;
        }
    }
}

package ru.innopolis.stc13.patterns.creational.builders.builders;

import ru.innopolis.stc13.patterns.creational.builders.components.Engine;
import ru.innopolis.stc13.patterns.creational.builders.components.TripComputer;
import ru.innopolis.stc13.patterns.creational.builders.components.Wheels;

public interface Builder {
    void setComputer(TripComputer computer);

    void setEngine(Engine engine);

    void setWheels(Wheels wheels);

    void setWeelsQty(int weelsQty);
}

package com.company;

import java.util.Iterator;

public class DoubleArgumentMarshaller implements ArgumentMarshaller {
    private Double doubleValue;

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        doubleValue = Double.parseDouble(currentArgument.next());
    }
}

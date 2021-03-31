package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringArgumentMarshaller implements ArgumentMarshaller {
    private String stringValue = "";

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
          stringValue = currentArgument.next();
        } catch (NoSuchElementException e) {
            throw new ArgsException(ArgsException.ErrorCode.MISSING_INTEGER);
        }
    }

    public static String getValue(ArgumentMarshaller am) {
        if (am != null && am instanceof  StringArgumentMarshaller) {
            return ((StringArgumentMarshaller) am).stringValue;
        } else {
            return "";
        }
    }
}

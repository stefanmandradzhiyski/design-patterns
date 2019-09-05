package com.snmi.structuralPatterns.bridge;

import com.snmi.structuralPatterns.bridge.formatters.Formatter;

import java.util.List;

/**
 * Abstract Printer
 */
public abstract class Printer {

    /**
     * Format the information by different formatters
     * @param formatter take the formatter
     * @return the result after format
     */
    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract List<Detail> getDetails();
    protected abstract String getHeader();

}

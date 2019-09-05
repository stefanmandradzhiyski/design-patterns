package com.snmi.structuralPatterns.bridge.formatters;

import com.snmi.structuralPatterns.bridge.Detail;

import java.util.List;

/**
 * Print formatter
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class PrintFormatter implements Formatter{

    /**
     * Implementation of the formatter format method
     * @param header take the header
     * @param details take the details list
     * @return return a formatted string
     */
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append(header);
        builder.append("\n");

        for (Detail detail : details) {
            builder.append(detail.getLabel());
            builder.append(":");
            builder.append(detail.getValue());
            builder.append("\n");
        }

        return builder.toString();
    }

}

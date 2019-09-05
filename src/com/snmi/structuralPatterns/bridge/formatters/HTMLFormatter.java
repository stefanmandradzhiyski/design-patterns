package com.snmi.structuralPatterns.bridge.formatters;

import com.snmi.structuralPatterns.bridge.Detail;

import java.util.List;

/**
 * HTML Formatter which implement Formatter
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class HTMLFormatter implements Formatter {

    /**
     * Implementation of formatter format method
     * @param header take the header
     * @param details take the details list
     * @return return the created string
     */
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<table>");
        builder.append("<th>");
        builder.append("Classification");
        builder.append("</th>");
        builder.append("<th>");
        builder.append(header);
        builder.append("</th>");

        for (Detail detail : details) {
            builder.append("<tr><td>");
            builder.append(detail.getLabel());
            builder.append("</td><td>");
            builder.append(detail.getValue());
            builder.append("</td></tr");
        }

        builder.append("</table>");

        return builder.toString();
    }


}

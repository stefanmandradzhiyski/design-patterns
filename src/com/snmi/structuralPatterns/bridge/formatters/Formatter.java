package com.snmi.structuralPatterns.bridge.formatters;

import com.snmi.structuralPatterns.bridge.Detail;

import java.util.List;

/**
 * Formatter interface
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public interface Formatter {

    String format(String header, List<Detail> details);

}

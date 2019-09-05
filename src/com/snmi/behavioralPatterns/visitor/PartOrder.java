package com.snmi.behavioralPatterns.visitor;

import com.snmi.behavioralPatterns.visitor.visitors.AtvPartVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Part order which implement ATV Part interface
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class PartOrder implements ATVPart {

    /**
     * List of atv parts
     */
    private List<ATVPart> parts = new ArrayList<>();

    /**
     * Default constructor
     */
    public PartOrder() {}

    /**
     * Add atv part to parts list
     * @param atvPart take the atv part
     */
    public void addPart(ATVPart atvPart) {
        parts.add(atvPart);
    }

    /**
     * Get unmodifiable list of parts
     * @return the parts list
     */
    public List<ATVPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    /**
     * Implementation of accept method
     * @param visitor take the visitor
     */
    @Override
    public void accept(AtvPartVisitor visitor) {
        for (ATVPart atvPart : parts) {
            atvPart.accept(visitor);
        }
        visitor.visit(this);
    }
}

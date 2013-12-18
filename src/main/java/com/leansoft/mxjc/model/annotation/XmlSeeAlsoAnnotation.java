package com.leansoft.mxjc.model.annotation;

import java.util.List;

import com.leansoft.mxjc.model.Annotatable;

/**
 * User: starasov
 * Date: 12/18/13
 */
public class XmlSeeAlsoAnnotation implements Annotatable {

    private final List<String> seeAlsoClasses;

    public XmlSeeAlsoAnnotation(List<String> seeAlsoClasses) {
        this.seeAlsoClasses = seeAlsoClasses;
    }

    @Override
    public boolean isParameterProvided() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("{\n");

        for (String seeAlsoClass : seeAlsoClasses) {
            stringBuilder.append(seeAlsoClass).append(".class,");
        }

        stringBuilder.append("}");

        return stringBuilder.toString();
    }
}

package com.leansoft.mxjc.model.annotation;

import java.util.Collections;
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

    public static XmlSeeAlsoAnnotation empty() {
        return new XmlSeeAlsoAnnotation(Collections.<String>emptyList());
    }

    @Override
    public boolean isParameterProvided() {
        return !seeAlsoClasses.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("XmlSeeAlso({\n");

        for (String seeAlsoClass : seeAlsoClasses) {
            stringBuilder.append("    ").append(seeAlsoClass).append(".class,\n");
        }

        stringBuilder.append("})");

        return stringBuilder.toString();
    }
}

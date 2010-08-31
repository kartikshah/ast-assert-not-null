package com.learn.groovy16.ast.local

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
import java.lang.annotation.ElementType
import org.codehaus.groovy.transform.GroovyASTTransformationClass

/**
 * @author Kartik Shah
 */
@Retention(RetentionPolicy.SOURCE)
@Target([ElementType.METHOD])
@GroovyASTTransformationClass(["com.learn.groovy16.ast.local.AssertParamsNotNullASTTransformation"])
public @interface AssertParam{
}

package com.learn.groovy16.ast.local
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.ASTTransformation

@GroovyASTTransformation(phase=CompilePhase.SEMANTIC_ANALYSIS)
public class AssertParamsNotNullASTTransformation implements ASTTransformation {
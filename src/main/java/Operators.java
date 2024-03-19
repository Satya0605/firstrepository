package com.qualizeal.javaapp.mainoperators;

import com.qualizeal.javaapp.arthimetics.ArthimeticOperations;
import com.qualizeal.javaapp.unary.UnaryOperators;
import com.qualizeal.javaapp.relational.RelationalOperators;
import com.qualizeal.javaapp.conditional.ConditionalOperators;
import com.qualizeal.javaapp.namingvariable.NamingVariables;
import com.qualizeal.javaapp.bitwise.BitwiseOperators;
import com.qualizeal.javaapp.ifelsedemo.IfElseDemo;

public class Operators {
	public static void main(String[] args) {
		ArthimeticOperations arthimeticoperations = new ArthimeticOperations();
		arthimeticoperations.addition();
		arthimeticoperations.multiplication();
		arthimeticoperations.subtraction();
		arthimeticoperations.division();
		
		UnaryOperators unaryoperators = new UnaryOperators();
		unaryoperators.postIncrement();
		unaryoperators.preIncrement();
		unaryoperators.postDecrement();
		unaryoperators.preDecrement();
		
		RelationalOperators relationaloperators = new RelationalOperators();
		relationaloperators.relationalOp();
		
		ConditionalOperators conditionaloperators = new ConditionalOperators();
		conditionaloperators.condition();
		
		NamingVariables namingvariables = new NamingVariables();
		namingvariables.primitiveDataTypes();
		
		BitwiseOperators bitwiseoperators = new BitwiseOperators();
		bitwiseoperators.operation1();
		
		IfElseDemo ifelsedemo = new IfElseDemo();
		ifelsedemo.demo();
	}
}
		
		
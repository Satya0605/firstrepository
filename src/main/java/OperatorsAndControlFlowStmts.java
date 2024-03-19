package com.qualizeal.javaapp.mainoperatorsandcontrolflowstmts;

import com.qualizeal.javaapp.arthimetics.ArthimeticOperations;
import com.qualizeal.javaapp.unary.UnaryOperators;
import com.qualizeal.javaapp.relational.RelationalOperators;
import com.qualizeal.javaapp.conditional.ConditionalOperators;
import com.qualizeal.javaapp.namingvariable.NamingVariables;
import com.qualizeal.javaapp.bitwise.BitwiseOperators;
import com.qualizeal.javaapp.ifelsedemo.IfElseDemo;
import com.qualizeal.javaapp.whiledemo.WhileDemo;
import com.qualizeal.javaapp.dowhile.DoWhileDemo;
import com.qualizeal.javaapp.forloop.ForLoopDemo;
import com.qualizeal.javaapp.breakcontinue.BreakAndContinue;
import com.qualizeal.javaapp.switchdemo.SwitchDemo;

public class OperatorsAndControlFlowStmts {
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
		
		WhileDemo whiledemo = new WhileDemo();
		whiledemo.operation2();
		
		DoWhileDemo dowhiledemo = new DoWhileDemo();
		dowhiledemo.operation3();
		
		ForLoopDemo forloopdemo = new ForLoopDemo();
		forloopdemo.operation4();
		
		BreakAndContinue breakandcontinue = new BreakAndContinue();
		breakandcontinue.breakDemo();
		breakandcontinue.continueDemo();
		
		SwitchDemo switchdemo = new SwitchDemo();
		switchdemo.operation5();
		 
		 
	}
}
		
		
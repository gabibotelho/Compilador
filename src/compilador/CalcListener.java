package compilador;

// Generated from DECAF.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CalcParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CalcParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(CalcParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(CalcParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(CalcParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(CalcParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(CalcParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(CalcParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CalcParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CalcParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(CalcParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(CalcParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(CalcParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(CalcParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(CalcParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(CalcParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CalcParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CalcParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalcParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(CalcParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(CalcParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(CalcParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(CalcParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void enterReturnBlock(CalcParser.ReturnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void exitReturnBlock(CalcParser.ReturnBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CalcParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CalcParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(CalcParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(CalcParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(CalcParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(CalcParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(CalcParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(CalcParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#elseTailBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseTailBlock(CalcParser.ElseTailBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#elseTailBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseTailBlock(CalcParser.ElseTailBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(CalcParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(CalcParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#dotLocation}.
	 * @param ctx the parse tree
	 */
	void enterDotLocation(CalcParser.DotLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#dotLocation}.
	 * @param ctx the parse tree
	 */
	void exitDotLocation(CalcParser.DotLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#declaredVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaredVariable(CalcParser.DeclaredVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#declaredVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaredVariable(CalcParser.DeclaredVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CalcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CalcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#arrayVariable}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariable(CalcParser.ArrayVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#arrayVariable}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariable(CalcParser.ArrayVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#expressionInP}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInP(CalcParser.ExpressionInPContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#expressionInP}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInP(CalcParser.ExpressionInPContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#nExpression}.
	 * @param ctx the parse tree
	 */
	void enterNExpression(CalcParser.NExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#nExpression}.
	 * @param ctx the parse tree
	 */
	void exitNExpression(CalcParser.NExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(CalcParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(CalcParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CalcParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CalcParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#equalsExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpression(CalcParser.EqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#equalsExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpression(CalcParser.EqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#relationExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpression(CalcParser.RelationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#relationExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpression(CalcParser.RelationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#addSubsExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubsExpression(CalcParser.AddSubsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#addSubsExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubsExpression(CalcParser.AddSubsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpression(CalcParser.MulDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpression(CalcParser.MulDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#prExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrExpression(CalcParser.PrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#prExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrExpression(CalcParser.PrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void enterBasicExpression(CalcParser.BasicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void exitBasicExpression(CalcParser.BasicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#basic}.
	 * @param ctx the parse tree
	 */
	void enterBasic(CalcParser.BasicContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#basic}.
	 * @param ctx the parse tree
	 */
	void exitBasic(CalcParser.BasicContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(CalcParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(CalcParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#declaredMethodCall}.
	 * @param ctx the parse tree
	 */
	void enterDeclaredMethodCall(CalcParser.DeclaredMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#declaredMethodCall}.
	 * @param ctx the parse tree
	 */
	void exitDeclaredMethodCall(CalcParser.DeclaredMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#as_op}.
	 * @param ctx the parse tree
	 */
	void enterAs_op(CalcParser.As_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#as_op}.
	 * @param ctx the parse tree
	 */
	void exitAs_op(CalcParser.As_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#md_op}.
	 * @param ctx the parse tree
	 */
	void enterMd_op(CalcParser.Md_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#md_op}.
	 * @param ctx the parse tree
	 */
	void exitMd_op(CalcParser.Md_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#pr_op}.
	 * @param ctx the parse tree
	 */
	void enterPr_op(CalcParser.Pr_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#pr_op}.
	 * @param ctx the parse tree
	 */
	void exitPr_op(CalcParser.Pr_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(CalcParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(CalcParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(CalcParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(CalcParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(CalcParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(CalcParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CalcParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CalcParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(CalcParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(CalcParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(CalcParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(CalcParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(CalcParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(CalcParser.Bool_literalContext ctx);
}
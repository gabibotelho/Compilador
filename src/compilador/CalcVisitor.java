package compilador;

// Generated from DECAF.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CalcParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CalcParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(CalcParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(CalcParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(CalcParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(CalcParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodType(CalcParser.MethodTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(CalcParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#parameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterType(CalcParser.ParameterTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CalcParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CalcParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(CalcParser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(CalcParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#returnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBlock(CalcParser.ReturnBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(CalcParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#scan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan(CalcParser.ScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(CalcParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(CalcParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#elseTailBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseTailBlock(CalcParser.ElseTailBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(CalcParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#dotLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotLocation(CalcParser.DotLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#declaredVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaredVariable(CalcParser.DeclaredVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CalcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#arrayVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariable(CalcParser.ArrayVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#expressionInP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInP(CalcParser.ExpressionInPContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#nExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNExpression(CalcParser.NExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(CalcParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CalcParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#equalsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsExpression(CalcParser.EqualsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#relationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpression(CalcParser.RelationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#addSubsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubsExpression(CalcParser.AddSubsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#mulDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(CalcParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#prExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrExpression(CalcParser.PrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#basicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicExpression(CalcParser.BasicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#basic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic(CalcParser.BasicContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(CalcParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#declaredMethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaredMethodCall(CalcParser.DeclaredMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#as_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_op(CalcParser.As_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#md_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMd_op(CalcParser.Md_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#pr_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPr_op(CalcParser.Pr_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(CalcParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_op(CalcParser.Eq_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#cond_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_op(CalcParser.Cond_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CalcParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(CalcParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#char_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_literal(CalcParser.Char_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(CalcParser.Bool_literalContext ctx);
}
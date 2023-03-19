// Generated from AMGrammar.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AMGrammarParser}.
 */
public interface AMGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AMGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(AMGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(AMGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMGrammarParser#data_section}.
	 * @param ctx the parse tree
	 */
	void enterData_section(AMGrammarParser.Data_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMGrammarParser#data_section}.
	 * @param ctx the parse tree
	 */
	void exitData_section(AMGrammarParser.Data_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMGrammarParser#stack}.
	 * @param ctx the parse tree
	 */
	void enterStack(AMGrammarParser.StackContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMGrammarParser#stack}.
	 * @param ctx the parse tree
	 */
	void exitStack(AMGrammarParser.StackContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMGrammarParser#queue}.
	 * @param ctx the parse tree
	 */
	void enterQueue(AMGrammarParser.QueueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMGrammarParser#queue}.
	 * @param ctx the parse tree
	 */
	void exitQueue(AMGrammarParser.QueueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMGrammarParser#tape}.
	 * @param ctx the parse tree
	 */
	void enterTape(AMGrammarParser.TapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMGrammarParser#tape}.
	 * @param ctx the parse tree
	 */
	void exitTape(AMGrammarParser.TapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMGrammarParser#logic_section}.
	 * @param ctx the parse tree
	 */
	void enterLogic_section(AMGrammarParser.Logic_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMGrammarParser#logic_section}.
	 * @param ctx the parse tree
	 */
	void exitLogic_section(AMGrammarParser.Logic_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMGrammarParser#state_behavior}.
	 * @param ctx the parse tree
	 */
	void enterState_behavior(AMGrammarParser.State_behaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMGrammarParser#state_behavior}.
	 * @param ctx the parse tree
	 */
	void exitState_behavior(AMGrammarParser.State_behaviorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMGrammarParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(AMGrammarParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMGrammarParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(AMGrammarParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(AMGrammarParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(AMGrammarParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMGrammarParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(AMGrammarParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMGrammarParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(AMGrammarParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(AMGrammarParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(AMGrammarParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(AMGrammarParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(AMGrammarParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMGrammarParser#next_state}.
	 * @param ctx the parse tree
	 */
	void enterNext_state(AMGrammarParser.Next_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMGrammarParser#next_state}.
	 * @param ctx the parse tree
	 */
	void exitNext_state(AMGrammarParser.Next_stateContext ctx);
}
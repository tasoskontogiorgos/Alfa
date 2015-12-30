package alfa.core.runtime.gen;


import alfa.core.*;

import alfa.core.runtime.*;

public class printVars extends alfa.core.runtime.BaseAlfaFunction
{
	public printVars( alfa.core.runtime.AlfaEvaluator e )
	{
		super( e );
	}

	@Override
	public String getName()
	{
		return "%printVars";
	}

	@Override
	public java.util.List< FormalArgSpec > getFormals( )
	{
		java.util.List<FormalArgSpec > list = new java.util.ArrayList();
		list.add( new FormalArg.Reg( FormalArg.Mod.STAR, new FormalArg.Concrete( FormalArg.Kind.VAR ) ));
		return list;
	}

	@Override
	public Object eval( alfa.core.EvaluationContext ctx, Object ... actuals ) throws Exception
	{
		Evaluator evaltor = ( Evaluator )getEvaluator();
		return evaltor.printVars( actuals );
	}

}


package alfa.core.runtime.gen;


import alfa.core.*;

import alfa.core.runtime.*;

public class nLinRegression extends alfa.core.runtime.BaseAlfaFunction
{
	public nLinRegression( alfa.core.runtime.AlfaEvaluator e )
	{
		super( e );
	}

	@Override
	public String getName()
	{
		return "%nLinRegression";
	}

	@Override
	public java.util.List< FormalArgSpec > getFormals( )
	{
		java.util.List<FormalArgSpec > list = new java.util.ArrayList();
		list.add( new FormalArg.Concrete( FormalArg.Kind.STR ));
		return list;
	}

	@Override
	public Object eval( alfa.core.EvaluationContext ctx, Object ... actuals ) throws Exception
	{
		Evaluator evaltor = ( Evaluator )getEvaluator();
		return evaltor.nLinRegression( actuals );
	}

}


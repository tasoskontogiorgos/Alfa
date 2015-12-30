package alfa.core.runtime.gen;


import alfa.core.*;

import alfa.core.runtime.*;

public class tasos3 extends alfa.core.runtime.BaseAlfaFunction
{
	public tasos3( alfa.core.runtime.AlfaEvaluator e )
	{
		super( e );
	}

	@Override
	public String getName()
	{
		return "%tasos3";
	}

	@Override
	public java.util.List< FormalArgSpec > getFormals( )
	{
		java.util.List<FormalArgSpec > list = new java.util.ArrayList();
		list.add( new FormalArg.Reg( FormalArg.Mod.PLUS, new FormalArg.Concrete( FormalArg.Kind.NUM ) ));
		return list;
	}

	@Override
	public Object eval( alfa.core.EvaluationContext ctx, Object ... actuals ) throws Exception
	{
		Evaluator evaltor = ( Evaluator )getEvaluator();
		return evaltor.tasos3( actuals );
	}

}


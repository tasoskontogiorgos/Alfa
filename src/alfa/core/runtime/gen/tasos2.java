package alfa.core.runtime.gen;


import alfa.core.*;

import alfa.core.runtime.*;

public class tasos2 extends alfa.core.runtime.BaseAlfaFunction
{
	public tasos2( alfa.core.runtime.AlfaEvaluator e )
	{
		super( e );
	}

	@Override
	public String getName()
	{
		return "%tasos2";
	}

	@Override
	public java.util.List< FormalArgSpec > getFormals( )
	{
		java.util.List<FormalArgSpec > list = new java.util.ArrayList();
		list.add( new FormalArg.Reg( FormalArg.Mod.STAR, new FormalArg.Concrete( FormalArg.Kind.NUM ) ));
		return list;
	}

	@Override
	public Object eval( Object ... actuals ) throws Exception
	{
		Evaluator evaltor = ( Evaluator )getEvaluator();
		return evaltor.tasos2( actuals );
	}

}


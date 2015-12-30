package alfa.core.runtime.gen;


import alfa.core.*;

import alfa.core.runtime.*;

public class join extends alfa.core.runtime.BaseAlfaFunction
{
	public join( alfa.core.runtime.AlfaEvaluator e )
	{
		super( e );
	}

	@Override
	public String getName()
	{
		return "%join";
	}

	@Override
	public java.util.List< FormalArgSpec > getFormals( )
	{
		java.util.List<FormalArgSpec > list = new java.util.ArrayList();
		list.add( new FormalArg.Concrete( FormalArg.Kind.VAR ));
		list.add( new FormalArg.Concrete( FormalArg.Kind.VAR ));
		list.add( new FormalArg.Concrete( FormalArg.Kind.VAR ));
		list.add( new FormalArg.Concrete( FormalArg.Kind.VAR ));
		list.add( new FormalArg.Concrete( FormalArg.Kind.STR ));
		return list;
	}

	@Override
	public Object eval( Object ... actuals ) throws Exception
	{
		Evaluator evaltor = ( Evaluator )getEvaluator();
		return evaltor.join( actuals );
	}

}


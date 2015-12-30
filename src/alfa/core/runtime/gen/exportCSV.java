package alfa.core.runtime.gen;


import alfa.core.*;

import alfa.core.runtime.*;

public class exportCSV extends alfa.core.runtime.BaseAlfaFunction
{
	public exportCSV( alfa.core.runtime.AlfaEvaluator e )
	{
		super( e );
	}

	@Override
	public String getName()
	{
		return "%exportCSV";
	}

	@Override
	public java.util.List< FormalArgSpec > getFormals( )
	{
		java.util.List<FormalArgSpec > list = new java.util.ArrayList();
		list.add( new FormalArg.Concrete( FormalArg.Kind.VAR ));
		list.add( new FormalArg.Concrete( FormalArg.Kind.VAR ));
		return list;
	}

	@Override
	public Object eval( Object ... actuals ) throws Exception
	{
		Evaluator evaltor = ( Evaluator )getEvaluator();
		return evaltor.exportCSV( actuals );
	}

}


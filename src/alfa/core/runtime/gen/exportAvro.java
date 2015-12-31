package alfa.core.runtime.gen;


import alfa.core.*;

import alfa.core.runtime.*;

public class exportAvro extends alfa.core.runtime.BaseAlfaFunction
{
	public exportAvro(  )
	{
	}

	@Override
	public String getName()
	{
		return "%exportAvro";
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
	public Object eval( alfa.core.EvaluationContext ctx, Object ... actuals ) throws Exception
	{
		throw new RuntimeException( "Not Implemented ! ");
	}

}


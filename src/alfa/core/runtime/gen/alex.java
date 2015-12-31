package alfa.core.runtime.gen;


import alfa.core.*;

import alfa.core.runtime.*;

public class alex extends alfa.core.runtime.BaseAlfaFunction
{
	public alex(  )
	{
	}

	@Override
	public String getName()
	{
		return "%alex";
	}

	@Override
	public java.util.List< FormalArgSpec > getFormals( )
	{
		java.util.List<FormalArgSpec > list = new java.util.ArrayList();
		list.add( new FormalArg.Union( new FormalArgSpec[] {new FormalArg.Concrete( FormalArg.Kind.VAR ), new FormalArg.Concrete( FormalArg.Kind.NUM )} ));
		list.add( new FormalArg.Union( new FormalArgSpec[] {new FormalArg.Concrete( FormalArg.Kind.VAR ), new FormalArg.Concrete( FormalArg.Kind.STR )} ));
		list.add( new FormalArg.Reg( FormalArg.Mod.OPTIONAL, new FormalArg.Concrete( FormalArg.Kind.NUM ) ));
		return list;
	}

	@Override
	public Object eval( alfa.core.EvaluationContext ctx, Object ... actuals ) throws Exception
	{
		throw new RuntimeException( "Not Implemented ! ");
	}

}


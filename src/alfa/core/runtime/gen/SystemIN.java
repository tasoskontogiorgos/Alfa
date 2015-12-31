package alfa.core.runtime.gen;


import alfa.core.*;

import alfa.core.runtime.*;

public class SystemIN extends alfa.core.runtime.BaseAlfaFunction
{
	public SystemIN(  )
	{
	}

	@Override
	public String getName()
	{
		return "SystemIN";
	}

	@Override
	public java.util.List< FormalArgSpec > getFormals( )
	{
		java.util.List<FormalArgSpec > list = new java.util.ArrayList();
		list.add( new FormalArg.Union( new FormalArgSpec[] {new FormalArg.Concrete( FormalArg.Kind.VAR ), new FormalArg.Concrete( FormalArg.Kind.STR ), new FormalArg.Concrete( FormalArg.Kind.BOOL ), new FormalArg.Concrete( FormalArg.Kind.NUM ), new FormalArg.Concrete( FormalArg.Kind.MAP ), new FormalArg.Concrete( FormalArg.Kind.PAIRMAP ), new FormalArg.Concrete( FormalArg.Kind.LIST )} ));
		list.add( new FormalArg.Union( new FormalArgSpec[] {new FormalArg.Concrete( FormalArg.Kind.VAR ), new FormalArg.Concrete( FormalArg.Kind.STR ), new FormalArg.Concrete( FormalArg.Kind.BOOL ), new FormalArg.Concrete( FormalArg.Kind.NUM ), new FormalArg.Concrete( FormalArg.Kind.MAP ), new FormalArg.Concrete( FormalArg.Kind.PAIRMAP ), new FormalArg.Concrete( FormalArg.Kind.LIST )} ));
		return list;
	}

	@Override
	public Object eval( alfa.core.EvaluationContext ctx, Object ... actuals ) throws Exception
	{
		throw new RuntimeException( "Not Implemented ! ");
	}

}


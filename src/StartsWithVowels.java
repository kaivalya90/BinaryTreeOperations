import java.util.Iterator;


public class StartsWithVowels extends IteratorDecorator<String>
{
	Iterator pointer;
	public StartsWithVowels(Iterator i) {
		// TODO Auto-generated constructor stub
		pointer =i;
		
	}
	
	//hasNext() returns true if it has next() string which start with vowel
	@Override
	public boolean hasNext() 
	{
		// TODO Auto-generated method stub
		if(pointer.hasNext()==false)
		return false;
		else
		{
			Iterator dummy = new TreeIterator(pointer);
			String s=(String) dummy.next();
			if((s.charAt(0)=='a')||s.charAt(0)=='i'||s.charAt(0)=='e'||s.charAt(0)=='u'||s.charAt(0)=='A'
					||s.charAt(0)=='E'||s.charAt(0)=='I'||s.charAt(0)=='O'||s.charAt(0)=='U')
			{
				return true;
			}
			while (dummy.hasNext()) //ieterate till u get the string which start with vowel
			{
				String p=(String) dummy.next();
				if((p.charAt(0)=='a')||p.charAt(0)=='i'||p.charAt(0)=='e'||p.charAt(0)=='u'||p.charAt(0)=='A'
						||p.charAt(0)=='E'||p.charAt(0)=='I'||p.charAt(0)=='O'||p.charAt(0)=='U')
				{
					return true;
				}
				p=(String) pointer.next().toString();
				
			}
			String l= (String) pointer.next();
			return false;
		}	
	}

	//next() will give you the next string which start with vowel
	@Override
	public String next() {
		// TODO Auto-generated method stub
		//Boolean t=hasNext();
		
		String st=(String) pointer.next();
		if(st==null)
		return null;	
		
		if((st.charAt(0)=='a')||st.charAt(0)=='i'||st.charAt(0)=='e'||st.charAt(0)=='u'||st.charAt(0)=='A'
				||st.charAt(0)=='E'||st.charAt(0)=='I'||st.charAt(0)=='O'||st.charAt(0)=='U')
		{
			return st;
		}
		else return this.next();
		
	}	
	//dummy iterator iterates the tree to keep the original iterator intact
	public Object dummyNext(Iterator dummy)
	{
		while (((Iterator) dummy).hasNext())
		{
			String st=(String) dummy.next().toString();						
			if(st==null)
			return null;
			if((st.charAt(0)=='a')||st.charAt(0)=='i'||st.charAt(0)=='e'||st.charAt(0)=='u'||st.charAt(0)=='A'
					||st.charAt(0)=='E'||st.charAt(0)=='I'||st.charAt(0)=='O'||st.charAt(0)=='U')	{
				return pointer.next();
			}
			String p=(String) pointer.next();
		}
		
		return null;
		
	}
	
	
	
}


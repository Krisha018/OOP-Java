import.java.util.*;
abstract class Veg
{
	public abstract String toString();
}
class potato extends Veg{
public String toString()
{
	String p="potat-yellow";
	return p;
}
}
class brinjal extends Veg{
	public String toString()
{
	String b="brinjal-purple";
	return b;
}
}
class tomato extends Veg{
	public String toString()
{
	String t="tomato-red";
	return t;
}
}



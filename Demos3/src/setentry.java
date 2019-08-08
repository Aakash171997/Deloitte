import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class setentry
{
public static void main(String args[])
{
Properties props = System.getProperties();
Set<Map.Entry<Object,Object>> entrySet = props.entrySet();
for (Map.Entry entry: entrySet)
{
System.out.println(entry.getKey() + " : " +
entry.getValue());
}
}
}


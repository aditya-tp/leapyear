package leap;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class leapyeartest {
	private leapyear lp;
	@Before
	public void setUp() throws Exception{
		lp=new leapyear();
	}
@Test
public void isnotleap_1900()
{
	assertFalse(lp.isLeap(1900));
}
@Test
public void isleap_1996()
{
	assertTrue(lp.isLeap(1996));
}
@Test
public void isleap_2000()
{
	assertTrue(lp.isLeap(2000));
}
@Test
public void isnotleap_2001()
{
	assertFalse(lp.isLeap(2001));
}
}

package grb.simpleos.machine;

import java.nio.charset.StandardCharsets;

public class Display {
	
    public void dump(byte[] content)  {
        System.out.println(new String(content, StandardCharsets.UTF_8));
    }
}

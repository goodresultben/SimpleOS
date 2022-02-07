package grb.simpleos.machine;

public class ReadOnlyMemory {
	private byte[] content = new byte[16];
	
	public ReadOnlyMemory() {
		this.content[0] = 'H';
		this.content[1] = 'e';
		this.content[2] = 'l';
		this.content[3] = 'l';
		
		this.content[4] = 'o';
		this.content[5] = ' ';
		this.content[6] = 'w';
		this.content[7] = 'o';
		
		this.content[8] = 'r';
		this.content[9] = 'l';
		this.content[10] = 'd';
		this.content[11] = '!';
		
		this.content[12] = ' ';
		this.content[13] = ' ';
		this.content[14] = ' ';
		this.content[15] = ' ';
	}
	
	public byte[] read() {
		return content;
	}
}

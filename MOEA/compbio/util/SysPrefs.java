package util;

/**
 * Getter for commonly used properties
 * 
 * @author pvtroshin
 * 
 * @version 1.0 August 2009
 */
public final class SysPrefs {

	private SysPrefs() {
		// Utility class prohibit initialization
	}

	public static final String newlinechar = System
			.getProperty("line.separator");

	public static boolean isWindows = System.getProperty("os.name").startsWith(
			"Windows");

	public static String getCurrentDirectory() {
		return System.getProperty("user.dir");
	}

	public static String getSystemTmpDir() {
		return System.getProperty("java.io.tmpdir");
	}
}

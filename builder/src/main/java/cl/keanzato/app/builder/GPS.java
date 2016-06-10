package cl.keanzato.app.builder;

public class GPS {

	private String OS;
	private String version;
	
	
	/**
	 * 
	 */
	public GPS() {
	}
	/**
	 * @param oS
	 * @param version
	 */
	public GPS(String oS, String version) {
		OS = oS;
		this.version = version;
	}
	/**
	 * @return the oS
	 */
	public String getOS() {
		return OS;
	}
	/**
	 * @param oS the oS to set
	 */
	public void setOS(String oS) {
		OS = oS;
	}
	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	
	
}

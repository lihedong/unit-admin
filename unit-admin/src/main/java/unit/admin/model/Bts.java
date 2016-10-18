package unit.admin.model;

import java.io.Serializable;
import java.util.Date;

public class Bts implements Serializable {
	private static final long serialVersionUID = 1L;

	private Date start_time;
	private int ne_id;
	private String ne_name;
	private String region_name;
	private String city_name;
	private double rate;
	private int vvip_flag;
	private double longitude;
	private double latitude;

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public int getNe_id() {
		return ne_id;
	}

	public void setNe_id(int ne_id) {
		this.ne_id = ne_id;
	}

	public String getNe_name() {
		return ne_name;
	}

	public void setNe_name(String ne_name) {
		this.ne_name = ne_name;
	}

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getVvip_flag() {
		return vvip_flag;
	}

	public void setVvip_flag(int vvip_flag) {
		this.vvip_flag = vvip_flag;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

}

package hello;


import javax.persistence.*;

@Entity
public class Baan {

	@Column(name = "imo")
	private @Id @GeneratedValue int imo;

	@Column(name = "configuration")
	private String configuration;

	@Column(name = "vesseldesc")
	private String vesseldesc;

	@Column(name = "marketsegmentdesc")
	private String marketsegmentdesc;

	@Column(name = "vesselsubtypedesc")
	private String vesselsubtypedesc;
	/*
        @Column(name = "objectgroup")
        private String objectgroup;

        @Column(name = "objectgroupdesc")
        private String objectgroupdesc;

        @Column(name = "object")
        private String object;

        @Column(name = "objectdesc")
        private String objectdesc;

        @Column(name = "objectlevel")
        private Integer objectlevel;

        @Column(name = "lrowner")
        private String lrowner;

        @Column(name = "lrmanager")
        private String lrmanager;

        @Column(name = "hullno")
        private String hullno;

        @Column(name = "dockingsurvey")
        private String dockingsurvey;

        @Column(name = "dateofbuild")
        private String dateofbuild;

        @Column(name = "lrshipstatus")
        private String lrshipstatus;

        @Column(name = "productfamily")
        private String productfamily;

        @Column(name = "segment")
        private String segment;

        @Column(name = "eta")
        private String eta;

        @Column(name = "etd")
        private String etd;

        @Column(name = "currentposition")
        private String currentposition;

        @Column(name = "product")
        private String product;
    */
	public Baan(){

	}

	public int getIMO() {
		return imo;
	}

	public void setIMO(int imo) {
		this.imo = imo;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public String getVesselSubtypeDesc() {
		return vesselsubtypedesc;
	}

	public void setVesselSubtypeDesc(String vesselsubtypedesc) {
		this.vesselsubtypedesc = vesselsubtypedesc;
	}

	public String getMarketSegmentDesc() {
		return marketsegmentdesc;
	}

	public void setMarketSegmentDesc(String marketsegmentdesc) {
		this.marketsegmentdesc = marketsegmentdesc;
	}

	public String getVesselDesc() {
		return vesseldesc;
	}

	public void setVesselDesc(String vesseldesc) {
		this.vesseldesc = vesseldesc;
	}

/*
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}


	public String getCurrentPosition() {
		return currentposition;
	}

	public void setCurrentPosition(String currentposition) {
		this.currentposition = currentposition;
	}

	public String getETD() {
		return etd;
	}

	public void setETD(String etd) {
		this.etd = etd;
	}

	public String getETA() {
		return eta;
	}

	public void setETA(String eta) {
		this.eta = eta;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getProductfamily() {
		return productfamily;
	}

	public void setProductfamily(String productfamily) {
		this.productfamily = productfamily;
	}

	public String getLRShipStatus() {
		return lrshipstatus;
	}

	public void setLRShipStatus(String lrshipstatus) {
		this.lrshipstatus = lrshipstatus;
	}

	public String getDATEOFBUILD() {
		return dateofbuild;
	}

	public void setDATEOFBUILD(String dateofbuild) {
		this.dateofbuild = dateofbuild;
	}

	public String getDOCKINGSURVEY() {
		return dockingsurvey;
	}

	public void setDOCKINGSURVEY(String dockingsurvey) {
		this.dockingsurvey = dockingsurvey;
	}

	public String getHULLNo() {
		return hullno;
	}

	public void setHULLNo(String hullno) {
		this.hullno = hullno;
	}

	public String getLRManager() {
		return lrmanager;
	}

	public void setLRManager(String lrmanager) {
		this.lrmanager = lrmanager;
	}

	public String getLROwner() {
		return lrowner;
	}

	public void setLROwner(String lrowner) {
		this.lrowner = lrowner;
	}

	public Integer getObjectLevel() {
		return objectlevel;
	}

	public void setObjectLevel(Integer objectlevel) {
		this.objectlevel = objectlevel;
	}

	public String getObjectDesc() {
		return objectdesc;
	}

	public void setObjectDesc(String objectdesc) {
		this.objectdesc = objectdesc;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getObjectGroupDesc() {
		return objectgroupdesc;
	}

	public void setObjectGroupDesc(String objectgroupdesc) {
		this.objectgroupdesc = objectgroupdesc;
	}

	public String getObjectGroup() {
		return objectgroup;
	}

	public void setObjectGroup(String objectgroup) {
		this.objectgroup = objectgroup;
	}

	*/
}


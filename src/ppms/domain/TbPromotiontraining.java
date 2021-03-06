package ppms.domain;

import java.util.Date;

import ppms.annotation.ValueChange;
import ppms.excel.template.BaseExcelObject;

/**
 * TbPromotiontraining entity. @author MyEclipse Persistence Tools
 */

public class TbPromotiontraining extends BaseExcelObject implements java.io.Serializable {

	// Fields

	private String promotiontrainingid;
	private OrganizationNj organizationNj;
	private TbEmployee tbEmployee;
	private Date promotiontrainingdate;
	@ValueChange(key_type="PromotionContent")
	private String promotioncontent;
	private Double promotionscore;
	private String createdby;
	private Date createdtime;
	private String modifiedby;
	private Date modifiedtime;

	// Constructors

	/** default constructor */
	public TbPromotiontraining() {
	}

	/** minimal constructor */
	public TbPromotiontraining(String promotiontrainingid) {
		this.promotiontrainingid = promotiontrainingid;
	}

	/** full constructor */
	public TbPromotiontraining(String promotiontrainingid,
			OrganizationNj organizationNj, TbEmployee tbEmployee,
			Date promotiontrainingdate, String promotioncontent,
			Double promotionscore, String createdby, Date createdtime,
			String modifiedby, Date modifiedtime) {
		this.promotiontrainingid = promotiontrainingid;
		this.organizationNj = organizationNj;
		this.tbEmployee = tbEmployee;
		this.promotiontrainingdate = promotiontrainingdate;
		this.promotioncontent = promotioncontent;
		this.promotionscore = promotionscore;
		this.createdby = createdby;
		this.createdtime = createdtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
	}

	// Property accessors

	public String getPromotiontrainingid() {
		return this.promotiontrainingid;
	}

	public void setPromotiontrainingid(String promotiontrainingid) {
		this.promotiontrainingid = promotiontrainingid;
	}

	public OrganizationNj getOrganizationNj() {
		return this.organizationNj;
	}

	public void setOrganizationNj(OrganizationNj organizationNj) {
		this.organizationNj = organizationNj;
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

	public Date getPromotiontrainingdate() {
		return this.promotiontrainingdate;
	}

	public void setPromotiontrainingdate(Date promotiontrainingdate) {
		this.promotiontrainingdate = promotiontrainingdate;
	}

	public String getPromotioncontent() {
		return this.promotioncontent;
	}

	public void setPromotioncontent(String promotioncontent) {
		this.promotioncontent = promotioncontent;
	}

	public Double getPromotionscore() {
		return this.promotionscore;
	}

	public void setPromotionscore(Double promotionscore) {
		this.promotionscore = promotionscore;
	}

	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreatedtime() {
		return this.createdtime;
	}

	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}

	public String getModifiedby() {
		return this.modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getModifiedtime() {
		return this.modifiedtime;
	}

	public void setModifiedtime(Date modifiedtime) {
		this.modifiedtime = modifiedtime;
	}

}
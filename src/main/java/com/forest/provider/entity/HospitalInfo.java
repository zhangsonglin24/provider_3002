package com.forest.provider.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_hospital_info")
public class HospitalInfo {
    /**
     * 医院Id
     */
    @Id
    @Column(name = "hospital_id")
    private String hospitalId;

    /**
     * 主键ID
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 医院所属区域编号
     */
    @Column(name = "area_id")
    private Integer areaId;

    /**
     *  医院名称
     */
    @Column(name = "hospital_name")
    private String hospitalName;

    /**
     * 医院地址
     */
    private String address;

    /**
     * 邮政编码
     */
    @Column(name = "zip_code")
    private String zipCode;

    /**
     * 医院经度
     */
    private Double longitude;

    /**
     * 医院纬度
     */
    private Double latitude;

    /**
     * 医院类型
     */
    @Column(name = "hospital_type")
    private String hospitalType;

    /**
     * 医院等级
     */
    @Column(name = "hospital_level")
    private String hospitalLevel;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 医院状态 未上线：0 正式上线：1 试上线：2
     */
    @Column(name = "golive_status")
    private String goliveStatus;

    /**
     * logo地址
     */
    @Column(name = "logo_addr")
    private String logoAddr;

    /**
     * 所属平台
     */
    private String platform;

    /**
     * 排序编码
     */
    @Column(name = "sort_code")
    private Integer sortCode;

    /**
     * 开启标识
     */
    @Column(name = "open_flag")
    private String openFlag;

    /**
     * 是否为区域医院，1:是; 0:否
     */
    @Column(name = "region_flag")
    private Boolean regionFlag;

    /**
     * 关闭原因
     */
    @Column(name = "close_reason")
    private String closeReason;

    /**
     * 关闭提示
     */
    @Column(name = "close_alert_info")
    private String closeAlertInfo;

    /**
     * 网络标识
     */
    @Column(name = "online_flag")
    private Integer onlineFlag;

    /**
     * 医院简介标题
     */
    @Column(name = "desc_title")
    private String descTitle;

    /**
     * 医院简介
     */
    @Column(name = "hospital_desc")
    private String hospitalDesc;

    /**
     * 医院所在省份
     */
    @Column(name = "province_name")
    private String provinceName;

    /**
     * 医院所在城市
     */
    @Column(name = "city_name")
    private String cityName;

    /**
     * 医院端地址
     */
    @Column(name = "terminal_address")
    private String terminalAddress;

    /**
     * 门诊量
     */
    private Integer outpatient;

    /**
     * 数据是否有效 0: 无效， 1：有效，逻辑删除位
     */
    private Boolean enable;

    /**
     * 更新时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 是否新疆v3医院，1:是; 0:否
     */
    @Column(name = "xinjiang_v3")
    private Boolean xinjiangV3;

    /**
     * 来源类型
     */
    @Column(name = "source_type")
    private String sourceType;

    /**
     * 来源id
     */
    @Column(name = "source_id")
    private String sourceId;

    /**
     * 医院所在地区省份编码
     */
    @Column(name = "province_code")
    private String provinceCode;

    /**
     * 医院所在地区城市编码
     */
    @Column(name = "city_code")
    private String cityCode;

    /**
     * 医院支持的并发数
     */
    @Column(name = "concurrent_amount")
    private Byte concurrentAmount;

    /**
     * 是否故障,1:是;0:否
     */
    @Column(name = "fault_flag")
    private Boolean faultFlag;

    /**
     * 故障原因
     */
    @Column(name = "fault_reason")
    private String faultReason;

    /**
     * 是否是数据中心子医院
     */
    @Column(name = "data_center_sub_flag")
    private Byte dataCenterSubFlag;

    /**
     * 法再医院评分
     */
    @Column(name = "fazai_score")
    private String fazaiScore;

    /**
     * 获取医院Id
     *
     * @return hospital_id - 医院Id
     */
    public String getHospitalId() {
        return hospitalId;
    }

    /**
     * 设置医院Id
     *
     * @param hospitalId 医院Id
     */
    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取医院所属区域编号
     *
     * @return area_id - 医院所属区域编号
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * 设置医院所属区域编号
     *
     * @param areaId 医院所属区域编号
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * 获取 医院名称
     *
     * @return hospital_name -  医院名称
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * 设置 医院名称
     *
     * @param hospitalName  医院名称
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * 获取医院地址
     *
     * @return address - 医院地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置医院地址
     *
     * @param address 医院地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取邮政编码
     *
     * @return zip_code - 邮政编码
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 设置邮政编码
     *
     * @param zipCode 邮政编码
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * 获取医院经度
     *
     * @return longitude - 医院经度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 设置医院经度
     *
     * @param longitude 医院经度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取医院纬度
     *
     * @return latitude - 医院纬度
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 设置医院纬度
     *
     * @param latitude 医院纬度
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取医院类型
     *
     * @return hospital_type - 医院类型
     */
    public String getHospitalType() {
        return hospitalType;
    }

    /**
     * 设置医院类型
     *
     * @param hospitalType 医院类型
     */
    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType;
    }

    /**
     * 获取医院等级
     *
     * @return hospital_level - 医院等级
     */
    public String getHospitalLevel() {
        return hospitalLevel;
    }

    /**
     * 设置医院等级
     *
     * @param hospitalLevel 医院等级
     */
    public void setHospitalLevel(String hospitalLevel) {
        this.hospitalLevel = hospitalLevel;
    }

    /**
     * 获取联系人
     *
     * @return contact - 联系人
     */
    public String getContact() {
        return contact;
    }

    /**
     * 设置联系人
     *
     * @param contact 联系人
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * 获取医院状态 未上线：0 正式上线：1 试上线：2
     *
     * @return golive_status - 医院状态 未上线：0 正式上线：1 试上线：2
     */
    public String getGoliveStatus() {
        return goliveStatus;
    }

    /**
     * 设置医院状态 未上线：0 正式上线：1 试上线：2
     *
     * @param goliveStatus 医院状态 未上线：0 正式上线：1 试上线：2
     */
    public void setGoliveStatus(String goliveStatus) {
        this.goliveStatus = goliveStatus;
    }

    /**
     * 获取logo地址
     *
     * @return logo_addr - logo地址
     */
    public String getLogoAddr() {
        return logoAddr;
    }

    /**
     * 设置logo地址
     *
     * @param logoAddr logo地址
     */
    public void setLogoAddr(String logoAddr) {
        this.logoAddr = logoAddr;
    }

    /**
     * 获取所属平台
     *
     * @return platform - 所属平台
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 设置所属平台
     *
     * @param platform 所属平台
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * 获取排序编码
     *
     * @return sort_code - 排序编码
     */
    public Integer getSortCode() {
        return sortCode;
    }

    /**
     * 设置排序编码
     *
     * @param sortCode 排序编码
     */
    public void setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
    }

    /**
     * 获取开启标识
     *
     * @return open_flag - 开启标识
     */
    public String getOpenFlag() {
        return openFlag;
    }

    /**
     * 设置开启标识
     *
     * @param openFlag 开启标识
     */
    public void setOpenFlag(String openFlag) {
        this.openFlag = openFlag;
    }

    /**
     * 获取是否为区域医院，1:是; 0:否
     *
     * @return region_flag - 是否为区域医院，1:是; 0:否
     */
    public Boolean getRegionFlag() {
        return regionFlag;
    }

    /**
     * 设置是否为区域医院，1:是; 0:否
     *
     * @param regionFlag 是否为区域医院，1:是; 0:否
     */
    public void setRegionFlag(Boolean regionFlag) {
        this.regionFlag = regionFlag;
    }

    /**
     * 获取关闭原因
     *
     * @return close_reason - 关闭原因
     */
    public String getCloseReason() {
        return closeReason;
    }

    /**
     * 设置关闭原因
     *
     * @param closeReason 关闭原因
     */
    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason;
    }

    /**
     * 获取关闭提示
     *
     * @return close_alert_info - 关闭提示
     */
    public String getCloseAlertInfo() {
        return closeAlertInfo;
    }

    /**
     * 设置关闭提示
     *
     * @param closeAlertInfo 关闭提示
     */
    public void setCloseAlertInfo(String closeAlertInfo) {
        this.closeAlertInfo = closeAlertInfo;
    }

    /**
     * 获取网络标识
     *
     * @return online_flag - 网络标识
     */
    public Integer getOnlineFlag() {
        return onlineFlag;
    }

    /**
     * 设置网络标识
     *
     * @param onlineFlag 网络标识
     */
    public void setOnlineFlag(Integer onlineFlag) {
        this.onlineFlag = onlineFlag;
    }

    /**
     * 获取医院简介标题
     *
     * @return desc_title - 医院简介标题
     */
    public String getDescTitle() {
        return descTitle;
    }

    /**
     * 设置医院简介标题
     *
     * @param descTitle 医院简介标题
     */
    public void setDescTitle(String descTitle) {
        this.descTitle = descTitle;
    }

    /**
     * 获取医院简介
     *
     * @return hospital_desc - 医院简介
     */
    public String getHospitalDesc() {
        return hospitalDesc;
    }

    /**
     * 设置医院简介
     *
     * @param hospitalDesc 医院简介
     */
    public void setHospitalDesc(String hospitalDesc) {
        this.hospitalDesc = hospitalDesc;
    }

    /**
     * 获取医院所在省份
     *
     * @return province_name - 医院所在省份
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 设置医院所在省份
     *
     * @param provinceName 医院所在省份
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * 获取医院所在城市
     *
     * @return city_name - 医院所在城市
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置医院所在城市
     *
     * @param cityName 医院所在城市
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 获取医院端地址
     *
     * @return terminal_address - 医院端地址
     */
    public String getTerminalAddress() {
        return terminalAddress;
    }

    /**
     * 设置医院端地址
     *
     * @param terminalAddress 医院端地址
     */
    public void setTerminalAddress(String terminalAddress) {
        this.terminalAddress = terminalAddress;
    }

    /**
     * 获取门诊量
     *
     * @return outpatient - 门诊量
     */
    public Integer getOutpatient() {
        return outpatient;
    }

    /**
     * 设置门诊量
     *
     * @param outpatient 门诊量
     */
    public void setOutpatient(Integer outpatient) {
        this.outpatient = outpatient;
    }

    /**
     * 获取数据是否有效 0: 无效， 1：有效，逻辑删除位
     *
     * @return enable - 数据是否有效 0: 无效， 1：有效，逻辑删除位
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * 设置数据是否有效 0: 无效， 1：有效，逻辑删除位
     *
     * @param enable 数据是否有效 0: 无效， 1：有效，逻辑删除位
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * 获取更新时间
     *
     * @return modify_time - 更新时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param modifyTime 更新时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取备注信息
     *
     * @return remarks - 备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注信息
     *
     * @param remarks 备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取是否新疆v3医院，1:是; 0:否
     *
     * @return xinjiang_v3 - 是否新疆v3医院，1:是; 0:否
     */
    public Boolean getXinjiangV3() {
        return xinjiangV3;
    }

    /**
     * 设置是否新疆v3医院，1:是; 0:否
     *
     * @param xinjiangV3 是否新疆v3医院，1:是; 0:否
     */
    public void setXinjiangV3(Boolean xinjiangV3) {
        this.xinjiangV3 = xinjiangV3;
    }

    /**
     * 获取来源类型
     *
     * @return source_type - 来源类型
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * 设置来源类型
     *
     * @param sourceType 来源类型
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 获取来源id
     *
     * @return source_id - 来源id
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * 设置来源id
     *
     * @param sourceId 来源id
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * 获取医院所在地区省份编码
     *
     * @return province_code - 医院所在地区省份编码
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 设置医院所在地区省份编码
     *
     * @param provinceCode 医院所在地区省份编码
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * 获取医院所在地区城市编码
     *
     * @return city_code - 医院所在地区城市编码
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置医院所在地区城市编码
     *
     * @param cityCode 医院所在地区城市编码
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 获取医院支持的并发数
     *
     * @return concurrent_amount - 医院支持的并发数
     */
    public Byte getConcurrentAmount() {
        return concurrentAmount;
    }

    /**
     * 设置医院支持的并发数
     *
     * @param concurrentAmount 医院支持的并发数
     */
    public void setConcurrentAmount(Byte concurrentAmount) {
        this.concurrentAmount = concurrentAmount;
    }

    /**
     * 获取是否故障,1:是;0:否
     *
     * @return fault_flag - 是否故障,1:是;0:否
     */
    public Boolean getFaultFlag() {
        return faultFlag;
    }

    /**
     * 设置是否故障,1:是;0:否
     *
     * @param faultFlag 是否故障,1:是;0:否
     */
    public void setFaultFlag(Boolean faultFlag) {
        this.faultFlag = faultFlag;
    }

    /**
     * 获取故障原因
     *
     * @return fault_reason - 故障原因
     */
    public String getFaultReason() {
        return faultReason;
    }

    /**
     * 设置故障原因
     *
     * @param faultReason 故障原因
     */
    public void setFaultReason(String faultReason) {
        this.faultReason = faultReason;
    }

    /**
     * 获取是否是数据中心子医院
     *
     * @return data_center_sub_flag - 是否是数据中心子医院
     */
    public Byte getDataCenterSubFlag() {
        return dataCenterSubFlag;
    }

    /**
     * 设置是否是数据中心子医院
     *
     * @param dataCenterSubFlag 是否是数据中心子医院
     */
    public void setDataCenterSubFlag(Byte dataCenterSubFlag) {
        this.dataCenterSubFlag = dataCenterSubFlag;
    }

    /**
     * 获取法再医院评分
     *
     * @return fazai_score - 法再医院评分
     */
    public String getFazaiScore() {
        return fazaiScore;
    }

    /**
     * 设置法再医院评分
     *
     * @param fazaiScore 法再医院评分
     */
    public void setFazaiScore(String fazaiScore) {
        this.fazaiScore = fazaiScore;
    }
}
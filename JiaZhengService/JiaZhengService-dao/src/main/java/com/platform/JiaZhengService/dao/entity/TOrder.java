package com.platform.JiaZhengService.dao.entity;

import com.platform.JiaZhengService.common.pojo.StringAndEqualsPojo;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: TOrder
* @Description: t_order表对应的java bean类
* @author: peiyu
 */
public class TOrder extends StringAndEqualsPojo implements Serializable {
    /**
     * @Fields serialVersionUID : 自动生成默认序列化ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * @Fields t_order.id :
     */
    private Long id;

    /**
     * @Fields t_order.create_date :
     */
    private Date createDate;

    /**
     * @Fields t_order.modify_date :
     */
    private Date modifyDate;

    /**
     * @Fields t_order.address :
     */
    private String address;

    /**
     * @Fields t_order.amount_paid :
     */
    private Double amountPaid;

    /**
     * @Fields t_order.area_name :
     */
    private String areaName;

    /**
     * @Fields t_order.consignee :
     */
    private String consignee;

    /**
     * @Fields t_order.coupon_discount :
     */
    private Double couponDiscount;

    /**
     * @Fields t_order.expire :
     */
    private Date expire;

    /**
     * @Fields t_order.fee :
     */
    private Double fee;

    /**
     * @Fields t_order.freight :
     */
    private Double freight;

    /**
     * @Fields t_order.invoice_title :
     */
    private String invoiceTitle;

    /**
     * @Fields t_order.is_allocated_stock :
     */
    private Boolean isAllocatedStock;

    /**
     * @Fields t_order.is_invoice :
     */
    private Boolean isInvoice;

    /**
     * @Fields t_order.lock_expire :
     */
    private Date lockExpire;

    /**
     * @Fields t_order.memo :
     */
    private String memo;

    /**
     * @Fields t_order.offset_amount :
     */
    private Double offsetAmount;

    /**
     * @Fields t_order.order_status :
     */
    private Integer orderStatus;

    /**
     * @Fields t_order.payment_method_name :
     */
    private String paymentMethodName;

    /**
     * @Fields t_order.payment_status :
     */
    private Integer paymentStatus;

    /**
     * @Fields t_order.phone :
     */
    private String phone;

    /**
     * @Fields t_order.point :
     */
    private Long point;

    /**
     * @Fields t_order.promotion :
     */
    private String promotion;

    /**
     * @Fields t_order.promotion_discount :
     */
    private Double promotionDiscount;

    /**
     * @Fields t_order.shipping_method_name :
     */
    private String shippingMethodName;

    /**
     * @Fields t_order.shipping_status :
     */
    private Integer shippingStatus;

    /**
     * @Fields t_order.sn :
     */
    private String sn;

    /**
     * @Fields t_order.tax :
     */
    private Double tax;

    /**
     * @Fields t_order.zip_code :
     */
    private String zipCode;

    /**
     * @Fields t_order.area :
     */
    private Long area;

    /**
     * @Fields t_order.coupon_code :
     */
    private Long couponCode;

    /**
     * @Fields t_order.member :
     */
    private Long member;

    /**
     * @Fields t_order.operator :
     */
    private Long operator;

    /**
     * @Fields t_order.payment_method :
     */
    private Long paymentMethod;

    /**
     * @Fields t_order.shipping_method :
     */
    private Long shippingMethod;

    /**
     * @Fields t_order.agree_return :
     */
    private Integer agreeReturn;

    /**
     * @Fields t_order.invoice_type :
     */
    private String invoiceType;

    /**
     * @Fields t_order.payment_plugin_id :
     */
    private String paymentPluginId;

    /**
     * @Fields t_order.confirm_delivery_time :
     */
    private Date confirmDeliveryTime;

    /**
     * @Fields t_order.memo_flag :
     */
    private Integer memoFlag;

    /**
     * @Fields t_order.seller_memo :
     */
    private String sellerMemo;

    /**
     * @Fields t_order.bank_code :
     */
    private String bankCode;

    /**
     * @Fields t_order.bank_name :
     */
    private String bankName;

    /**
     * @Fields t_order.order_source :
     */
    private String orderSource;

    /**
     * @Fields t_order.system_type :
     */
    private String systemType;

    /**
     * @Fields t_order.system_version :
     */
    private String systemVersion;

    /**
     * @return t_order.id : 返回 
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id of t_order : 设置 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return t_order.create_date : 返回 
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate of t_order : 设置 
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return t_order.modify_date : 返回 
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate of t_order : 设置 
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * @return t_order.address : 返回 
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address of t_order : 设置 
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return t_order.amount_paid : 返回 
     */
    public Double getAmountPaid() {
        return amountPaid;
    }

    /**
     * @param amountPaid of t_order : 设置 
     */
    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    /**
     * @return t_order.area_name : 返回 
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * @param areaName of t_order : 设置 
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * @return t_order.consignee : 返回 
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * @param consignee of t_order : 设置 
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    /**
     * @return t_order.coupon_discount : 返回 
     */
    public Double getCouponDiscount() {
        return couponDiscount;
    }

    /**
     * @param couponDiscount of t_order : 设置 
     */
    public void setCouponDiscount(Double couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    /**
     * @return t_order.expire : 返回 
     */
    public Date getExpire() {
        return expire;
    }

    /**
     * @param expire of t_order : 设置 
     */
    public void setExpire(Date expire) {
        this.expire = expire;
    }

    /**
     * @return t_order.fee : 返回 
     */
    public Double getFee() {
        return fee;
    }

    /**
     * @param fee of t_order : 设置 
     */
    public void setFee(Double fee) {
        this.fee = fee;
    }

    /**
     * @return t_order.freight : 返回 
     */
    public Double getFreight() {
        return freight;
    }

    /**
     * @param freight of t_order : 设置 
     */
    public void setFreight(Double freight) {
        this.freight = freight;
    }

    /**
     * @return t_order.invoice_title : 返回 
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * @param invoiceTitle of t_order : 设置 
     */
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    /**
     * @return t_order.is_allocated_stock : 返回 
     */
    public Boolean getIsAllocatedStock() {
        return isAllocatedStock;
    }

    /**
     * @param isAllocatedStock of t_order : 设置 
     */
    public void setIsAllocatedStock(Boolean isAllocatedStock) {
        this.isAllocatedStock = isAllocatedStock;
    }

    /**
     * @return t_order.is_invoice : 返回 
     */
    public Boolean getIsInvoice() {
        return isInvoice;
    }

    /**
     * @param isInvoice of t_order : 设置 
     */
    public void setIsInvoice(Boolean isInvoice) {
        this.isInvoice = isInvoice;
    }

    /**
     * @return t_order.lock_expire : 返回 
     */
    public Date getLockExpire() {
        return lockExpire;
    }

    /**
     * @param lockExpire of t_order : 设置 
     */
    public void setLockExpire(Date lockExpire) {
        this.lockExpire = lockExpire;
    }

    /**
     * @return t_order.memo : 返回 
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo of t_order : 设置 
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * @return t_order.offset_amount : 返回 
     */
    public Double getOffsetAmount() {
        return offsetAmount;
    }

    /**
     * @param offsetAmount of t_order : 设置 
     */
    public void setOffsetAmount(Double offsetAmount) {
        this.offsetAmount = offsetAmount;
    }

    /**
     * @return t_order.order_status : 返回 
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * @param orderStatus of t_order : 设置 
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * @return t_order.payment_method_name : 返回 
     */
    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    /**
     * @param paymentMethodName of t_order : 设置 
     */
    public void setPaymentMethodName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName == null ? null : paymentMethodName.trim();
    }

    /**
     * @return t_order.payment_status : 返回 
     */
    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * @param paymentStatus of t_order : 设置 
     */
    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * @return t_order.phone : 返回 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone of t_order : 设置 
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return t_order.point : 返回 
     */
    public Long getPoint() {
        return point;
    }

    /**
     * @param point of t_order : 设置 
     */
    public void setPoint(Long point) {
        this.point = point;
    }

    /**
     * @return t_order.promotion : 返回 
     */
    public String getPromotion() {
        return promotion;
    }

    /**
     * @param promotion of t_order : 设置 
     */
    public void setPromotion(String promotion) {
        this.promotion = promotion == null ? null : promotion.trim();
    }

    /**
     * @return t_order.promotion_discount : 返回 
     */
    public Double getPromotionDiscount() {
        return promotionDiscount;
    }

    /**
     * @param promotionDiscount of t_order : 设置 
     */
    public void setPromotionDiscount(Double promotionDiscount) {
        this.promotionDiscount = promotionDiscount;
    }

    /**
     * @return t_order.shipping_method_name : 返回 
     */
    public String getShippingMethodName() {
        return shippingMethodName;
    }

    /**
     * @param shippingMethodName of t_order : 设置 
     */
    public void setShippingMethodName(String shippingMethodName) {
        this.shippingMethodName = shippingMethodName == null ? null : shippingMethodName.trim();
    }

    /**
     * @return t_order.shipping_status : 返回 
     */
    public Integer getShippingStatus() {
        return shippingStatus;
    }

    /**
     * @param shippingStatus of t_order : 设置 
     */
    public void setShippingStatus(Integer shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    /**
     * @return t_order.sn : 返回 
     */
    public String getSn() {
        return sn;
    }

    /**
     * @param sn of t_order : 设置 
     */
    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    /**
     * @return t_order.tax : 返回 
     */
    public Double getTax() {
        return tax;
    }

    /**
     * @param tax of t_order : 设置 
     */
    public void setTax(Double tax) {
        this.tax = tax;
    }

    /**
     * @return t_order.zip_code : 返回 
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode of t_order : 设置 
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * @return t_order.area : 返回 
     */
    public Long getArea() {
        return area;
    }

    /**
     * @param area of t_order : 设置 
     */
    public void setArea(Long area) {
        this.area = area;
    }

    /**
     * @return t_order.coupon_code : 返回 
     */
    public Long getCouponCode() {
        return couponCode;
    }

    /**
     * @param couponCode of t_order : 设置 
     */
    public void setCouponCode(Long couponCode) {
        this.couponCode = couponCode;
    }

    /**
     * @return t_order.member : 返回 
     */
    public Long getMember() {
        return member;
    }

    /**
     * @param member of t_order : 设置 
     */
    public void setMember(Long member) {
        this.member = member;
    }

    /**
     * @return t_order.operator : 返回 
     */
    public Long getOperator() {
        return operator;
    }

    /**
     * @param operator of t_order : 设置 
     */
    public void setOperator(Long operator) {
        this.operator = operator;
    }

    /**
     * @return t_order.payment_method : 返回 
     */
    public Long getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod of t_order : 设置 
     */
    public void setPaymentMethod(Long paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return t_order.shipping_method : 返回 
     */
    public Long getShippingMethod() {
        return shippingMethod;
    }

    /**
     * @param shippingMethod of t_order : 设置 
     */
    public void setShippingMethod(Long shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    /**
     * @return t_order.agree_return : 返回 
     */
    public Integer getAgreeReturn() {
        return agreeReturn;
    }

    /**
     * @param agreeReturn of t_order : 设置 
     */
    public void setAgreeReturn(Integer agreeReturn) {
        this.agreeReturn = agreeReturn;
    }

    /**
     * @return t_order.invoice_type : 返回 
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * @param invoiceType of t_order : 设置 
     */
    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    /**
     * @return t_order.payment_plugin_id : 返回 
     */
    public String getPaymentPluginId() {
        return paymentPluginId;
    }

    /**
     * @param paymentPluginId of t_order : 设置 
     */
    public void setPaymentPluginId(String paymentPluginId) {
        this.paymentPluginId = paymentPluginId == null ? null : paymentPluginId.trim();
    }

    /**
     * @return t_order.confirm_delivery_time : 返回 
     */
    public Date getConfirmDeliveryTime() {
        return confirmDeliveryTime;
    }

    /**
     * @param confirmDeliveryTime of t_order : 设置 
     */
    public void setConfirmDeliveryTime(Date confirmDeliveryTime) {
        this.confirmDeliveryTime = confirmDeliveryTime;
    }

    /**
     * @return t_order.memo_flag : 返回 
     */
    public Integer getMemoFlag() {
        return memoFlag;
    }

    /**
     * @param memoFlag of t_order : 设置 
     */
    public void setMemoFlag(Integer memoFlag) {
        this.memoFlag = memoFlag;
    }

    /**
     * @return t_order.seller_memo : 返回 
     */
    public String getSellerMemo() {
        return sellerMemo;
    }

    /**
     * @param sellerMemo of t_order : 设置 
     */
    public void setSellerMemo(String sellerMemo) {
        this.sellerMemo = sellerMemo == null ? null : sellerMemo.trim();
    }

    /**
     * @return t_order.bank_code : 返回 
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * @param bankCode of t_order : 设置 
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * @return t_order.bank_name : 返回 
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * @param bankName of t_order : 设置 
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * @return t_order.order_source : 返回 
     */
    public String getOrderSource() {
        return orderSource;
    }

    /**
     * @param orderSource of t_order : 设置 
     */
    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource == null ? null : orderSource.trim();
    }

    /**
     * @return t_order.system_type : 返回 
     */
    public String getSystemType() {
        return systemType;
    }

    /**
     * @param systemType of t_order : 设置 
     */
    public void setSystemType(String systemType) {
        this.systemType = systemType == null ? null : systemType.trim();
    }

    /**
     * @return t_order.system_version : 返回 
     */
    public String getSystemVersion() {
        return systemVersion;
    }

    /**
     * @param systemVersion of t_order : 设置 
     */
    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion == null ? null : systemVersion.trim();
    }
}
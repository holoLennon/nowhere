package com.holo.common.bean;


import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.holo.common.util.JsonUtilAli;
import com.holo.domain.base.BaseEntity;



/**
 * 支付宝app支付参数
 * @author holo
 * @version 1.0
 * @since 
 */

public class ApAppapiPaymentParam extends BaseEntity{
	
	//alias
	public static final String TABLE_ALIAS = "支付宝app支付参数";

	//date formats
	
	//columns START
	/**接口名称 String  接口名称，固定值。 */
	
	
	private String service;
	/**合作者身份ID String  签约的支付宝账号对应的支付宝唯一用户号。以2088开头的16位纯数字组成。 */
	
	
	private String partner;
	/**参数编码字符集 String default=utf-8 商户网站使用的编码格式，固定为utf-8。 */
	
	
	private String inputCharset;
	/**签名方式 String default=RSA 签名类型，目前仅支持RSA。 */
	
	
	private String signType;
	/**签名 String   */
	
	
	private String sign;
	/**服务器异步通知页面路径 String  支付宝服务器主动通知商户网站里指定的页面http路径。 */
	
	
	private String notifyUrl;
	/**商户网站唯一订单号 String  支付宝合作商户网站唯一订单号。 */
	
	
	private String outTradeNo;
	/**商品名称 String  商品的标题/交易标题/订单标题/订单关键字等。该参数最长为128个汉字。 */
	
	
	private String subject;
	/**支付类型 String default=1 支付类型。默认值为：1（商品购买）。 */
	
	
	private String paymentType;
	/**卖家支付宝账号 String  卖家支付宝账号（邮箱或手机号码格式）或其对应的支付宝唯一用户号（以2088开头的纯16位数字）。 */
	
	
	private String sellerId;
	/**总金额 Double default=0.0 该笔订单的资金总额，单位为RMB-Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。 */
	
	
	private Double totalFee;
	/**商品详情 String  对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。 */
	
	
	private String body;
	//columns END
	/**
	 * 设置默认值
	 * @param _this
	 */
	public void makedefault(ApAppapiPaymentParam _this){
		_this.inputCharset="utf-8";
		_this.signType="RSA";
		_this.paymentType="1";
		_this.totalFee=0.0;
	}
	public ApAppapiPaymentParam(){
		makedefault(this);
	}
	/**
	 * 不包括自动变量的构造
	 * @param service String 接口名称  接口名称，固定值。 
	 * @param partner String 合作者身份ID  签约的支付宝账号对应的支付宝唯一用户号。以2088开头的16位纯数字组成。 
	 * @param inputCharset String 参数编码字符集 default=utf-8 商户网站使用的编码格式，固定为utf-8。 
	 * @param signType String 签名方式 default=RSA 签名类型，目前仅支持RSA。 
	 * @param sign String 签名   
	 * @param notifyUrl String 服务器异步通知页面路径  支付宝服务器主动通知商户网站里指定的页面http路径。 
	 * @param outTradeNo String 商户网站唯一订单号  支付宝合作商户网站唯一订单号。 
	 * @param subject String 商品名称  商品的标题/交易标题/订单标题/订单关键字等。该参数最长为128个汉字。 
	 * @param paymentType String 支付类型 default=1 支付类型。默认值为：1（商品购买）。 
	 * @param sellerId String 卖家支付宝账号  卖家支付宝账号（邮箱或手机号码格式）或其对应的支付宝唯一用户号（以2088开头的纯16位数字）。 
	 * @param totalFee Double 总金额 default=0.0 该笔订单的资金总额，单位为RMB-Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。 
	 * @param body String 商品详情  对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。 
	* @param notuse String 没用
	 */
	public ApAppapiPaymentParam(String service ,String partner ,String inputCharset ,String signType ,String sign ,String notifyUrl ,String outTradeNo ,String subject ,String paymentType ,String sellerId ,Double totalFee ,String body ,String notuse) {
		super();
		this.service = service;
		this.partner = partner;
		this.inputCharset = inputCharset;
		this.signType = signType;
		this.sign = sign;
		this.notifyUrl = notifyUrl;
		this.outTradeNo = outTradeNo;
		this.subject = subject;
		this.paymentType = paymentType;
		this.sellerId = sellerId;
		this.totalFee = totalFee;
		this.body = body;
	}
	/**
	 * 全部数据的构造，包括了对象字段
	 * @param service String 接口名称  接口名称，固定值。 
	 * @param partner String 合作者身份ID  签约的支付宝账号对应的支付宝唯一用户号。以2088开头的16位纯数字组成。 
	 * @param inputCharset String 参数编码字符集 default=utf-8 商户网站使用的编码格式，固定为utf-8。 
	 * @param signType String 签名方式 default=RSA 签名类型，目前仅支持RSA。 
	 * @param sign String 签名   
	 * @param notifyUrl String 服务器异步通知页面路径  支付宝服务器主动通知商户网站里指定的页面http路径。 
	 * @param outTradeNo String 商户网站唯一订单号  支付宝合作商户网站唯一订单号。 
	 * @param subject String 商品名称  商品的标题/交易标题/订单标题/订单关键字等。该参数最长为128个汉字。 
	 * @param paymentType String 支付类型 default=1 支付类型。默认值为：1（商品购买）。 
	 * @param sellerId String 卖家支付宝账号  卖家支付宝账号（邮箱或手机号码格式）或其对应的支付宝唯一用户号（以2088开头的纯16位数字）。 
	 * @param totalFee Double 总金额 default=0.0 该笔订单的资金总额，单位为RMB-Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。 
	 * @param body String 商品详情  对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。 
	* @param notuse String 没用
	 */
	public ApAppapiPaymentParam(String service ,String partner ,String inputCharset ,String signType ,String sign ,String notifyUrl ,String outTradeNo ,String subject ,String paymentType ,String sellerId ,Double totalFee ,String body ,String notuse,Object notuse2) {
		super();
		this.service = service;
		this.partner = partner;
		this.inputCharset = inputCharset;
		this.signType = signType;
		this.sign = sign;
		this.notifyUrl = notifyUrl;
		this.outTradeNo = outTradeNo;
		this.subject = subject;
		this.paymentType = paymentType;
		this.sellerId = sellerId;
		this.totalFee = totalFee;
		this.body = body;
	}

	
	/**获取接口名称 接口名称，固定值。 */
	

	
	public String getService() {
		return this.service;
	}
	/**设置接口名称 接口名称，固定值。 */

	public void setService(String value) {
		this.service = value;
	}
	/**获取合作者身份ID 签约的支付宝账号对应的支付宝唯一用户号。以2088开头的16位纯数字组成。 */
	

	
	public String getPartner() {
		return this.partner;
	}
	/**设置合作者身份ID 签约的支付宝账号对应的支付宝唯一用户号。以2088开头的16位纯数字组成。 */

	public void setPartner(String value) {
		this.partner = value;
	}
	/**获取参数编码字符集 商户网站使用的编码格式，固定为utf-8。 */
	

	
	public String getInputCharset() {
		return this.inputCharset;
	}
	/**设置参数编码字符集 商户网站使用的编码格式，固定为utf-8。 */

	public void setInputCharset(String value) {
		this.inputCharset = value;
	}
	/**获取签名方式 签名类型，目前仅支持RSA。 */
	

	
	public String getSignType() {
		return this.signType;
	}
	/**设置签名方式 签名类型，目前仅支持RSA。 */

	public void setSignType(String value) {
		this.signType = value;
	}
	/**获取签名  */
	

	
	public String getSign() {
		return this.sign;
	}
	/**设置签名  */

	public void setSign(String value) {
		this.sign = value;
	}
	/**获取服务器异步通知页面路径 支付宝服务器主动通知商户网站里指定的页面http路径。 */
	

	
	public String getNotifyUrl() {
		return this.notifyUrl;
	}
	/**设置服务器异步通知页面路径 支付宝服务器主动通知商户网站里指定的页面http路径。 */

	public void setNotifyUrl(String value) {
		this.notifyUrl = value;
	}
	/**获取商户网站唯一订单号 支付宝合作商户网站唯一订单号。 */
	

	
	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	/**设置商户网站唯一订单号 支付宝合作商户网站唯一订单号。 */

	public void setOutTradeNo(String value) {
		this.outTradeNo = value;
	}
	/**获取商品名称 商品的标题/交易标题/订单标题/订单关键字等。该参数最长为128个汉字。 */
	

	
	public String getSubject() {
		return this.subject;
	}
	/**设置商品名称 商品的标题/交易标题/订单标题/订单关键字等。该参数最长为128个汉字。 */

	public void setSubject(String value) {
		this.subject = value;
	}
	/**获取支付类型 支付类型。默认值为：1（商品购买）。 */
	

	
	public String getPaymentType() {
		return this.paymentType;
	}
	/**设置支付类型 支付类型。默认值为：1（商品购买）。 */

	public void setPaymentType(String value) {
		this.paymentType = value;
	}
	/**获取卖家支付宝账号 卖家支付宝账号（邮箱或手机号码格式）或其对应的支付宝唯一用户号（以2088开头的纯16位数字）。 */
	

	
	public String getSellerId() {
		return this.sellerId;
	}
	/**设置卖家支付宝账号 卖家支付宝账号（邮箱或手机号码格式）或其对应的支付宝唯一用户号（以2088开头的纯16位数字）。 */

	public void setSellerId(String value) {
		this.sellerId = value;
	}
	/**获取总金额 该笔订单的资金总额，单位为RMB-Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。 */
	

	
	public Double getTotalFee() {
		return this.totalFee;
	}
	/**设置总金额 该笔订单的资金总额，单位为RMB-Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。 */

	public void setTotalFee(Double value) {
		this.totalFee = value;
	}
	/**获取商品详情 对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。 */
	

	
	public String getBody() {
		return this.body;
	}
	/**设置商品详情 对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。 */

	public void setBody(String value) {
		this.body = value;
	}
	/**
	 * 转文本
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.SHORT_PREFIX_STYLE)
			.append(super.toString())
			.append(",Service:",getService())
			.append(",Partner:",getPartner())
			.append(",InputCharset:",getInputCharset())
			.append(",SignType:",getSignType())
			.append(",Sign:",getSign())
			.append(",NotifyUrl:",getNotifyUrl())
			.append(",OutTradeNo:",getOutTradeNo())
			.append(",Subject:",getSubject())
			.append(",PaymentType:",getPaymentType())
			.append(",SellerId:",getSellerId())
			.append(",TotalFee:",getTotalFee())
			.append(",Body:",getBody())
			.toString();

	}
	/**
	 * 返回JSON之不显示第0级，对于一些不能传递的对象，不进行json编码，比如password明文，用得较少。
	 * @return
	 */
	public String toJsonNotshow(){
		String[] excludesProperties={"null"};
		String ret=JsonUtilAli.toJSONString(this, null, excludesProperties);
		return ret;
	}
	/**
	 * 返回JSON之不显示第1级，nowshow+notshow1('notshow1'+xxxObj+xxxString+xxxList)
	 * <br>在内部服务通讯时，防止get页面参数过大，通常设置为notshow1，返回时可以是notshow或notshow1
	 * @return
	 */
	public String toJsonNotshow1(){
		String[] excludesProperties={"null"};
		String ret=JsonUtilAli.toJSONString(this, null, excludesProperties);
		return ret;
	}
	/**
	 * 返回JSON之不显示第2级，nowshow+notshow1+notshow2，用于外部服务通讯，符合对方的api要求
	 * @return
	 */
	public String toJsonNotshow2(){
		String[] excludesProperties={"null"};
		String ret=JsonUtilAli.toJSONString(this, null, excludesProperties);
		return ret;
	}

/*
//精简构造 支付宝app支付参数
ApAppapiPaymentParam apAppapiPaymentParam = new ApAppapiPaymentParam(
	service , //String 接口名称  接口名称，固定值。 
	partner , //String 合作者身份ID  签约的支付宝账号对应的支付宝唯一用户号。以2088开头的16位纯数字组成。 
	inputCharset , //String 参数编码字符集 default=utf-8 商户网站使用的编码格式，固定为utf-8。 
	signType , //String 签名方式 default=RSA 签名类型，目前仅支持RSA。 
	sign , //String 签名   
	notifyUrl , //String 服务器异步通知页面路径  支付宝服务器主动通知商户网站里指定的页面http路径。 
	outTradeNo , //String 商户网站唯一订单号  支付宝合作商户网站唯一订单号。 
	subject , //String 商品名称  商品的标题/交易标题/订单标题/订单关键字等。该参数最长为128个汉字。 
	paymentType , //String 支付类型 default=1 支付类型。默认值为：1（商品购买）。 
	sellerId , //String 卖家支付宝账号  卖家支付宝账号（邮箱或手机号码格式）或其对应的支付宝唯一用户号（以2088开头的纯16位数字）。 
	totalFee , //Double 总金额 default=0.0 该笔订单的资金总额，单位为RMB-Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。 
	body , //String 商品详情  对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。 
	null
);
*/
}

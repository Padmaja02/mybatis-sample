package com.generated.mybatis.model;

public class OrderHasProductKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ORDER_HAS_PRODUCT.order_id
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	private Long orderId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ORDER_HAS_PRODUCT.product_id
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	private Long productId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ORDER_HAS_PRODUCT.order_id
	 * @return  the value of ORDER_HAS_PRODUCT.order_id
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public Long getOrderId() {
		return orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ORDER_HAS_PRODUCT.order_id
	 * @param orderId  the value for ORDER_HAS_PRODUCT.order_id
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ORDER_HAS_PRODUCT.product_id
	 * @return  the value of ORDER_HAS_PRODUCT.product_id
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ORDER_HAS_PRODUCT.product_id
	 * @param productId  the value for ORDER_HAS_PRODUCT.product_id
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}
}
/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductBillToReevaluateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ProductBillToReevaluateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductBillToReevaluateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductObjectBaseKeyData ProductReIn;
  protected Integer billing_account_internal_id;
  protected Integer open_item_id;
  protected Date effective_date;
  protected Date reevaluation_date;
/**
 *
 * Constructor to create a  ProductBillToReevaluateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductBillToReevaluateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectBaseKeyData ProductReInIn, Integer billing_account_internal_idIn, Integer open_item_idIn, Date effective_dateIn, Date reevaluation_dateIn) {
    super(id, context, "ProductBillToReevaluate");
    ProductReIn = ProductReInIn;
    billing_account_internal_id = billing_account_internal_idIn;
    open_item_id = open_item_idIn;
    effective_date = effective_dateIn;
    reevaluation_date = reevaluation_dateIn;
  }

  public void translateToMap() {
    if (ProductReIn != null) {
      ProductReIn.resetFlags(true, true);
      addInput("Product", ProductObjectBaseKeyHelper.toMap(ProductReIn, new HashMap(), "ProductObjectBaseKeyData").get("ProductObjectBaseKeyData"));
    }
    if (billing_account_internal_id != null) {
      addInput("BillingAccountInternalId", billing_account_internal_id);
    }
    if (open_item_id != null) {
      addInput("OpenItemId", open_item_id);
    }
    if (effective_date != null) {
      addInput("EffectiveDate", effective_date);
    }
    if (reevaluation_date != null) {
      addInput("ReevaluationDate", reevaluation_date);
    }
  }


/**
 *
 * Sets the Product
 * @param ProductReInIn Value of the ProductReIn
 *
 */

  public void setProduct(ProductObjectBaseKeyData ProductReInIn) {
    ProductReIn = ProductReInIn;
  }

/**
 *
 * Sets the BillingAccountInternalId
 * @param billing_account_internal_idIn Value of the billing_account_internal_id
 *
 */

  public void setBillingAccountInternalId(Integer billing_account_internal_idIn) {
    billing_account_internal_id = billing_account_internal_idIn;
  }

/**
 *
 * Sets the OpenItemId
 * @param open_item_idIn Value of the open_item_id
 *
 */

  public void setOpenItemId(Integer open_item_idIn) {
    open_item_id = open_item_idIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param effective_dateIn Value of the effective_date
 *
 */

  public void setEffectiveDate(Date effective_dateIn) {
    effective_date = effective_dateIn;
  }

/**
 *
 * Sets the ReevaluationDate
 * @param reevaluation_dateIn Value of the reevaluation_date
 *
 */

  public void setReevaluationDate(Date reevaluation_dateIn) {
    reevaluation_date = reevaluation_dateIn;
  }

  public void translateFromMap() {
    ProductReIn = ProductObjectBaseKeyHelper.fromMap(inputMap, "Product");
    billing_account_internal_id = (Integer)inputMap.get("BillingAccountInternalId");
    open_item_id = (Integer)inputMap.get("OpenItemId");
    effective_date = (Date)inputMap.get("EffectiveDate");
    reevaluation_date = (Date)inputMap.get("ReevaluationDate");
  }

/**
 *
 * Gets the Product
 * @return Value of the Product
 *
 */

  public ProductObjectBaseKeyData getProduct( ) {
    return ProductReIn;
  }

/**
 *
 * Gets the BillingAccountInternalId
 * @return Value of the BillingAccountInternalId
 *
 */

  public Integer getBillingAccountInternalId( ) {
    return billing_account_internal_id;
  }

/**
 *
 * Gets the OpenItemId
 * @return Value of the OpenItemId
 *
 */

  public Integer getOpenItemId( ) {
    return open_item_id;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return effective_date;
  }

/**
 *
 * Gets the ReevaluationDate
 * @return Value of the ReevaluationDate
 *
 */

  public Date getReevaluationDate( ) {
    return reevaluation_date;
  }

}

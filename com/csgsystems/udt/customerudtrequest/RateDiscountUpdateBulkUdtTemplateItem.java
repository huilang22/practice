/*
 * Generated code DO NOT EDIT
 * Generated file: RateDiscountUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a RateDiscountUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateDiscountUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateDiscountObjectData rdUpdateIn;
  protected RateDiscountObjectFilter rdUpdateFilter;
  protected RateDiscountObjectData rdUpdateGet;
/**
 *
 * Constructor to create a  RateDiscountUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateDiscountUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateDiscountObjectData rdUpdateInIn, RateDiscountObjectFilter rdUpdateFilterIn, RateDiscountObjectData rdUpdateGetIn) {
    super(id, context, "RateDiscountUpdate");
    rdUpdateIn = rdUpdateInIn;
    rdUpdateFilter = rdUpdateFilterIn;
    rdUpdateGet = rdUpdateGetIn;
  }

  public void translateToMap() {
    if (rdUpdateIn != null) {
      rdUpdateIn.resetFlags(true, true);
      addInput("RateDiscount", RateDiscountObjectHelper.toMap(rdUpdateIn, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
    if (rdUpdateFilter != null) {
      Integer index =  rdUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RdUpdateFilter", RateDiscountObjectHelper.toMap(rdUpdateFilter, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
    if (rdUpdateGet != null) {
      rdUpdateGet.resetFlags(true, true);
      addInput("RdUpdateGet", RateDiscountObjectHelper.toMap(rdUpdateGet, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
  }


/**
 *
 * Sets the RateDiscount
 * @param rdUpdateInIn Value of the rdUpdateIn
 *
 */

  public void setRateDiscount(RateDiscountObjectData rdUpdateInIn) {
    rdUpdateIn = rdUpdateInIn;
  }

/**
 *
 * Sets the RdUpdateFilter
 * @param rdUpdateFilterIn Value of the rdUpdateFilter
 *
 */

  public void setRdUpdateFilter(RateDiscountObjectFilter rdUpdateFilterIn) {
    rdUpdateFilter = rdUpdateFilterIn;
  }

/**
 *
 * Sets the RdUpdateGet
 * @param rdUpdateGetIn Value of the rdUpdateGet
 *
 */

  public void setRdUpdateGet(RateDiscountObjectData rdUpdateGetIn) {
    rdUpdateGet = rdUpdateGetIn;
  }

  public void translateFromMap() {
    rdUpdateIn = RateDiscountObjectHelper.fromMap(inputMap, "RateDiscount");
    rdUpdateFilter = RateDiscountObjectHelper.fromMapFilter(inputMap, "RdUpdateFilter");
    rdUpdateGet = RateDiscountObjectHelper.fromMap(inputMap, "RdUpdateGet");
  }

/**
 *
 * Gets the RateDiscount
 * @return Value of the RateDiscount
 *
 */

  public RateDiscountObjectData getRateDiscount( ) {
    return rdUpdateIn;
  }

/**
 *
 * Gets the RdUpdateFilter
 * @return Value of the RdUpdateFilter
 *
 */

  public RateDiscountObjectFilter getRdUpdateFilter( ) {
    return rdUpdateFilter;
  }

/**
 *
 * Gets the RdUpdateGet
 * @return Value of the RdUpdateGet
 *
 */

  public RateDiscountObjectData getRdUpdateGet( ) {
    return rdUpdateGet;
  }

}

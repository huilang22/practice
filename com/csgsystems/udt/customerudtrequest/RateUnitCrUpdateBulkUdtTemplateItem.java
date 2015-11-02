/*
 * Generated code DO NOT EDIT
 * Generated file: RateUnitCrUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RateUnitCrUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUnitCrUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUnitCrObjectData RateUnitCrUpdateIn;
  protected RateUnitCrObjectFilter RateUnitCrUpdateFilter;
  protected RateUnitCrObjectData RateUnitCrUpdateGet;
/**
 *
 * Constructor to create a  RateUnitCrUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUnitCrUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUnitCrObjectData RateUnitCrUpdateInIn, RateUnitCrObjectFilter RateUnitCrUpdateFilterIn, RateUnitCrObjectData RateUnitCrUpdateGetIn) {
    super(id, context, "RateUnitCrUpdate");
    RateUnitCrUpdateIn = RateUnitCrUpdateInIn;
    RateUnitCrUpdateFilter = RateUnitCrUpdateFilterIn;
    RateUnitCrUpdateGet = RateUnitCrUpdateGetIn;
  }

  public void translateToMap() {
    if (RateUnitCrUpdateIn != null) {
      RateUnitCrUpdateIn.resetFlags(true, true);
      addInput("RateUnitCr", RateUnitCrObjectHelper.toMap(RateUnitCrUpdateIn, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
    if (RateUnitCrUpdateFilter != null) {
      Integer index =  RateUnitCrUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateUnitCrUpdateFilter", RateUnitCrObjectHelper.toMap(RateUnitCrUpdateFilter, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
    if (RateUnitCrUpdateGet != null) {
      RateUnitCrUpdateGet.resetFlags(true, true);
      addInput("RateUnitCrUpdateGet", RateUnitCrObjectHelper.toMap(RateUnitCrUpdateGet, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
  }


/**
 *
 * Sets the RateUnitCr
 * @param RateUnitCrUpdateInIn Value of the RateUnitCrUpdateIn
 *
 */

  public void setRateUnitCr(RateUnitCrObjectData RateUnitCrUpdateInIn) {
    RateUnitCrUpdateIn = RateUnitCrUpdateInIn;
  }

/**
 *
 * Sets the RateUnitCrUpdateFilter
 * @param RateUnitCrUpdateFilterIn Value of the RateUnitCrUpdateFilter
 *
 */

  public void setRateUnitCrUpdateFilter(RateUnitCrObjectFilter RateUnitCrUpdateFilterIn) {
    RateUnitCrUpdateFilter = RateUnitCrUpdateFilterIn;
  }

/**
 *
 * Sets the RateUnitCrUpdateGet
 * @param RateUnitCrUpdateGetIn Value of the RateUnitCrUpdateGet
 *
 */

  public void setRateUnitCrUpdateGet(RateUnitCrObjectData RateUnitCrUpdateGetIn) {
    RateUnitCrUpdateGet = RateUnitCrUpdateGetIn;
  }

  public void translateFromMap() {
    RateUnitCrUpdateIn = RateUnitCrObjectHelper.fromMap(inputMap, "RateUnitCr");
    RateUnitCrUpdateFilter = RateUnitCrObjectHelper.fromMapFilter(inputMap, "RateUnitCrUpdateFilter");
    RateUnitCrUpdateGet = RateUnitCrObjectHelper.fromMap(inputMap, "RateUnitCrUpdateGet");
  }

/**
 *
 * Gets the RateUnitCr
 * @return Value of the RateUnitCr
 *
 */

  public RateUnitCrObjectData getRateUnitCr( ) {
    return RateUnitCrUpdateIn;
  }

/**
 *
 * Gets the RateUnitCrUpdateFilter
 * @return Value of the RateUnitCrUpdateFilter
 *
 */

  public RateUnitCrObjectFilter getRateUnitCrUpdateFilter( ) {
    return RateUnitCrUpdateFilter;
  }

/**
 *
 * Gets the RateUnitCrUpdateGet
 * @return Value of the RateUnitCrUpdateGet
 *
 */

  public RateUnitCrObjectData getRateUnitCrUpdateGet( ) {
    return RateUnitCrUpdateGet;
  }

}

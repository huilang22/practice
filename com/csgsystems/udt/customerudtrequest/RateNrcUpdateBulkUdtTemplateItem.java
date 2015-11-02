/*
 * Generated code DO NOT EDIT
 * Generated file: RateNrcUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RateNrcUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateNrcUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateNrcObjectData rnrcUpdateIn;
  protected RateNrcObjectFilter rnrcUpdateFilter;
  protected RateNrcObjectData rnrcUpdateGet;
/**
 *
 * Constructor to create a  RateNrcUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateNrcUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateNrcObjectData rnrcUpdateInIn, RateNrcObjectFilter rnrcUpdateFilterIn, RateNrcObjectData rnrcUpdateGetIn) {
    super(id, context, "RateNrcUpdate");
    rnrcUpdateIn = rnrcUpdateInIn;
    rnrcUpdateFilter = rnrcUpdateFilterIn;
    rnrcUpdateGet = rnrcUpdateGetIn;
  }

  public void translateToMap() {
    if (rnrcUpdateIn != null) {
      rnrcUpdateIn.resetFlags(true, true);
      addInput("RateNrc", RateNrcObjectHelper.toMap(rnrcUpdateIn, new HashMap(), "RateNrc").get("RateNrc"));
    }
    if (rnrcUpdateFilter != null) {
      Integer index =  rnrcUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RnrcUpdateFilter", RateNrcObjectHelper.toMap(rnrcUpdateFilter, new HashMap(), "RateNrc").get("RateNrc"));
    }
    if (rnrcUpdateGet != null) {
      rnrcUpdateGet.resetFlags(true, true);
      addInput("RnrcUpdateGet", RateNrcObjectHelper.toMap(rnrcUpdateGet, new HashMap(), "RateNrc").get("RateNrc"));
    }
  }


/**
 *
 * Sets the RateNrc
 * @param rnrcUpdateInIn Value of the rnrcUpdateIn
 *
 */

  public void setRateNrc(RateNrcObjectData rnrcUpdateInIn) {
    rnrcUpdateIn = rnrcUpdateInIn;
  }

/**
 *
 * Sets the RnrcUpdateFilter
 * @param rnrcUpdateFilterIn Value of the rnrcUpdateFilter
 *
 */

  public void setRnrcUpdateFilter(RateNrcObjectFilter rnrcUpdateFilterIn) {
    rnrcUpdateFilter = rnrcUpdateFilterIn;
  }

/**
 *
 * Sets the RnrcUpdateGet
 * @param rnrcUpdateGetIn Value of the rnrcUpdateGet
 *
 */

  public void setRnrcUpdateGet(RateNrcObjectData rnrcUpdateGetIn) {
    rnrcUpdateGet = rnrcUpdateGetIn;
  }

  public void translateFromMap() {
    rnrcUpdateIn = RateNrcObjectHelper.fromMap(inputMap, "RateNrc");
    rnrcUpdateFilter = RateNrcObjectHelper.fromMapFilter(inputMap, "RnrcUpdateFilter");
    rnrcUpdateGet = RateNrcObjectHelper.fromMap(inputMap, "RnrcUpdateGet");
  }

/**
 *
 * Gets the RateNrc
 * @return Value of the RateNrc
 *
 */

  public RateNrcObjectData getRateNrc( ) {
    return rnrcUpdateIn;
  }

/**
 *
 * Gets the RnrcUpdateFilter
 * @return Value of the RnrcUpdateFilter
 *
 */

  public RateNrcObjectFilter getRnrcUpdateFilter( ) {
    return rnrcUpdateFilter;
  }

/**
 *
 * Gets the RnrcUpdateGet
 * @return Value of the RnrcUpdateGet
 *
 */

  public RateNrcObjectData getRnrcUpdateGet( ) {
    return rnrcUpdateGet;
  }

}

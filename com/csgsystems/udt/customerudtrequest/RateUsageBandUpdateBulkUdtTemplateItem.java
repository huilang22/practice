/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageBandUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RateUsageBandUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUsageBandUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUsageBandObjectData RUUpdateIn;
  protected RateUsageBandObjectFilter RUUpdateFilter;
  protected RateUsageBandObjectData RUUpdateGet;
/**
 *
 * Constructor to create a  RateUsageBandUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUsageBandUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageBandObjectData RUUpdateInIn, RateUsageBandObjectFilter RUUpdateFilterIn, RateUsageBandObjectData RUUpdateGetIn) {
    super(id, context, "RateUsageBandUpdate");
    RUUpdateIn = RUUpdateInIn;
    RUUpdateFilter = RUUpdateFilterIn;
    RUUpdateGet = RUUpdateGetIn;
  }

  public void translateToMap() {
    if (RUUpdateIn != null) {
      RUUpdateIn.resetFlags(true, true);
      addInput("RateUsageBand", RateUsageBandObjectHelper.toMap(RUUpdateIn, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
    if (RUUpdateFilter != null) {
      Integer index =  RUUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RUUpdateFilter", RateUsageBandObjectHelper.toMap(RUUpdateFilter, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
    if (RUUpdateGet != null) {
      RUUpdateGet.resetFlags(true, true);
      addInput("RUUpdateGet", RateUsageBandObjectHelper.toMap(RUUpdateGet, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
  }


/**
 *
 * Sets the RateUsageBand
 * @param RUUpdateInIn Value of the RUUpdateIn
 *
 */

  public void setRateUsageBand(RateUsageBandObjectData RUUpdateInIn) {
    RUUpdateIn = RUUpdateInIn;
  }

/**
 *
 * Sets the RUUpdateFilter
 * @param RUUpdateFilterIn Value of the RUUpdateFilter
 *
 */

  public void setRUUpdateFilter(RateUsageBandObjectFilter RUUpdateFilterIn) {
    RUUpdateFilter = RUUpdateFilterIn;
  }

/**
 *
 * Sets the RUUpdateGet
 * @param RUUpdateGetIn Value of the RUUpdateGet
 *
 */

  public void setRUUpdateGet(RateUsageBandObjectData RUUpdateGetIn) {
    RUUpdateGet = RUUpdateGetIn;
  }

  public void translateFromMap() {
    RUUpdateIn = RateUsageBandObjectHelper.fromMap(inputMap, "RateUsageBand");
    RUUpdateFilter = RateUsageBandObjectHelper.fromMapFilter(inputMap, "RUUpdateFilter");
    RUUpdateGet = RateUsageBandObjectHelper.fromMap(inputMap, "RUUpdateGet");
  }

/**
 *
 * Gets the RateUsageBand
 * @return Value of the RateUsageBand
 *
 */

  public RateUsageBandObjectData getRateUsageBand( ) {
    return RUUpdateIn;
  }

/**
 *
 * Gets the RUUpdateFilter
 * @return Value of the RUUpdateFilter
 *
 */

  public RateUsageBandObjectFilter getRUUpdateFilter( ) {
    return RUUpdateFilter;
  }

/**
 *
 * Gets the RUUpdateGet
 * @return Value of the RUUpdateGet
 *
 */

  public RateUsageBandObjectData getRUUpdateGet( ) {
    return RUUpdateGet;
  }

}

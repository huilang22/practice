/*
 * Generated code DO NOT EDIT
 * Generated file: RateCorridorUsageBandUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RateCorridorUsageBandUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCorridorUsageBandUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUBOverrideObjectData RUBOUpdateIn;
  protected RUBOverrideObjectFilter RUBOUpdateFilter;
  protected RUBOverrideObjectData RUBOUpdateGet;
/**
 *
 * Constructor to create a  RateCorridorUsageBandUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCorridorUsageBandUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RUBOverrideObjectData RUBOUpdateInIn, RUBOverrideObjectFilter RUBOUpdateFilterIn, RUBOverrideObjectData RUBOUpdateGetIn) {
    super(id, context, "RateCorridorUsageBandUpdate");
    RUBOUpdateIn = RUBOUpdateInIn;
    RUBOUpdateFilter = RUBOUpdateFilterIn;
    RUBOUpdateGet = RUBOUpdateGetIn;
  }

  public void translateToMap() {
    if (RUBOUpdateIn != null) {
      RUBOUpdateIn.resetFlags(true, true);
      addInput("RateCorridorUsageBand", RUBOverrideObjectHelper.toMap(RUBOUpdateIn, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
    if (RUBOUpdateFilter != null) {
      Integer index =  RUBOUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RUBOUpdateFilter", RUBOverrideObjectHelper.toMap(RUBOUpdateFilter, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
    if (RUBOUpdateGet != null) {
      RUBOUpdateGet.resetFlags(true, true);
      addInput("RUBOUpdateGet", RUBOverrideObjectHelper.toMap(RUBOUpdateGet, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
  }


/**
 *
 * Sets the RateCorridorUsageBand
 * @param RUBOUpdateInIn Value of the RUBOUpdateIn
 *
 */

  public void setRateCorridorUsageBand(RUBOverrideObjectData RUBOUpdateInIn) {
    RUBOUpdateIn = RUBOUpdateInIn;
  }

/**
 *
 * Sets the RUBOUpdateFilter
 * @param RUBOUpdateFilterIn Value of the RUBOUpdateFilter
 *
 */

  public void setRUBOUpdateFilter(RUBOverrideObjectFilter RUBOUpdateFilterIn) {
    RUBOUpdateFilter = RUBOUpdateFilterIn;
  }

/**
 *
 * Sets the RUBOUpdateGet
 * @param RUBOUpdateGetIn Value of the RUBOUpdateGet
 *
 */

  public void setRUBOUpdateGet(RUBOverrideObjectData RUBOUpdateGetIn) {
    RUBOUpdateGet = RUBOUpdateGetIn;
  }

  public void translateFromMap() {
    RUBOUpdateIn = RUBOverrideObjectHelper.fromMap(inputMap, "RateCorridorUsageBand");
    RUBOUpdateFilter = RUBOverrideObjectHelper.fromMapFilter(inputMap, "RUBOUpdateFilter");
    RUBOUpdateGet = RUBOverrideObjectHelper.fromMap(inputMap, "RUBOUpdateGet");
  }

/**
 *
 * Gets the RateCorridorUsageBand
 * @return Value of the RateCorridorUsageBand
 *
 */

  public RUBOverrideObjectData getRateCorridorUsageBand( ) {
    return RUBOUpdateIn;
  }

/**
 *
 * Gets the RUBOUpdateFilter
 * @return Value of the RUBOUpdateFilter
 *
 */

  public RUBOverrideObjectFilter getRUBOUpdateFilter( ) {
    return RUBOUpdateFilter;
  }

/**
 *
 * Gets the RUBOUpdateGet
 * @return Value of the RUBOUpdateGet
 *
 */

  public RUBOverrideObjectData getRUBOUpdateGet( ) {
    return RUBOUpdateGet;
  }

}

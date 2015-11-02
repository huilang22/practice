/*
 * Generated code DO NOT EDIT
 * Generated file: RateCorridorUsageDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RateCorridorUsageDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCorridorUsageDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RCUsageObjectKeyData RUDeleteIn;
/**
 *
 * Constructor to create a  RateCorridorUsageDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCorridorUsageDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RCUsageObjectKeyData RUDeleteInIn) {
    super(id, context, "RateCorridorUsageDelete");
    RUDeleteIn = RUDeleteInIn;
  }

  public void translateToMap() {
    if (RUDeleteIn != null) {
      RUDeleteIn.resetFlags(true, true);
      addInput("RateCorridorUsage", RCUsageObjectKeyHelper.toMap(RUDeleteIn, new HashMap(), "RCUsageObjectKeyData").get("RCUsageObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateCorridorUsage
 * @param RUDeleteInIn Value of the RUDeleteIn
 *
 */

  public void setRateCorridorUsage(RCUsageObjectKeyData RUDeleteInIn) {
    RUDeleteIn = RUDeleteInIn;
  }

  public void translateFromMap() {
    RUDeleteIn = RCUsageObjectKeyHelper.fromMap(inputMap, "RateCorridorUsage");
  }

/**
 *
 * Gets the RateCorridorUsage
 * @return Value of the RateCorridorUsage
 *
 */

  public RCUsageObjectKeyData getRateCorridorUsage( ) {
    return RUDeleteIn;
  }

}

/*
 * Generated code DO NOT EDIT
 * Generated file: RateCorridorUsageGetBulkUdtTemplateItem.java
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
 * Class used to create a RateCorridorUsageGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCorridorUsageGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RCUsageObjectKeyData RUGetIn;
/**
 *
 * Constructor to create a  RateCorridorUsageGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCorridorUsageGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RCUsageObjectKeyData RUGetInIn) {
    super(id, context, "RateCorridorUsageGet");
    RUGetIn = RUGetInIn;
  }

  public void translateToMap() {
    if (RUGetIn != null) {
      RUGetIn.resetFlags(true, true);
      addInput("RateCorridorUsage", RCUsageObjectKeyHelper.toMap(RUGetIn, new HashMap(), "RCUsageObjectKeyData").get("RCUsageObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateCorridorUsage
 * @param RUGetInIn Value of the RUGetIn
 *
 */

  public void setRateCorridorUsage(RCUsageObjectKeyData RUGetInIn) {
    RUGetIn = RUGetInIn;
  }

  public void translateFromMap() {
    RUGetIn = RCUsageObjectKeyHelper.fromMap(inputMap, "RateCorridorUsage");
  }

/**
 *
 * Gets the RateCorridorUsage
 * @return Value of the RateCorridorUsage
 *
 */

  public RCUsageObjectKeyData getRateCorridorUsage( ) {
    return RUGetIn;
  }

}

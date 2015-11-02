/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitKeyUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a UnitCrRateLimitKeyUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitCrRateLimitKeyUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitCrRateLimitKeysObjectData noOpIn;

/**
 *
 * Constructor to create a   UnitCrRateLimitKeyUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitCrRateLimitKeyUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRateLimitKeysObjectData noOpInIn) {
    super(id, context, "UnitCrRateLimitKeyUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectHelper.toMap(noOpIn, new HashMap(), "UnitCrRateLimitKey").get("UnitCrRateLimitKey"));
    }
  }
/**
 *
 * Sets the  UnitCrRateLimitKey
 * @param noOpInIn UnitCrRateLimitKeysObjectData to set
 *
 */
  public void setUnitCrRateLimitKey(UnitCrRateLimitKeysObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnitCrRateLimitKey passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrRateLimitKeysObjectData getUnitCrRateLimitKey() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnitCrRateLimitKeysObjectHelper.fromMap(inputMap, "UnitCrRateLimitKey");
  }
}

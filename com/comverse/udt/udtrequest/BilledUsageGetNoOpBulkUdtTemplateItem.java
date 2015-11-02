/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a BilledUsageGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BilledUsageGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BilledUsageObjectData noOpIn;

/**
 *
 * Constructor to create a   BilledUsageGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BilledUsageGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageObjectData noOpInIn) {
    super(id, context, "BilledUsageGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(noOpIn, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
/**
 *
 * Sets the  BilledUsage
 * @param noOpInIn BilledUsageObjectData to set
 *
 */
  public void setBilledUsage(BilledUsageObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BilledUsage passed into the constructor
 * @return Simulated response
 *
 */
  public BilledUsageObjectData getBilledUsage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BilledUsageObjectHelper.fromMap(inputMap, "BilledUsage");
  }
}

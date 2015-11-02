/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsagePointUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsagePointUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsgPntObjectData noOpIn;

/**
 *
 * Constructor to create a   UsagePointUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsagePointUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsgPntObjectData noOpInIn) {
    super(id, context, "UsagePointUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UsagePoint", UsgPntObjectHelper.toMap(noOpIn, new HashMap(), "UsagePoint").get("UsagePoint"));
    }
  }
/**
 *
 * Sets the  UsagePoint
 * @param noOpInIn UsgPntObjectData to set
 *
 */
  public void setUsagePoint(UsgPntObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsagePoint passed into the constructor
 * @return Simulated response
 *
 */
  public UsgPntObjectData getUsagePoint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsgPntObjectHelper.fromMap(inputMap, "UsagePoint");
  }
}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageGroupGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageGroupGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageGroupGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   UsageGroupGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageGroupGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageGroupObjectData noOpInIn) {
    super(id, context, "UsageGroupGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UsageGroup", UsageGroupObjectHelper.toMap(noOpIn, new HashMap(), "UsageGroup").get("UsageGroup"));
    }
  }
/**
 *
 * Sets the  UsageGroup
 * @param noOpInIn UsageGroupObjectData to set
 *
 */
  public void setUsageGroup(UsageGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageGroup passed into the constructor
 * @return Simulated response
 *
 */
  public UsageGroupObjectData getUsageGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageGroupObjectHelper.fromMap(inputMap, "UsageGroup");
  }
}

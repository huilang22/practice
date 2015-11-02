/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeGroupUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageTypeGroupUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageTypeGroupUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageTypeGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   UsageTypeGroupUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageTypeGroupUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeGroupObjectData noOpInIn) {
    super(id, context, "UsageTypeGroupUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UsageTypeGroup", UsageTypeGroupObjectHelper.toMap(noOpIn, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
  }
/**
 *
 * Sets the  UsageTypeGroup
 * @param noOpInIn UsageTypeGroupObjectData to set
 *
 */
  public void setUsageTypeGroup(UsageTypeGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageTypeGroup passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeGroupObjectData getUsageTypeGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageTypeGroupObjectHelper.fromMap(inputMap, "UsageTypeGroup");
  }
}

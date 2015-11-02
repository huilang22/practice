/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupUsageRedirectGroupGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqGroupUsageRedirectGroupGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupUsageRedirectGroupGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupUsageRedirectGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   HqGroupUsageRedirectGroupGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupUsageRedirectGroupGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectGroupObjectData noOpInIn) {
    super(id, context, "HqGroupUsageRedirectGroupGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectHelper.toMap(noOpIn, new HashMap(), "HqGroupUsageRedirectGroup").get("HqGroupUsageRedirectGroup"));
    }
  }
/**
 *
 * Sets the  HqGroupUsageRedirectGroup
 * @param noOpInIn HqGroupUsageRedirectGroupObjectData to set
 *
 */
  public void setHqGroupUsageRedirectGroup(HqGroupUsageRedirectGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroupUsageRedirectGroup passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupUsageRedirectGroupObjectData getHqGroupUsageRedirectGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupUsageRedirectGroupObjectHelper.fromMap(inputMap, "HqGroupUsageRedirectGroup");
  }
}

/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupUsageRedirectGroupDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqGroupUsageRedirectGroupDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupUsageRedirectGroupDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupUsageRedirectGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   HqGroupUsageRedirectGroupDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupUsageRedirectGroupDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectGroupObjectData noOpInIn) {
    super(id, context, "HqGroupUsageRedirectGroupDelete");
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

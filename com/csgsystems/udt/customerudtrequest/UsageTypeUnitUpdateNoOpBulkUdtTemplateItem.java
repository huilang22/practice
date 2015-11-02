/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeUnitUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageTypeUnitUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageTypeUnitUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageTypeUnitObjectData noOpIn;

/**
 *
 * Constructor to create a   UsageTypeUnitUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageTypeUnitUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeUnitObjectData noOpInIn) {
    super(id, context, "UsageTypeUnitUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UsageTypeUnit", UsageTypeUnitObjectHelper.toMap(noOpIn, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
  }
/**
 *
 * Sets the  UsageTypeUnit
 * @param noOpInIn UsageTypeUnitObjectData to set
 *
 */
  public void setUsageTypeUnit(UsageTypeUnitObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageTypeUnit passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeUnitObjectData getUsageTypeUnit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageTypeUnitObjectHelper.fromMap(inputMap, "UsageTypeUnit");
  }
}

/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeSplitCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageTypeSplitCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageTypeSplitCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageTypeSplitObjectData noOpIn;

/**
 *
 * Constructor to create a   UsageTypeSplitCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageTypeSplitCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeSplitObjectData noOpInIn) {
    super(id, context, "UsageTypeSplitCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UsageTypeSplit", UsageTypeSplitObjectHelper.toMap(noOpIn, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
  }
/**
 *
 * Sets the  UsageTypeSplit
 * @param noOpInIn UsageTypeSplitObjectData to set
 *
 */
  public void setUsageTypeSplit(UsageTypeSplitObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageTypeSplit passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeSplitObjectData getUsageTypeSplit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageTypeSplitObjectHelper.fromMap(inputMap, "UsageTypeSplit");
  }
}

/*
 * Generated code DO NOT EDIT
 * Generated file: UsagePointTextUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsagePointTextUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsagePointTextUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsagePointTextObjectData noOpIn;

/**
 *
 * Constructor to create a   UsagePointTextUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsagePointTextUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsagePointTextObjectData noOpInIn) {
    super(id, context, "UsagePointTextUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UsagePointText", UsagePointTextObjectHelper.toMap(noOpIn, new HashMap(), "UsagePointText").get("UsagePointText"));
    }
  }
/**
 *
 * Sets the  UsagePointText
 * @param noOpInIn UsagePointTextObjectData to set
 *
 */
  public void setUsagePointText(UsagePointTextObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsagePointText passed into the constructor
 * @return Simulated response
 *
 */
  public UsagePointTextObjectData getUsagePointText() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsagePointTextObjectHelper.fromMap(inputMap, "UsagePointText");
  }
}

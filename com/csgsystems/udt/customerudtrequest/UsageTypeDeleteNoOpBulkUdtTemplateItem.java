/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageTypeDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageTypeDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   UsageTypeDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageTypeDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeObjectData noOpInIn) {
    super(id, context, "UsageTypeDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UsageType", UsageTypeObjectHelper.toMap(noOpIn, new HashMap(), "UsageType").get("UsageType"));
    }
  }
/**
 *
 * Sets the  UsageType
 * @param noOpInIn UsageTypeObjectData to set
 *
 */
  public void setUsageType(UsageTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageType passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeObjectData getUsageType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageTypeObjectHelper.fromMap(inputMap, "UsageType");
  }
}

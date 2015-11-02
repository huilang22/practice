/*
 * Generated code DO NOT EDIT
 * Generated file: RbrUsageTypeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrUsageTypeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrUsageTypeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrUsageTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrUsageTypeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrUsageTypeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrUsageTypeObjectData noOpInIn) {
    super(id, context, "RbrUsageTypeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RbrUsageType", RbrUsageTypeObjectHelper.toMap(noOpIn, new HashMap(), "RbrUsageType").get("RbrUsageType"));
    }
  }
/**
 *
 * Sets the  RbrUsageType
 * @param noOpInIn RbrUsageTypeObjectData to set
 *
 */
  public void setRbrUsageType(RbrUsageTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrUsageType passed into the constructor
 * @return Simulated response
 *
 */
  public RbrUsageTypeObjectData getRbrUsageType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrUsageTypeObjectHelper.fromMap(inputMap, "RbrUsageType");
  }
}

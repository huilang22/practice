/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrUsageTypeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrUsageTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrUsageTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrUsageTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrUsageTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrUsageTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrUsageTypeObjectData noOpInIn) {
    super(id, context, "RbrUsageTypeUpdate");
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

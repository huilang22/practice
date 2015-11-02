/*
 * Generated code DO NOT EDIT
 * Generated file: AccessRegionGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccessRegionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccessRegionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccessRegionObjectData noOpIn;

/**
 *
 * Constructor to create a   AccessRegionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccessRegionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccessRegionObjectData noOpInIn) {
    super(id, context, "AccessRegionGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccessRegion", AccessRegionObjectHelper.toMap(noOpIn, new HashMap(), "AccessRegion").get("AccessRegion"));
    }
  }
/**
 *
 * Sets the  AccessRegion
 * @param noOpInIn AccessRegionObjectData to set
 *
 */
  public void setAccessRegion(AccessRegionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccessRegion passed into the constructor
 * @return Simulated response
 *
 */
  public AccessRegionObjectData getAccessRegion() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccessRegionObjectHelper.fromMap(inputMap, "AccessRegion");
  }
}

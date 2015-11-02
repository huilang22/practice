/*
 * Generated code DO NOT EDIT
 * Generated file: PointRegionGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PointRegionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PointRegionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PointRegionObjectData noOpIn;

/**
 *
 * Constructor to create a   PointRegionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PointRegionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PointRegionObjectData noOpInIn) {
    super(id, context, "PointRegionGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PointRegion", PointRegionObjectHelper.toMap(noOpIn, new HashMap(), "PointRegion").get("PointRegion"));
    }
  }
/**
 *
 * Sets the  PointRegion
 * @param noOpInIn PointRegionObjectData to set
 *
 */
  public void setPointRegion(PointRegionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PointRegion passed into the constructor
 * @return Simulated response
 *
 */
  public PointRegionObjectData getPointRegion() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PointRegionObjectHelper.fromMap(inputMap, "PointRegion");
  }
}

/*
 * Generated code DO NOT EDIT
 * Generated file: DistanceBandCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DistanceBandCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DistanceBandCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DistanceBandObjectData noOpIn;

/**
 *
 * Constructor to create a   DistanceBandCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DistanceBandCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DistanceBandObjectData noOpInIn) {
    super(id, context, "DistanceBandCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DistanceBand", DistanceBandObjectHelper.toMap(noOpIn, new HashMap(), "DistanceBand").get("DistanceBand"));
    }
  }
/**
 *
 * Sets the  DistanceBand
 * @param noOpInIn DistanceBandObjectData to set
 *
 */
  public void setDistanceBand(DistanceBandObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DistanceBand passed into the constructor
 * @return Simulated response
 *
 */
  public DistanceBandObjectData getDistanceBand() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DistanceBandObjectHelper.fromMap(inputMap, "DistanceBand");
  }
}

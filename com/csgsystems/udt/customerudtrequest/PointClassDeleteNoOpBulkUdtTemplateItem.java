/*
 * Generated code DO NOT EDIT
 * Generated file: PointClassDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PointClassDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PointClassDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PointClassObjectData noOpIn;

/**
 *
 * Constructor to create a   PointClassDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PointClassDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PointClassObjectData noOpInIn) {
    super(id, context, "PointClassDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PointClass", PointClassObjectHelper.toMap(noOpIn, new HashMap(), "PointClass").get("PointClass"));
    }
  }
/**
 *
 * Sets the  PointClass
 * @param noOpInIn PointClassObjectData to set
 *
 */
  public void setPointClass(PointClassObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PointClass passed into the constructor
 * @return Simulated response
 *
 */
  public PointClassObjectData getPointClass() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PointClassObjectHelper.fromMap(inputMap, "PointClass");
  }
}

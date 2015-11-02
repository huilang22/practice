/*
 * Generated code DO NOT EDIT
 * Generated file: PointCategoryCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PointCategoryCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PointCategoryCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PointCategoryObjectData noOpIn;

/**
 *
 * Constructor to create a   PointCategoryCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PointCategoryCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PointCategoryObjectData noOpInIn) {
    super(id, context, "PointCategoryCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PointCategory", PointCategoryObjectHelper.toMap(noOpIn, new HashMap(), "PointCategory").get("PointCategory"));
    }
  }
/**
 *
 * Sets the  PointCategory
 * @param noOpInIn PointCategoryObjectData to set
 *
 */
  public void setPointCategory(PointCategoryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PointCategory passed into the constructor
 * @return Simulated response
 *
 */
  public PointCategoryObjectData getPointCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PointCategoryObjectHelper.fromMap(inputMap, "PointCategory");
  }
}

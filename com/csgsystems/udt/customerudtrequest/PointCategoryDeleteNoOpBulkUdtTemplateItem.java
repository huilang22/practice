/*
 * Generated code DO NOT EDIT
 * Generated file: PointCategoryDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PointCategoryDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PointCategoryDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PointCategoryObjectData noOpIn;

/**
 *
 * Constructor to create a   PointCategoryDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PointCategoryDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PointCategoryObjectData noOpInIn) {
    super(id, context, "PointCategoryDelete");
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

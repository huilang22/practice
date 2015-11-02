/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointCategoryGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PointCategoryGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PointCategoryGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PointCategoryObjectData noOpIn;

/**
 *
 * Constructor to create a   PointCategoryGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PointCategoryGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PointCategoryObjectData noOpInIn) {
    super(id, context, "PointCategoryGet");
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

/*
 * Generated code DO NOT EDIT
 * Generated file: PointCategoryDeleteBulkUdtTemplateItem.java
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
 * Class used to create a PointCategoryDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class PointCategoryDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PointCategoryObjectKeyData PCATDeleteIn;
/**
 *
 * Constructor to create a  PointCategoryDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PointCategoryDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, PointCategoryObjectKeyData PCATDeleteInIn) {
    super(id, context, "PointCategoryDelete");
    PCATDeleteIn = PCATDeleteInIn;
  }

  public void translateToMap() {
    if (PCATDeleteIn != null) {
      PCATDeleteIn.resetFlags(true, true);
      addInput("PointCategory", PointCategoryObjectKeyHelper.toMap(PCATDeleteIn, new HashMap(), "PointCategoryObjectKeyData").get("PointCategoryObjectKeyData"));
    }
  }


/**
 *
 * Sets the PointCategory
 * @param PCATDeleteInIn Value of the PCATDeleteIn
 *
 */

  public void setPointCategory(PointCategoryObjectKeyData PCATDeleteInIn) {
    PCATDeleteIn = PCATDeleteInIn;
  }

  public void translateFromMap() {
    PCATDeleteIn = PointCategoryObjectKeyHelper.fromMap(inputMap, "PointCategory");
  }

/**
 *
 * Gets the PointCategory
 * @return Value of the PointCategory
 *
 */

  public PointCategoryObjectKeyData getPointCategory( ) {
    return PCATDeleteIn;
  }

}

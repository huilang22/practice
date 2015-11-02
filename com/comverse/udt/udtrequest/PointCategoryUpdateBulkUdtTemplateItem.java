/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointCategoryUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PointCategoryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PointCategoryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PointCategoryObjectData PCATUpdateIn;
/**
 *
 * Constructor to create a  PointCategoryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PointCategoryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PointCategoryObjectData PCATUpdateInIn) {
    super(id, context, "PointCategoryUpdate");
    PCATUpdateIn = PCATUpdateInIn;
  }

  public void translateToMap() {
    if (PCATUpdateIn != null) {
      PCATUpdateIn.resetFlags(true, true);
      addInput("PointCategory", PointCategoryObjectHelper.toMap(PCATUpdateIn, new HashMap(), "PointCategory").get("PointCategory"));
    }
  }


/**
 *
 * Sets the PointCategory
 * @param PCATUpdateInIn Value of the PCATUpdateIn
 *
 */

  public void setPointCategory(PointCategoryObjectData PCATUpdateInIn) {
    PCATUpdateIn = PCATUpdateInIn;
  }

  public void translateFromMap() {
    PCATUpdateIn = PointCategoryObjectHelper.fromMap(inputMap, "PointCategory");
  }

/**
 *
 * Gets the PointCategory
 * @return Value of the PointCategory
 *
 */

  public PointCategoryObjectData getPointCategory( ) {
    return PCATUpdateIn;
  }

}

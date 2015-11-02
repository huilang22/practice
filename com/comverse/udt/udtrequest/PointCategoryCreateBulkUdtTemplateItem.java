/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointCategoryCreateBulkUdtTemplateItem.java
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
 * Class used to create a PointCategoryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PointCategoryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PointCategoryObjectData PCATCreateIn;
/**
 *
 * Constructor to create a  PointCategoryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PointCategoryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PointCategoryObjectData PCATCreateInIn) {
    super(id, context, "PointCategoryCreate");
    PCATCreateIn = PCATCreateInIn;
  }

  public void translateToMap() {
    if (PCATCreateIn != null) {
      PCATCreateIn.resetFlags(true, true);
      addInput("PointCategory", PointCategoryObjectHelper.toMap(PCATCreateIn, new HashMap(), "PointCategory").get("PointCategory"));
    }
  }


/**
 *
 * Sets the PointCategory
 * @param PCATCreateInIn Value of the PCATCreateIn
 *
 */

  public void setPointCategory(PointCategoryObjectData PCATCreateInIn) {
    PCATCreateIn = PCATCreateInIn;
  }

  public void translateFromMap() {
    PCATCreateIn = PointCategoryObjectHelper.fromMap(inputMap, "PointCategory");
  }

/**
 *
 * Gets the PointCategory
 * @return Value of the PointCategory
 *
 */

  public PointCategoryObjectData getPointCategory( ) {
    return PCATCreateIn;
  }

}

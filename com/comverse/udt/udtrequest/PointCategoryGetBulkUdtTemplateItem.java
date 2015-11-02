/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointCategoryGetBulkUdtTemplateItem.java
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
 * Class used to create a PointCategoryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PointCategoryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PointCategoryObjectKeyData PCATGetIn;
/**
 *
 * Constructor to create a  PointCategoryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PointCategoryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PointCategoryObjectKeyData PCATGetInIn) {
    super(id, context, "PointCategoryGet");
    PCATGetIn = PCATGetInIn;
  }

  public void translateToMap() {
    if (PCATGetIn != null) {
      PCATGetIn.resetFlags(true, true);
      addInput("PointCategory", PointCategoryObjectKeyHelper.toMap(PCATGetIn, new HashMap(), "PointCategoryObjectKeyData").get("PointCategoryObjectKeyData"));
    }
  }


/**
 *
 * Sets the PointCategory
 * @param PCATGetInIn Value of the PCATGetIn
 *
 */

  public void setPointCategory(PointCategoryObjectKeyData PCATGetInIn) {
    PCATGetIn = PCATGetInIn;
  }

  public void translateFromMap() {
    PCATGetIn = PointCategoryObjectKeyHelper.fromMap(inputMap, "PointCategory");
  }

/**
 *
 * Gets the PointCategory
 * @return Value of the PointCategory
 *
 */

  public PointCategoryObjectKeyData getPointCategory( ) {
    return PCATGetIn;
  }

}

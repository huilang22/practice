/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointCategoryFindBulkUdtTemplateItem.java
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
 * Class used to create a PointCategoryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PointCategoryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PointCategoryObjectFilter PCATFindIn;
/**
 *
 * Constructor to create a  PointCategoryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PointCategoryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PointCategoryObjectFilter PCATFindInIn) {
    super(id, context, "PointCategoryFind");
    PCATFindIn = PCATFindInIn;
  }

  public void translateToMap() {
    if (PCATFindIn != null) {
      Integer index =  PCATFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PointCategory", PointCategoryObjectHelper.toMap(PCATFindIn, new HashMap(), "PointCategory").get("PointCategory"));
    }
  }


/**
 *
 * Sets the PointCategory
 * @param PCATFindInIn Value of the PCATFindIn
 *
 */

  public void setPointCategory(PointCategoryObjectFilter PCATFindInIn) {
    PCATFindIn = PCATFindInIn;
  }

  public void translateFromMap() {
    PCATFindIn = PointCategoryObjectHelper.fromMapFilter(inputMap, "PointCategory");
  }

/**
 *
 * Gets the PointCategory
 * @return Value of the PointCategory
 *
 */

  public PointCategoryObjectFilter getPointCategory( ) {
    return PCATFindIn;
  }

}

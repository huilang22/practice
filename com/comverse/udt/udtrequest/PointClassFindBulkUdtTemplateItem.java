/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointClassFindBulkUdtTemplateItem.java
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
 * Class used to create a PointClassFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PointClassFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PointClassObjectFilter PCFindIn;
/**
 *
 * Constructor to create a  PointClassFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PointClassFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PointClassObjectFilter PCFindInIn) {
    super(id, context, "PointClassFind");
    PCFindIn = PCFindInIn;
  }

  public void translateToMap() {
    if (PCFindIn != null) {
      Integer index =  PCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PointClass", PointClassObjectHelper.toMap(PCFindIn, new HashMap(), "PointClass").get("PointClass"));
    }
  }


/**
 *
 * Sets the PointClass
 * @param PCFindInIn Value of the PCFindIn
 *
 */

  public void setPointClass(PointClassObjectFilter PCFindInIn) {
    PCFindIn = PCFindInIn;
  }

  public void translateFromMap() {
    PCFindIn = PointClassObjectHelper.fromMapFilter(inputMap, "PointClass");
  }

/**
 *
 * Gets the PointClass
 * @return Value of the PointClass
 *
 */

  public PointClassObjectFilter getPointClass( ) {
    return PCFindIn;
  }

}

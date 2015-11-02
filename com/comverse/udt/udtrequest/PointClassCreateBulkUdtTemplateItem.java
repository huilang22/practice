/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointClassCreateBulkUdtTemplateItem.java
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
 * Class used to create a PointClassCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PointClassCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PointClassObjectData PCCreateIn;
/**
 *
 * Constructor to create a  PointClassCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PointClassCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PointClassObjectData PCCreateInIn) {
    super(id, context, "PointClassCreate");
    PCCreateIn = PCCreateInIn;
  }

  public void translateToMap() {
    if (PCCreateIn != null) {
      PCCreateIn.resetFlags(true, true);
      addInput("PointClass", PointClassObjectHelper.toMap(PCCreateIn, new HashMap(), "PointClass").get("PointClass"));
    }
  }


/**
 *
 * Sets the PointClass
 * @param PCCreateInIn Value of the PCCreateIn
 *
 */

  public void setPointClass(PointClassObjectData PCCreateInIn) {
    PCCreateIn = PCCreateInIn;
  }

  public void translateFromMap() {
    PCCreateIn = PointClassObjectHelper.fromMap(inputMap, "PointClass");
  }

/**
 *
 * Gets the PointClass
 * @return Value of the PointClass
 *
 */

  public PointClassObjectData getPointClass( ) {
    return PCCreateIn;
  }

}

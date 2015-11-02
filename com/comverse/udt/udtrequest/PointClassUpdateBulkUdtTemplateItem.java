/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointClassUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PointClassUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PointClassUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PointClassObjectData PCUpdateIn;
/**
 *
 * Constructor to create a  PointClassUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PointClassUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PointClassObjectData PCUpdateInIn) {
    super(id, context, "PointClassUpdate");
    PCUpdateIn = PCUpdateInIn;
  }

  public void translateToMap() {
    if (PCUpdateIn != null) {
      PCUpdateIn.resetFlags(true, true);
      addInput("PointClass", PointClassObjectHelper.toMap(PCUpdateIn, new HashMap(), "PointClass").get("PointClass"));
    }
  }


/**
 *
 * Sets the PointClass
 * @param PCUpdateInIn Value of the PCUpdateIn
 *
 */

  public void setPointClass(PointClassObjectData PCUpdateInIn) {
    PCUpdateIn = PCUpdateInIn;
  }

  public void translateFromMap() {
    PCUpdateIn = PointClassObjectHelper.fromMap(inputMap, "PointClass");
  }

/**
 *
 * Gets the PointClass
 * @return Value of the PointClass
 *
 */

  public PointClassObjectData getPointClass( ) {
    return PCUpdateIn;
  }

}

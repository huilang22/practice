/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointClassDeleteBulkUdtTemplateItem.java
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
 * Class used to create a PointClassDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class PointClassDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PointClassObjectKeyData PCDeleteIn;
/**
 *
 * Constructor to create a  PointClassDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PointClassDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, PointClassObjectKeyData PCDeleteInIn) {
    super(id, context, "PointClassDelete");
    PCDeleteIn = PCDeleteInIn;
  }

  public void translateToMap() {
    if (PCDeleteIn != null) {
      PCDeleteIn.resetFlags(true, true);
      addInput("PointClass", PointClassObjectKeyHelper.toMap(PCDeleteIn, new HashMap(), "PointClassObjectKeyData").get("PointClassObjectKeyData"));
    }
  }


/**
 *
 * Sets the PointClass
 * @param PCDeleteInIn Value of the PCDeleteIn
 *
 */

  public void setPointClass(PointClassObjectKeyData PCDeleteInIn) {
    PCDeleteIn = PCDeleteInIn;
  }

  public void translateFromMap() {
    PCDeleteIn = PointClassObjectKeyHelper.fromMap(inputMap, "PointClass");
  }

/**
 *
 * Gets the PointClass
 * @return Value of the PointClass
 *
 */

  public PointClassObjectKeyData getPointClass( ) {
    return PCDeleteIn;
  }

}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountTargetCreateBulkUdtTemplateItem.java
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
 * Class used to create a DiscountTargetCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountTargetCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DTObjectData DTCreateIn;
/**
 *
 * Constructor to create a  DiscountTargetCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountTargetCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, DTObjectData DTCreateInIn) {
    super(id, context, "DiscountTargetCreate");
    DTCreateIn = DTCreateInIn;
  }

  public void translateToMap() {
    if (DTCreateIn != null) {
      DTCreateIn.resetFlags(true, true);
      addInput("DiscountTarget", DTObjectHelper.toMap(DTCreateIn, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
  }


/**
 *
 * Sets the DiscountTarget
 * @param DTCreateInIn Value of the DTCreateIn
 *
 */

  public void setDiscountTarget(DTObjectData DTCreateInIn) {
    DTCreateIn = DTCreateInIn;
  }

  public void translateFromMap() {
    DTCreateIn = DTObjectHelper.fromMap(inputMap, "DiscountTarget");
  }

/**
 *
 * Gets the DiscountTarget
 * @return Value of the DiscountTarget
 *
 */

  public DTObjectData getDiscountTarget( ) {
    return DTCreateIn;
  }

}

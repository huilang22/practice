/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountThreshTierIdCreateBulkUdtTemplateItem.java
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
 * Class used to create a DiscountThreshTierIdCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountThreshTierIdCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DTTObjectData DTTCreateIn;
/**
 *
 * Constructor to create a  DiscountThreshTierIdCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountThreshTierIdCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, DTTObjectData DTTCreateInIn) {
    super(id, context, "DiscountThreshTierIdCreate");
    DTTCreateIn = DTTCreateInIn;
  }

  public void translateToMap() {
    if (DTTCreateIn != null) {
      DTTCreateIn.resetFlags(true, true);
      addInput("DiscountThreshTierId", DTTObjectHelper.toMap(DTTCreateIn, new HashMap(), "DiscountThreshTierId").get("DiscountThreshTierId"));
    }
  }


/**
 *
 * Sets the DiscountThreshTierId
 * @param DTTCreateInIn Value of the DTTCreateIn
 *
 */

  public void setDiscountThreshTierId(DTTObjectData DTTCreateInIn) {
    DTTCreateIn = DTTCreateInIn;
  }

  public void translateFromMap() {
    DTTCreateIn = DTTObjectHelper.fromMap(inputMap, "DiscountThreshTierId");
  }

/**
 *
 * Gets the DiscountThreshTierId
 * @return Value of the DiscountThreshTierId
 *
 */

  public DTTObjectData getDiscountThreshTierId( ) {
    return DTTCreateIn;
  }

}

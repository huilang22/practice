/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountThreshTierIdGetBulkUdtTemplateItem.java
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
 * Class used to create a DiscountThreshTierIdGetBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountThreshTierIdGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DTTObjectKeyData DTTGetIn;
/**
 *
 * Constructor to create a  DiscountThreshTierIdGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountThreshTierIdGetBulkUdtTemplateItem(String id, BSDMSessionContext context, DTTObjectKeyData DTTGetInIn) {
    super(id, context, "DiscountThreshTierIdGet");
    DTTGetIn = DTTGetInIn;
  }

  public void translateToMap() {
    if (DTTGetIn != null) {
      DTTGetIn.resetFlags(true, true);
      addInput("DiscountThreshTierId", DTTObjectKeyHelper.toMap(DTTGetIn, new HashMap(), "DTTObjectKeyData").get("DTTObjectKeyData"));
    }
  }


/**
 *
 * Sets the DiscountThreshTierId
 * @param DTTGetInIn Value of the DTTGetIn
 *
 */

  public void setDiscountThreshTierId(DTTObjectKeyData DTTGetInIn) {
    DTTGetIn = DTTGetInIn;
  }

  public void translateFromMap() {
    DTTGetIn = DTTObjectKeyHelper.fromMap(inputMap, "DiscountThreshTierId");
  }

/**
 *
 * Gets the DiscountThreshTierId
 * @return Value of the DiscountThreshTierId
 *
 */

  public DTTObjectKeyData getDiscountThreshTierId( ) {
    return DTTGetIn;
  }

}

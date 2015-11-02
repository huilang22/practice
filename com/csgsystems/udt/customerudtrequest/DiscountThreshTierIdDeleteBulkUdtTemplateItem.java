/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountThreshTierIdDeleteBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a DiscountThreshTierIdDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountThreshTierIdDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DTTObjectKeyData DTTDeleteIn;
/**
 *
 * Constructor to create a  DiscountThreshTierIdDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountThreshTierIdDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, DTTObjectKeyData DTTDeleteInIn) {
    super(id, context, "DiscountThreshTierIdDelete");
    DTTDeleteIn = DTTDeleteInIn;
  }

  public void translateToMap() {
    if (DTTDeleteIn != null) {
      DTTDeleteIn.resetFlags(true, true);
      addInput("DiscountThreshTierId", DTTObjectKeyHelper.toMap(DTTDeleteIn, new HashMap(), "DTTObjectKeyData").get("DTTObjectKeyData"));
    }
  }


/**
 *
 * Sets the DiscountThreshTierId
 * @param DTTDeleteInIn Value of the DTTDeleteIn
 *
 */

  public void setDiscountThreshTierId(DTTObjectKeyData DTTDeleteInIn) {
    DTTDeleteIn = DTTDeleteInIn;
  }

  public void translateFromMap() {
    DTTDeleteIn = DTTObjectKeyHelper.fromMap(inputMap, "DiscountThreshTierId");
  }

/**
 *
 * Gets the DiscountThreshTierId
 * @return Value of the DiscountThreshTierId
 *
 */

  public DTTObjectKeyData getDiscountThreshTierId( ) {
    return DTTDeleteIn;
  }

}

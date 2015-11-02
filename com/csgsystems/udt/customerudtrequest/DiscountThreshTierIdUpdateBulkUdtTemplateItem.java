/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountThreshTierIdUpdateBulkUdtTemplateItem.java
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
 * Class used to create a DiscountThreshTierIdUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountThreshTierIdUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DTTObjectData DTTUpdateIn;
/**
 *
 * Constructor to create a  DiscountThreshTierIdUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountThreshTierIdUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, DTTObjectData DTTUpdateInIn) {
    super(id, context, "DiscountThreshTierIdUpdate");
    DTTUpdateIn = DTTUpdateInIn;
  }

  public void translateToMap() {
    if (DTTUpdateIn != null) {
      DTTUpdateIn.resetFlags(true, true);
      addInput("DiscountThreshTierId", DTTObjectHelper.toMap(DTTUpdateIn, new HashMap(), "DiscountThreshTierId").get("DiscountThreshTierId"));
    }
  }


/**
 *
 * Sets the DiscountThreshTierId
 * @param DTTUpdateInIn Value of the DTTUpdateIn
 *
 */

  public void setDiscountThreshTierId(DTTObjectData DTTUpdateInIn) {
    DTTUpdateIn = DTTUpdateInIn;
  }

  public void translateFromMap() {
    DTTUpdateIn = DTTObjectHelper.fromMap(inputMap, "DiscountThreshTierId");
  }

/**
 *
 * Gets the DiscountThreshTierId
 * @return Value of the DiscountThreshTierId
 *
 */

  public DTTObjectData getDiscountThreshTierId( ) {
    return DTTUpdateIn;
  }

}

/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a AdjustmentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjustmentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AdjustmentObjectKeyData getIn;
/**
 *
 * Constructor to create a  AdjustmentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjustmentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentObjectKeyData getInIn) {
    super(id, context, "AdjustmentGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("Adjustment", AdjustmentObjectKeyHelper.toMap(getIn, new HashMap(), "AdjustmentObjectKeyData").get("AdjustmentObjectKeyData"));
    }
  }


/**
 *
 * Sets the Adjustment
 * @param getInIn Value of the getIn
 *
 */

  public void setAdjustment(AdjustmentObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = AdjustmentObjectKeyHelper.fromMap(inputMap, "Adjustment");
  }

/**
 *
 * Gets the Adjustment
 * @return Value of the Adjustment
 *
 */

  public AdjustmentObjectKeyData getAdjustment( ) {
    return getIn;
  }

}

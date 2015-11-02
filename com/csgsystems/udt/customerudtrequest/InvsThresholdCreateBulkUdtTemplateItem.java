/*
 * Generated code DO NOT EDIT
 * Generated file: InvsThresholdCreateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsThresholdCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsThresholdCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsThresholdObjectData InvsThresholdCreateIn;
/**
 *
 * Constructor to create a  InvsThresholdCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsThresholdCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsThresholdObjectData InvsThresholdCreateInIn) {
    super(id, context, "InvsThresholdCreate");
    InvsThresholdCreateIn = InvsThresholdCreateInIn;
  }

  public void translateToMap() {
    if (InvsThresholdCreateIn != null) {
      InvsThresholdCreateIn.resetFlags(true, true);
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(InvsThresholdCreateIn, new HashMap(), "InvsThreshold").get("InvsThreshold"));
    }
  }


/**
 *
 * Sets the InvsThreshold
 * @param InvsThresholdCreateInIn Value of the InvsThresholdCreateIn
 *
 */

  public void setInvsThreshold(InvsThresholdObjectData InvsThresholdCreateInIn) {
    InvsThresholdCreateIn = InvsThresholdCreateInIn;
  }

  public void translateFromMap() {
    InvsThresholdCreateIn = InvsThresholdObjectHelper.fromMap(inputMap, "InvsThreshold");
  }

/**
 *
 * Gets the InvsThreshold
 * @return Value of the InvsThreshold
 *
 */

  public InvsThresholdObjectData getInvsThreshold( ) {
    return InvsThresholdCreateIn;
  }

}

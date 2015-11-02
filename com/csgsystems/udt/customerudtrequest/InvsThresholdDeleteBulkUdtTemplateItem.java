/*
 * Generated code DO NOT EDIT
 * Generated file: InvsThresholdDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvsThresholdDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsThresholdDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsThresholdObjectData InvsThresholdDeleteIn;
/**
 *
 * Constructor to create a  InvsThresholdDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsThresholdDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsThresholdObjectData InvsThresholdDeleteInIn) {
    super(id, context, "InvsThresholdDelete");
    InvsThresholdDeleteIn = InvsThresholdDeleteInIn;
  }

  public void translateToMap() {
    if (InvsThresholdDeleteIn != null) {
      InvsThresholdDeleteIn.resetFlags(true, true);
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(InvsThresholdDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the InvsThreshold
 * @param InvsThresholdDeleteInIn Value of the InvsThresholdDeleteIn
 *
 */

  public void setInvsThreshold(InvsThresholdObjectData InvsThresholdDeleteInIn) {
    InvsThresholdDeleteIn = InvsThresholdDeleteInIn;
  }

  public void translateFromMap() {
    InvsThresholdDeleteIn = InvsThresholdObjectHelper.fromMap(inputMap, "InvsThreshold");
  }

/**
 *
 * Gets the InvsThreshold
 * @return Value of the InvsThreshold
 *
 */

  public InvsThresholdObjectData getInvsThreshold( ) {
    return InvsThresholdDeleteIn;
  }

}

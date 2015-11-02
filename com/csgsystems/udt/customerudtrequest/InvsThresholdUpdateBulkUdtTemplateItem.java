/*
 * Generated code DO NOT EDIT
 * Generated file: InvsThresholdUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsThresholdUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsThresholdUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsThresholdObjectData InvsThresholdUpdateIn;
/**
 *
 * Constructor to create a  InvsThresholdUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsThresholdUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsThresholdObjectData InvsThresholdUpdateInIn) {
    super(id, context, "InvsThresholdUpdate");
    InvsThresholdUpdateIn = InvsThresholdUpdateInIn;
  }

  public void translateToMap() {
    if (InvsThresholdUpdateIn != null) {
      InvsThresholdUpdateIn.resetFlags(true, true);
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(InvsThresholdUpdateIn, new HashMap(), "InvsThreshold").get("InvsThreshold"));
    }
  }


/**
 *
 * Sets the InvsThreshold
 * @param InvsThresholdUpdateInIn Value of the InvsThresholdUpdateIn
 *
 */

  public void setInvsThreshold(InvsThresholdObjectData InvsThresholdUpdateInIn) {
    InvsThresholdUpdateIn = InvsThresholdUpdateInIn;
  }

  public void translateFromMap() {
    InvsThresholdUpdateIn = InvsThresholdObjectHelper.fromMap(inputMap, "InvsThreshold");
  }

/**
 *
 * Gets the InvsThreshold
 * @return Value of the InvsThreshold
 *
 */

  public InvsThresholdObjectData getInvsThreshold( ) {
    return InvsThresholdUpdateIn;
  }

}

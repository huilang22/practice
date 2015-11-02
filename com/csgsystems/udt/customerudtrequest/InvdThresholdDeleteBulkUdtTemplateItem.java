/*
 * Generated code DO NOT EDIT
 * Generated file: InvdThresholdDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvdThresholdDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdThresholdDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdThresholdObjectKeyData InvdThresholdDeleteIn;
/**
 *
 * Constructor to create a  InvdThresholdDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdThresholdDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdThresholdObjectKeyData InvdThresholdDeleteInIn) {
    super(id, context, "InvdThresholdDelete");
    InvdThresholdDeleteIn = InvdThresholdDeleteInIn;
  }

  public void translateToMap() {
    if (InvdThresholdDeleteIn != null) {
      InvdThresholdDeleteIn.resetFlags(true, true);
      addInput("InvdThreshold", InvdThresholdObjectKeyHelper.toMap(InvdThresholdDeleteIn, new HashMap(), "InvdThresholdObjectKeyData").get("InvdThresholdObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvdThreshold
 * @param InvdThresholdDeleteInIn Value of the InvdThresholdDeleteIn
 *
 */

  public void setInvdThreshold(InvdThresholdObjectKeyData InvdThresholdDeleteInIn) {
    InvdThresholdDeleteIn = InvdThresholdDeleteInIn;
  }

  public void translateFromMap() {
    InvdThresholdDeleteIn = InvdThresholdObjectKeyHelper.fromMap(inputMap, "InvdThreshold");
  }

/**
 *
 * Gets the InvdThreshold
 * @return Value of the InvdThreshold
 *
 */

  public InvdThresholdObjectKeyData getInvdThreshold( ) {
    return InvdThresholdDeleteIn;
  }

}

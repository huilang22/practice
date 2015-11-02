/*
 * Generated code DO NOT EDIT
 * Generated file: InvdThresholdGetBulkUdtTemplateItem.java
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
 * Class used to create a InvdThresholdGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdThresholdGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdThresholdObjectKeyData InvdThresholdGetIn;
/**
 *
 * Constructor to create a  InvdThresholdGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdThresholdGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdThresholdObjectKeyData InvdThresholdGetInIn) {
    super(id, context, "InvdThresholdGet");
    InvdThresholdGetIn = InvdThresholdGetInIn;
  }

  public void translateToMap() {
    if (InvdThresholdGetIn != null) {
      InvdThresholdGetIn.resetFlags(true, true);
      addInput("InvdThreshold", InvdThresholdObjectKeyHelper.toMap(InvdThresholdGetIn, new HashMap(), "InvdThresholdObjectKeyData").get("InvdThresholdObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvdThreshold
 * @param InvdThresholdGetInIn Value of the InvdThresholdGetIn
 *
 */

  public void setInvdThreshold(InvdThresholdObjectKeyData InvdThresholdGetInIn) {
    InvdThresholdGetIn = InvdThresholdGetInIn;
  }

  public void translateFromMap() {
    InvdThresholdGetIn = InvdThresholdObjectKeyHelper.fromMap(inputMap, "InvdThreshold");
  }

/**
 *
 * Gets the InvdThreshold
 * @return Value of the InvdThreshold
 *
 */

  public InvdThresholdObjectKeyData getInvdThreshold( ) {
    return InvdThresholdGetIn;
  }

}

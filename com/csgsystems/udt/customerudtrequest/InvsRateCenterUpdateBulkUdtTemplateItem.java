/*
 * Generated code DO NOT EDIT
 * Generated file: InvsRateCenterUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsRateCenterUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsRateCenterUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsRateCenterObjectData InvsRateCenterUpdateIn;
/**
 *
 * Constructor to create a  InvsRateCenterUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsRateCenterUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsRateCenterObjectData InvsRateCenterUpdateInIn) {
    super(id, context, "InvsRateCenterUpdate");
    InvsRateCenterUpdateIn = InvsRateCenterUpdateInIn;
  }

  public void translateToMap() {
    if (InvsRateCenterUpdateIn != null) {
      InvsRateCenterUpdateIn.resetFlags(true, true);
      addInput("InvsRateCenter", InvsRateCenterObjectHelper.toMap(InvsRateCenterUpdateIn, new HashMap(), "InvsRateCenter").get("InvsRateCenter"));
    }
  }


/**
 *
 * Sets the InvsRateCenter
 * @param InvsRateCenterUpdateInIn Value of the InvsRateCenterUpdateIn
 *
 */

  public void setInvsRateCenter(InvsRateCenterObjectData InvsRateCenterUpdateInIn) {
    InvsRateCenterUpdateIn = InvsRateCenterUpdateInIn;
  }

  public void translateFromMap() {
    InvsRateCenterUpdateIn = InvsRateCenterObjectHelper.fromMap(inputMap, "InvsRateCenter");
  }

/**
 *
 * Gets the InvsRateCenter
 * @return Value of the InvsRateCenter
 *
 */

  public InvsRateCenterObjectData getInvsRateCenter( ) {
    return InvsRateCenterUpdateIn;
  }

}

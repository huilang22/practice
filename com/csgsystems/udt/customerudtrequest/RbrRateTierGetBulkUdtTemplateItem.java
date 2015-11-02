/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateTierGetBulkUdtTemplateItem.java
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
 * Class used to create a RbrRateTierGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrRateTierGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrRteTierObjectKeyData RbrRteTierGetIn;
/**
 *
 * Constructor to create a  RbrRateTierGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrRateTierGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRteTierObjectKeyData RbrRteTierGetInIn) {
    super(id, context, "RbrRateTierGet");
    RbrRteTierGetIn = RbrRteTierGetInIn;
  }

  public void translateToMap() {
    if (RbrRteTierGetIn != null) {
      RbrRteTierGetIn.resetFlags(true, true);
      addInput("RbrRateTier", RbrRteTierObjectKeyHelper.toMap(RbrRteTierGetIn, new HashMap(), "RbrRteTierObjectKeyData").get("RbrRteTierObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrRateTier
 * @param RbrRteTierGetInIn Value of the RbrRteTierGetIn
 *
 */

  public void setRbrRateTier(RbrRteTierObjectKeyData RbrRteTierGetInIn) {
    RbrRteTierGetIn = RbrRteTierGetInIn;
  }

  public void translateFromMap() {
    RbrRteTierGetIn = RbrRteTierObjectKeyHelper.fromMap(inputMap, "RbrRateTier");
  }

/**
 *
 * Gets the RbrRateTier
 * @return Value of the RbrRateTier
 *
 */

  public RbrRteTierObjectKeyData getRbrRateTier( ) {
    return RbrRteTierGetIn;
  }

}

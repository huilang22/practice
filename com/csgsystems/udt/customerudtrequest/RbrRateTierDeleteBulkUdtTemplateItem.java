/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateTierDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RbrRateTierDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrRateTierDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrRteTierObjectKeyData RbrRteTierDeleteIn;
/**
 *
 * Constructor to create a  RbrRateTierDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrRateTierDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRteTierObjectKeyData RbrRteTierDeleteInIn) {
    super(id, context, "RbrRateTierDelete");
    RbrRteTierDeleteIn = RbrRteTierDeleteInIn;
  }

  public void translateToMap() {
    if (RbrRteTierDeleteIn != null) {
      RbrRteTierDeleteIn.resetFlags(true, true);
      addInput("RbrRateTier", RbrRteTierObjectKeyHelper.toMap(RbrRteTierDeleteIn, new HashMap(), "RbrRteTierObjectKeyData").get("RbrRteTierObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrRateTier
 * @param RbrRteTierDeleteInIn Value of the RbrRteTierDeleteIn
 *
 */

  public void setRbrRateTier(RbrRteTierObjectKeyData RbrRteTierDeleteInIn) {
    RbrRteTierDeleteIn = RbrRteTierDeleteInIn;
  }

  public void translateFromMap() {
    RbrRteTierDeleteIn = RbrRteTierObjectKeyHelper.fromMap(inputMap, "RbrRateTier");
  }

/**
 *
 * Gets the RbrRateTier
 * @return Value of the RbrRateTier
 *
 */

  public RbrRteTierObjectKeyData getRbrRateTier( ) {
    return RbrRteTierDeleteIn;
  }

}

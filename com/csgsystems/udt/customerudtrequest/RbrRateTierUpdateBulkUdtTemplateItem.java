/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateTierUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RbrRateTierUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrRateTierUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrRteTierObjectData RbrRteTierUpdateIn;
/**
 *
 * Constructor to create a  RbrRateTierUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrRateTierUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRteTierObjectData RbrRteTierUpdateInIn) {
    super(id, context, "RbrRateTierUpdate");
    RbrRteTierUpdateIn = RbrRteTierUpdateInIn;
  }

  public void translateToMap() {
    if (RbrRteTierUpdateIn != null) {
      RbrRteTierUpdateIn.resetFlags(true, true);
      addInput("RbrRateTier", RbrRteTierObjectHelper.toMap(RbrRteTierUpdateIn, new HashMap(), "RbrRateTier").get("RbrRateTier"));
    }
  }


/**
 *
 * Sets the RbrRateTier
 * @param RbrRteTierUpdateInIn Value of the RbrRteTierUpdateIn
 *
 */

  public void setRbrRateTier(RbrRteTierObjectData RbrRteTierUpdateInIn) {
    RbrRteTierUpdateIn = RbrRteTierUpdateInIn;
  }

  public void translateFromMap() {
    RbrRteTierUpdateIn = RbrRteTierObjectHelper.fromMap(inputMap, "RbrRateTier");
  }

/**
 *
 * Gets the RbrRateTier
 * @return Value of the RbrRateTier
 *
 */

  public RbrRteTierObjectData getRbrRateTier( ) {
    return RbrRteTierUpdateIn;
  }

}

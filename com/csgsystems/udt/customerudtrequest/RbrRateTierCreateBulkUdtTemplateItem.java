/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateTierCreateBulkUdtTemplateItem.java
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
 * Class used to create a RbrRateTierCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrRateTierCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrRteTierObjectData RbrRteTierCreateIn;
/**
 *
 * Constructor to create a  RbrRateTierCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrRateTierCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRteTierObjectData RbrRteTierCreateInIn) {
    super(id, context, "RbrRateTierCreate");
    RbrRteTierCreateIn = RbrRteTierCreateInIn;
  }

  public void translateToMap() {
    if (RbrRteTierCreateIn != null) {
      RbrRteTierCreateIn.resetFlags(true, true);
      addInput("RbrRateTier", RbrRteTierObjectHelper.toMap(RbrRteTierCreateIn, new HashMap(), "RbrRateTier").get("RbrRateTier"));
    }
  }


/**
 *
 * Sets the RbrRateTier
 * @param RbrRteTierCreateInIn Value of the RbrRteTierCreateIn
 *
 */

  public void setRbrRateTier(RbrRteTierObjectData RbrRteTierCreateInIn) {
    RbrRteTierCreateIn = RbrRteTierCreateInIn;
  }

  public void translateFromMap() {
    RbrRteTierCreateIn = RbrRteTierObjectHelper.fromMap(inputMap, "RbrRateTier");
  }

/**
 *
 * Gets the RbrRateTier
 * @return Value of the RbrRateTier
 *
 */

  public RbrRteTierObjectData getRbrRateTier( ) {
    return RbrRteTierCreateIn;
  }

}

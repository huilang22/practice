/*
 * Generated code DO NOT EDIT
 * Generated file: RateRcCreateBulkUdtTemplateItem.java
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
 * Class used to create a RateRcCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateRcCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RACObjectData RACCreateIn;
/**
 *
 * Constructor to create a  RateRcCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateRcCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RACObjectData RACCreateInIn) {
    super(id, context, "RateRcCreate");
    RACCreateIn = RACCreateInIn;
  }

  public void translateToMap() {
    if (RACCreateIn != null) {
      RACCreateIn.resetFlags(true, true);
      addInput("RateRc", RACObjectHelper.toMap(RACCreateIn, new HashMap(), "RateRc").get("RateRc"));
    }
  }


/**
 *
 * Sets the RateRc
 * @param RACCreateInIn Value of the RACCreateIn
 *
 */

  public void setRateRc(RACObjectData RACCreateInIn) {
    RACCreateIn = RACCreateInIn;
  }

  public void translateFromMap() {
    RACCreateIn = RACObjectHelper.fromMap(inputMap, "RateRc");
  }

/**
 *
 * Gets the RateRc
 * @return Value of the RateRc
 *
 */

  public RACObjectData getRateRc( ) {
    return RACCreateIn;
  }

}

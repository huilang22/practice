/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RbrRateUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrRateUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrRatesObjectData RbrRateUpdateIn;
/**
 *
 * Constructor to create a  RbrRateUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrRateUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRatesObjectData RbrRateUpdateInIn) {
    super(id, context, "RbrRateUpdate");
    RbrRateUpdateIn = RbrRateUpdateInIn;
  }

  public void translateToMap() {
    if (RbrRateUpdateIn != null) {
      RbrRateUpdateIn.resetFlags(true, true);
      addInput("RbrRate", RbrRatesObjectHelper.toMap(RbrRateUpdateIn, new HashMap(), "RbrRate").get("RbrRate"));
    }
  }


/**
 *
 * Sets the RbrRate
 * @param RbrRateUpdateInIn Value of the RbrRateUpdateIn
 *
 */

  public void setRbrRate(RbrRatesObjectData RbrRateUpdateInIn) {
    RbrRateUpdateIn = RbrRateUpdateInIn;
  }

  public void translateFromMap() {
    RbrRateUpdateIn = RbrRatesObjectHelper.fromMap(inputMap, "RbrRate");
  }

/**
 *
 * Gets the RbrRate
 * @return Value of the RbrRate
 *
 */

  public RbrRatesObjectData getRbrRate( ) {
    return RbrRateUpdateIn;
  }

}

/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RbrRateDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrRateDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrRatesObjectKeyData RbrRatesDeleteIn;
/**
 *
 * Constructor to create a  RbrRateDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrRateDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRatesObjectKeyData RbrRatesDeleteInIn) {
    super(id, context, "RbrRateDelete");
    RbrRatesDeleteIn = RbrRatesDeleteInIn;
  }

  public void translateToMap() {
    if (RbrRatesDeleteIn != null) {
      RbrRatesDeleteIn.resetFlags(true, true);
      addInput("RbrRate", RbrRatesObjectKeyHelper.toMap(RbrRatesDeleteIn, new HashMap(), "RbrRatesObjectKeyData").get("RbrRatesObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrRate
 * @param RbrRatesDeleteInIn Value of the RbrRatesDeleteIn
 *
 */

  public void setRbrRate(RbrRatesObjectKeyData RbrRatesDeleteInIn) {
    RbrRatesDeleteIn = RbrRatesDeleteInIn;
  }

  public void translateFromMap() {
    RbrRatesDeleteIn = RbrRatesObjectKeyHelper.fromMap(inputMap, "RbrRate");
  }

/**
 *
 * Gets the RbrRate
 * @return Value of the RbrRate
 *
 */

  public RbrRatesObjectKeyData getRbrRate( ) {
    return RbrRatesDeleteIn;
  }

}

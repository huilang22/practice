/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateGetBulkUdtTemplateItem.java
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
 * Class used to create a RbrRateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrRateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrRatesObjectKeyData RbrRatesGetIn;
/**
 *
 * Constructor to create a  RbrRateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrRateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRatesObjectKeyData RbrRatesGetInIn) {
    super(id, context, "RbrRateGet");
    RbrRatesGetIn = RbrRatesGetInIn;
  }

  public void translateToMap() {
    if (RbrRatesGetIn != null) {
      RbrRatesGetIn.resetFlags(true, true);
      addInput("RbrRate", RbrRatesObjectKeyHelper.toMap(RbrRatesGetIn, new HashMap(), "RbrRatesObjectKeyData").get("RbrRatesObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrRate
 * @param RbrRatesGetInIn Value of the RbrRatesGetIn
 *
 */

  public void setRbrRate(RbrRatesObjectKeyData RbrRatesGetInIn) {
    RbrRatesGetIn = RbrRatesGetInIn;
  }

  public void translateFromMap() {
    RbrRatesGetIn = RbrRatesObjectKeyHelper.fromMap(inputMap, "RbrRate");
  }

/**
 *
 * Gets the RbrRate
 * @return Value of the RbrRate
 *
 */

  public RbrRatesObjectKeyData getRbrRate( ) {
    return RbrRatesGetIn;
  }

}

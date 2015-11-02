/*
 * Generated code DO NOT EDIT
 * Generated file: UsageCreditRateGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a UsageCreditRateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageCreditRateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUCreditObjectKeyData RUCGetIn;
/**
 *
 * Constructor to create a  UsageCreditRateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageCreditRateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCreditObjectKeyData RUCGetInIn) {
    super(id, context, "UsageCreditRateGet");
    RUCGetIn = RUCGetInIn;
  }

  public void translateToMap() {
    if (RUCGetIn != null) {
      RUCGetIn.resetFlags(true, true);
      addInput("UsageCreditRate", RUCreditObjectKeyHelper.toMap(RUCGetIn, new HashMap(), "RUCreditObjectKeyData").get("RUCreditObjectKeyData"));
    }
  }


/**
 *
 * Sets the UsageCreditRate
 * @param RUCGetInIn Value of the RUCGetIn
 *
 */

  public void setUsageCreditRate(RUCreditObjectKeyData RUCGetInIn) {
    RUCGetIn = RUCGetInIn;
  }

  public void translateFromMap() {
    RUCGetIn = RUCreditObjectKeyHelper.fromMap(inputMap, "UsageCreditRate");
  }

/**
 *
 * Gets the UsageCreditRate
 * @return Value of the UsageCreditRate
 *
 */

  public RUCreditObjectKeyData getUsageCreditRate( ) {
    return RUCGetIn;
  }

}

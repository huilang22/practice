/*
 * Generated code DO NOT EDIT
 * Generated file: RateCurrencyGetBulkUdtTemplateItem.java
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
 * Class used to create a RateCurrencyGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCurrencyGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RCObjectKeyData RCGetIn;
/**
 *
 * Constructor to create a  RateCurrencyGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCurrencyGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RCObjectKeyData RCGetInIn) {
    super(id, context, "RateCurrencyGet");
    RCGetIn = RCGetInIn;
  }

  public void translateToMap() {
    if (RCGetIn != null) {
      RCGetIn.resetFlags(true, true);
      addInput("RateCurrency", RCObjectKeyHelper.toMap(RCGetIn, new HashMap(), "RCObjectKeyData").get("RCObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateCurrency
 * @param RCGetInIn Value of the RCGetIn
 *
 */

  public void setRateCurrency(RCObjectKeyData RCGetInIn) {
    RCGetIn = RCGetInIn;
  }

  public void translateFromMap() {
    RCGetIn = RCObjectKeyHelper.fromMap(inputMap, "RateCurrency");
  }

/**
 *
 * Gets the RateCurrency
 * @return Value of the RateCurrency
 *
 */

  public RCObjectKeyData getRateCurrency( ) {
    return RCGetIn;
  }

}

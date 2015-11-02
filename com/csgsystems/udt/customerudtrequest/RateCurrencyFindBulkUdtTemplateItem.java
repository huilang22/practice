/*
 * Generated code DO NOT EDIT
 * Generated file: RateCurrencyFindBulkUdtTemplateItem.java
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
 * Class used to create a RateCurrencyFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCurrencyFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RCObjectFilter RCFindIn;
/**
 *
 * Constructor to create a  RateCurrencyFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCurrencyFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RCObjectFilter RCFindInIn) {
    super(id, context, "RateCurrencyFind");
    RCFindIn = RCFindInIn;
  }

  public void translateToMap() {
    if (RCFindIn != null) {
      Integer index =  RCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateCurrency", RCObjectHelper.toMap(RCFindIn, new HashMap(), "RateCurrency").get("RateCurrency"));
    }
  }


/**
 *
 * Sets the RateCurrency
 * @param RCFindInIn Value of the RCFindIn
 *
 */

  public void setRateCurrency(RCObjectFilter RCFindInIn) {
    RCFindIn = RCFindInIn;
  }

  public void translateFromMap() {
    RCFindIn = RCObjectHelper.fromMapFilter(inputMap, "RateCurrency");
  }

/**
 *
 * Gets the RateCurrency
 * @return Value of the RateCurrency
 *
 */

  public RCObjectFilter getRateCurrency( ) {
    return RCFindIn;
  }

}

/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodDistinctGetBulkUdtTemplateItem.java
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
 * Class used to create a RatePeriodDistinctGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RatePeriodDistinctGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RatePeriodDistinctObjectKeyData rpGetIn;
/**
 *
 * Constructor to create a  RatePeriodDistinctGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatePeriodDistinctGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RatePeriodDistinctObjectKeyData rpGetInIn) {
    super(id, context, "RatePeriodDistinctGet");
    rpGetIn = rpGetInIn;
  }

  public void translateToMap() {
    if (rpGetIn != null) {
      rpGetIn.resetFlags(true, true);
      addInput("RatePeriodDistinct", RatePeriodDistinctObjectKeyHelper.toMap(rpGetIn, new HashMap(), "RatePeriodDistinctObjectKeyData").get("RatePeriodDistinctObjectKeyData"));
    }
  }


/**
 *
 * Sets the RatePeriodDistinct
 * @param rpGetInIn Value of the rpGetIn
 *
 */

  public void setRatePeriodDistinct(RatePeriodDistinctObjectKeyData rpGetInIn) {
    rpGetIn = rpGetInIn;
  }

  public void translateFromMap() {
    rpGetIn = RatePeriodDistinctObjectKeyHelper.fromMap(inputMap, "RatePeriodDistinct");
  }

/**
 *
 * Gets the RatePeriodDistinct
 * @return Value of the RatePeriodDistinct
 *
 */

  public RatePeriodDistinctObjectKeyData getRatePeriodDistinct( ) {
    return rpGetIn;
  }

}

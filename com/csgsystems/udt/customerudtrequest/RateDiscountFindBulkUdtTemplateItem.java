/*
 * Generated code DO NOT EDIT
 * Generated file: RateDiscountFindBulkUdtTemplateItem.java
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
 * Class used to create a RateDiscountFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RateDiscountFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateDiscountObjectFilter rdFindIn;
/**
 *
 * Constructor to create a  RateDiscountFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateDiscountFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RateDiscountObjectFilter rdFindInIn) {
    super(id, context, "RateDiscountFind");
    rdFindIn = rdFindInIn;
  }

  public void translateToMap() {
    if (rdFindIn != null) {
      Integer index =  rdFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateDiscount", RateDiscountObjectHelper.toMap(rdFindIn, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
  }


/**
 *
 * Sets the RateDiscount
 * @param rdFindInIn Value of the rdFindIn
 *
 */

  public void setRateDiscount(RateDiscountObjectFilter rdFindInIn) {
    rdFindIn = rdFindInIn;
  }

  public void translateFromMap() {
    rdFindIn = RateDiscountObjectHelper.fromMapFilter(inputMap, "RateDiscount");
  }

/**
 *
 * Gets the RateDiscount
 * @return Value of the RateDiscount
 *
 */

  public RateDiscountObjectFilter getRateDiscount( ) {
    return rdFindIn;
  }

}

/*
 * Generated code DO NOT EDIT
 * Generated file: RateUnitCrFindBulkUdtTemplateItem.java
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
 * Class used to create a RateUnitCrFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUnitCrFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUnitCrObjectFilter rucFindIn;
/**
 *
 * Constructor to create a  RateUnitCrFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUnitCrFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUnitCrObjectFilter rucFindInIn) {
    super(id, context, "RateUnitCrFind");
    rucFindIn = rucFindInIn;
  }

  public void translateToMap() {
    if (rucFindIn != null) {
      Integer index =  rucFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateUnitCr", RateUnitCrObjectHelper.toMap(rucFindIn, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
  }


/**
 *
 * Sets the RateUnitCr
 * @param rucFindInIn Value of the rucFindIn
 *
 */

  public void setRateUnitCr(RateUnitCrObjectFilter rucFindInIn) {
    rucFindIn = rucFindInIn;
  }

  public void translateFromMap() {
    rucFindIn = RateUnitCrObjectHelper.fromMapFilter(inputMap, "RateUnitCr");
  }

/**
 *
 * Gets the RateUnitCr
 * @return Value of the RateUnitCr
 *
 */

  public RateUnitCrObjectFilter getRateUnitCr( ) {
    return rucFindIn;
  }

}

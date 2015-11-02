/*
 * Generated code DO NOT EDIT
 * Generated file: RateEpiFindBulkUdtTemplateItem.java
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
 * Class used to create a RateEpiFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RateEpiFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateEpiObjectFilter REFindIn;
/**
 *
 * Constructor to create a  RateEpiFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateEpiFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RateEpiObjectFilter REFindInIn) {
    super(id, context, "RateEpiFind");
    REFindIn = REFindInIn;
  }

  public void translateToMap() {
    if (REFindIn != null) {
      Integer index =  REFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateEpi", RateEpiObjectHelper.toMap(REFindIn, new HashMap(), "RateEpi").get("RateEpi"));
    }
  }


/**
 *
 * Sets the RateEpi
 * @param REFindInIn Value of the REFindIn
 *
 */

  public void setRateEpi(RateEpiObjectFilter REFindInIn) {
    REFindIn = REFindInIn;
  }

  public void translateFromMap() {
    REFindIn = RateEpiObjectHelper.fromMapFilter(inputMap, "RateEpi");
  }

/**
 *
 * Gets the RateEpi
 * @return Value of the RateEpi
 *
 */

  public RateEpiObjectFilter getRateEpi( ) {
    return REFindIn;
  }

}

/*
 * Generated code DO NOT EDIT
 * Generated file: RateEpiDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RateEpiDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RateEpiDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateEpiObjectData REDeleteIn;
/**
 *
 * Constructor to create a  RateEpiDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateEpiDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RateEpiObjectData REDeleteInIn) {
    super(id, context, "RateEpiDelete");
    REDeleteIn = REDeleteInIn;
  }

  public void translateToMap() {
    if (REDeleteIn != null) {
      REDeleteIn.resetFlags(true, true);
      addInput("RateEpi", RateEpiObjectHelper.toMap(REDeleteIn, new HashMap(), "RateEpi").get("RateEpi"));
    }
  }


/**
 *
 * Sets the RateEpi
 * @param REDeleteInIn Value of the REDeleteIn
 *
 */

  public void setRateEpi(RateEpiObjectData REDeleteInIn) {
    REDeleteIn = REDeleteInIn;
  }

  public void translateFromMap() {
    REDeleteIn = RateEpiObjectHelper.fromMap(inputMap, "RateEpi");
  }

/**
 *
 * Gets the RateEpi
 * @return Value of the RateEpi
 *
 */

  public RateEpiObjectData getRateEpi( ) {
    return REDeleteIn;
  }

}

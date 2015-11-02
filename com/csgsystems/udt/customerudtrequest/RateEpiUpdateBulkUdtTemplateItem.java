/*
 * Generated code DO NOT EDIT
 * Generated file: RateEpiUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RateEpiUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateEpiUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateEpiObjectData REUpdateIn;
/**
 *
 * Constructor to create a  RateEpiUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateEpiUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateEpiObjectData REUpdateInIn) {
    super(id, context, "RateEpiUpdate");
    REUpdateIn = REUpdateInIn;
  }

  public void translateToMap() {
    if (REUpdateIn != null) {
      REUpdateIn.resetFlags(true, true);
      addInput("RateEpi", RateEpiObjectHelper.toMap(REUpdateIn, new HashMap(), "RateEpi").get("RateEpi"));
    }
  }


/**
 *
 * Sets the RateEpi
 * @param REUpdateInIn Value of the REUpdateIn
 *
 */

  public void setRateEpi(RateEpiObjectData REUpdateInIn) {
    REUpdateIn = REUpdateInIn;
  }

  public void translateFromMap() {
    REUpdateIn = RateEpiObjectHelper.fromMap(inputMap, "RateEpi");
  }

/**
 *
 * Gets the RateEpi
 * @return Value of the RateEpi
 *
 */

  public RateEpiObjectData getRateEpi( ) {
    return REUpdateIn;
  }

}

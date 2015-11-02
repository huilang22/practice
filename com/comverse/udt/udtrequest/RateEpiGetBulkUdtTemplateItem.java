/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateEpiGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a RateEpiGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RateEpiGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateEpiObjectKeyData REGetIn;
/**
 *
 * Constructor to create a  RateEpiGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateEpiGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RateEpiObjectKeyData REGetInIn) {
    super(id, context, "RateEpiGet");
    REGetIn = REGetInIn;
  }

  public void translateToMap() {
    if (REGetIn != null) {
      REGetIn.resetFlags(true, true);
      addInput("RateEpi", RateEpiObjectKeyHelper.toMap(REGetIn, new HashMap(), "RateEpiObjectKeyData").get("RateEpiObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateEpi
 * @param REGetInIn Value of the REGetIn
 *
 */

  public void setRateEpi(RateEpiObjectKeyData REGetInIn) {
    REGetIn = REGetInIn;
  }

  public void translateFromMap() {
    REGetIn = RateEpiObjectKeyHelper.fromMap(inputMap, "RateEpi");
  }

/**
 *
 * Gets the RateEpi
 * @return Value of the RateEpi
 *
 */

  public RateEpiObjectKeyData getRateEpi( ) {
    return REGetIn;
  }

}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateEpiCreateBulkUdtTemplateItem.java
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
 * Class used to create a RateEpiCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateEpiCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateEpiObjectData RECreateIn;
/**
 *
 * Constructor to create a  RateEpiCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateEpiCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateEpiObjectData RECreateInIn) {
    super(id, context, "RateEpiCreate");
    RECreateIn = RECreateInIn;
  }

  public void translateToMap() {
    if (RECreateIn != null) {
      RECreateIn.resetFlags(true, true);
      addInput("RateEpi", RateEpiObjectHelper.toMap(RECreateIn, new HashMap(), "RateEpi").get("RateEpi"));
    }
  }


/**
 *
 * Sets the RateEpi
 * @param RECreateInIn Value of the RECreateIn
 *
 */

  public void setRateEpi(RateEpiObjectData RECreateInIn) {
    RECreateIn = RECreateInIn;
  }

  public void translateFromMap() {
    RECreateIn = RateEpiObjectHelper.fromMap(inputMap, "RateEpi");
  }

/**
 *
 * Gets the RateEpi
 * @return Value of the RateEpi
 *
 */

  public RateEpiObjectData getRateEpi( ) {
    return RECreateIn;
  }

}

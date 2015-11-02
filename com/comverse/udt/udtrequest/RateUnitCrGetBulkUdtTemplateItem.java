/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUnitCrGetBulkUdtTemplateItem.java
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
 * Class used to create a RateUnitCrGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUnitCrGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUnitCrObjectKeyData rucGetIn;
/**
 *
 * Constructor to create a  RateUnitCrGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUnitCrGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUnitCrObjectKeyData rucGetInIn) {
    super(id, context, "RateUnitCrGet");
    rucGetIn = rucGetInIn;
  }

  public void translateToMap() {
    if (rucGetIn != null) {
      rucGetIn.resetFlags(true, true);
      addInput("RateUnitCr", RateUnitCrObjectKeyHelper.toMap(rucGetIn, new HashMap(), "RateUnitCrObjectKeyData").get("RateUnitCrObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateUnitCr
 * @param rucGetInIn Value of the rucGetIn
 *
 */

  public void setRateUnitCr(RateUnitCrObjectKeyData rucGetInIn) {
    rucGetIn = rucGetInIn;
  }

  public void translateFromMap() {
    rucGetIn = RateUnitCrObjectKeyHelper.fromMap(inputMap, "RateUnitCr");
  }

/**
 *
 * Gets the RateUnitCr
 * @return Value of the RateUnitCr
 *
 */

  public RateUnitCrObjectKeyData getRateUnitCr( ) {
    return rucGetIn;
  }

}

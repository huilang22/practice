/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateNrcGetBulkUdtTemplateItem.java
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
 * Class used to create a RateNrcGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RateNrcGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateNrcObjectKeyData rnrcGetIn;
/**
 *
 * Constructor to create a  RateNrcGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateNrcGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RateNrcObjectKeyData rnrcGetInIn) {
    super(id, context, "RateNrcGet");
    rnrcGetIn = rnrcGetInIn;
  }

  public void translateToMap() {
    if (rnrcGetIn != null) {
      rnrcGetIn.resetFlags(true, true);
      addInput("RateNrc", RateNrcObjectKeyHelper.toMap(rnrcGetIn, new HashMap(), "RateNrcObjectKeyData").get("RateNrcObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateNrc
 * @param rnrcGetInIn Value of the rnrcGetIn
 *
 */

  public void setRateNrc(RateNrcObjectKeyData rnrcGetInIn) {
    rnrcGetIn = rnrcGetInIn;
  }

  public void translateFromMap() {
    rnrcGetIn = RateNrcObjectKeyHelper.fromMap(inputMap, "RateNrc");
  }

/**
 *
 * Gets the RateNrc
 * @return Value of the RateNrc
 *
 */

  public RateNrcObjectKeyData getRateNrc( ) {
    return rnrcGetIn;
  }

}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateRcDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RateRcDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RateRcDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RACObjectKeyData RACDeleteIn;
/**
 *
 * Constructor to create a  RateRcDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateRcDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RACObjectKeyData RACDeleteInIn) {
    super(id, context, "RateRcDelete");
    RACDeleteIn = RACDeleteInIn;
  }

  public void translateToMap() {
    if (RACDeleteIn != null) {
      RACDeleteIn.resetFlags(true, true);
      addInput("RateRc", RACObjectKeyHelper.toMap(RACDeleteIn, new HashMap(), "RACObjectKeyData").get("RACObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateRc
 * @param RACDeleteInIn Value of the RACDeleteIn
 *
 */

  public void setRateRc(RACObjectKeyData RACDeleteInIn) {
    RACDeleteIn = RACDeleteInIn;
  }

  public void translateFromMap() {
    RACDeleteIn = RACObjectKeyHelper.fromMap(inputMap, "RateRc");
  }

/**
 *
 * Gets the RateRc
 * @return Value of the RateRc
 *
 */

  public RACObjectKeyData getRateRc( ) {
    return RACDeleteIn;
  }

}

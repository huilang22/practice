/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageDistanceBandGetBulkUdtTemplateItem.java
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
 * Class used to create a UsageDistanceBandGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageDistanceBandGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageDistBandObjectKeyData UDBGetIn;
/**
 *
 * Constructor to create a  UsageDistanceBandGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageDistanceBandGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageDistBandObjectKeyData UDBGetInIn) {
    super(id, context, "UsageDistanceBandGet");
    UDBGetIn = UDBGetInIn;
  }

  public void translateToMap() {
    if (UDBGetIn != null) {
      UDBGetIn.resetFlags(true, true);
      addInput("UsageDistanceBand", UsageDistBandObjectKeyHelper.toMap(UDBGetIn, new HashMap(), "UsageDistBandObjectKeyData").get("UsageDistBandObjectKeyData"));
    }
  }


/**
 *
 * Sets the UsageDistanceBand
 * @param UDBGetInIn Value of the UDBGetIn
 *
 */

  public void setUsageDistanceBand(UsageDistBandObjectKeyData UDBGetInIn) {
    UDBGetIn = UDBGetInIn;
  }

  public void translateFromMap() {
    UDBGetIn = UsageDistBandObjectKeyHelper.fromMap(inputMap, "UsageDistanceBand");
  }

/**
 *
 * Gets the UsageDistanceBand
 * @return Value of the UsageDistanceBand
 *
 */

  public UsageDistBandObjectKeyData getUsageDistanceBand( ) {
    return UDBGetIn;
  }

}

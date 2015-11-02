/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a UsageTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeObjectData UTCrIn;
/**
 *
 * Constructor to create a  UsageTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeObjectData UTCrInIn) {
    super(id, context, "UsageTypeCreate");
    UTCrIn = UTCrInIn;
  }

  public void translateToMap() {
    if (UTCrIn != null) {
      UTCrIn.resetFlags(true, true);
      addInput("UsageType", UsageTypeObjectHelper.toMap(UTCrIn, new HashMap(), "UsageType").get("UsageType"));
    }
  }


/**
 *
 * Sets the UsageType
 * @param UTCrInIn Value of the UTCrIn
 *
 */

  public void setUsageType(UsageTypeObjectData UTCrInIn) {
    UTCrIn = UTCrInIn;
  }

  public void translateFromMap() {
    UTCrIn = UsageTypeObjectHelper.fromMap(inputMap, "UsageType");
  }

/**
 *
 * Gets the UsageType
 * @return Value of the UsageType
 *
 */

  public UsageTypeObjectData getUsageType( ) {
    return UTCrIn;
  }

}

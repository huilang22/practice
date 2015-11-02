/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrUsageTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a RbrUsageTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrUsageTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrUsageTypeObjectData RbrUsgTypeCrIn;
/**
 *
 * Constructor to create a  RbrUsageTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrUsageTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrUsageTypeObjectData RbrUsgTypeCrInIn) {
    super(id, context, "RbrUsageTypeCreate");
    RbrUsgTypeCrIn = RbrUsgTypeCrInIn;
  }

  public void translateToMap() {
    if (RbrUsgTypeCrIn != null) {
      RbrUsgTypeCrIn.resetFlags(true, true);
      addInput("RbrUsageType", RbrUsageTypeObjectHelper.toMap(RbrUsgTypeCrIn, new HashMap(), "RbrUsageType").get("RbrUsageType"));
    }
  }


/**
 *
 * Sets the RbrUsageType
 * @param RbrUsgTypeCrInIn Value of the RbrUsgTypeCrIn
 *
 */

  public void setRbrUsageType(RbrUsageTypeObjectData RbrUsgTypeCrInIn) {
    RbrUsgTypeCrIn = RbrUsgTypeCrInIn;
  }

  public void translateFromMap() {
    RbrUsgTypeCrIn = RbrUsageTypeObjectHelper.fromMap(inputMap, "RbrUsageType");
  }

/**
 *
 * Gets the RbrUsageType
 * @return Value of the RbrUsageType
 *
 */

  public RbrUsageTypeObjectData getRbrUsageType( ) {
    return RbrUsgTypeCrIn;
  }

}

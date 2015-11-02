/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrUsageTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RbrUsageTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrUsageTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrUsageTypeObjectData RbrUsgTypeUpdIn;
/**
 *
 * Constructor to create a  RbrUsageTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrUsageTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrUsageTypeObjectData RbrUsgTypeUpdInIn) {
    super(id, context, "RbrUsageTypeUpdate");
    RbrUsgTypeUpdIn = RbrUsgTypeUpdInIn;
  }

  public void translateToMap() {
    if (RbrUsgTypeUpdIn != null) {
      RbrUsgTypeUpdIn.resetFlags(true, true);
      addInput("RbrUsageType", RbrUsageTypeObjectHelper.toMap(RbrUsgTypeUpdIn, new HashMap(), "RbrUsageType").get("RbrUsageType"));
    }
  }


/**
 *
 * Sets the RbrUsageType
 * @param RbrUsgTypeUpdInIn Value of the RbrUsgTypeUpdIn
 *
 */

  public void setRbrUsageType(RbrUsageTypeObjectData RbrUsgTypeUpdInIn) {
    RbrUsgTypeUpdIn = RbrUsgTypeUpdInIn;
  }

  public void translateFromMap() {
    RbrUsgTypeUpdIn = RbrUsageTypeObjectHelper.fromMap(inputMap, "RbrUsageType");
  }

/**
 *
 * Gets the RbrUsageType
 * @return Value of the RbrUsageType
 *
 */

  public RbrUsageTypeObjectData getRbrUsageType( ) {
    return RbrUsgTypeUpdIn;
  }

}

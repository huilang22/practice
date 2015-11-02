/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UsageTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeObjectData UTUpdIn;
/**
 *
 * Constructor to create a  UsageTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeObjectData UTUpdInIn) {
    super(id, context, "UsageTypeUpdate");
    UTUpdIn = UTUpdInIn;
  }

  public void translateToMap() {
    if (UTUpdIn != null) {
      UTUpdIn.resetFlags(true, true);
      addInput("UsageType", UsageTypeObjectHelper.toMap(UTUpdIn, new HashMap(), "UsageType").get("UsageType"));
    }
  }


/**
 *
 * Sets the UsageType
 * @param UTUpdInIn Value of the UTUpdIn
 *
 */

  public void setUsageType(UsageTypeObjectData UTUpdInIn) {
    UTUpdIn = UTUpdInIn;
  }

  public void translateFromMap() {
    UTUpdIn = UsageTypeObjectHelper.fromMap(inputMap, "UsageType");
  }

/**
 *
 * Gets the UsageType
 * @return Value of the UsageType
 *
 */

  public UsageTypeObjectData getUsageType( ) {
    return UTUpdIn;
  }

}

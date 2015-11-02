/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageUnitsConvertGetBulkUdtTemplateItem.java
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
 * Class used to create a UsageUnitsConvertGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageUnitsConvertGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageUnitsConvertObjectKeyData UsageUnitsConvertGetIn;
/**
 *
 * Constructor to create a  UsageUnitsConvertGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageUnitsConvertGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageUnitsConvertObjectKeyData UsageUnitsConvertGetInIn) {
    super(id, context, "UsageUnitsConvertGet");
    UsageUnitsConvertGetIn = UsageUnitsConvertGetInIn;
  }

  public void translateToMap() {
    if (UsageUnitsConvertGetIn != null) {
      UsageUnitsConvertGetIn.resetFlags(true, true);
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectKeyHelper.toMap(UsageUnitsConvertGetIn, new HashMap(), "UsageUnitsConvertObjectKeyData").get("UsageUnitsConvertObjectKeyData"));
    }
  }


/**
 *
 * Sets the UsageUnitsConvert
 * @param UsageUnitsConvertGetInIn Value of the UsageUnitsConvertGetIn
 *
 */

  public void setUsageUnitsConvert(UsageUnitsConvertObjectKeyData UsageUnitsConvertGetInIn) {
    UsageUnitsConvertGetIn = UsageUnitsConvertGetInIn;
  }

  public void translateFromMap() {
    UsageUnitsConvertGetIn = UsageUnitsConvertObjectKeyHelper.fromMap(inputMap, "UsageUnitsConvert");
  }

/**
 *
 * Gets the UsageUnitsConvert
 * @return Value of the UsageUnitsConvert
 *
 */

  public UsageUnitsConvertObjectKeyData getUsageUnitsConvert( ) {
    return UsageUnitsConvertGetIn;
  }

}

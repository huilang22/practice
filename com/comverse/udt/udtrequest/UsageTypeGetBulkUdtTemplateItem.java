/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a UsageTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeObjectKeyData utGetIn;
/**
 *
 * Constructor to create a  UsageTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeObjectKeyData utGetInIn) {
    super(id, context, "UsageTypeGet");
    utGetIn = utGetInIn;
  }

  public void translateToMap() {
    if (utGetIn != null) {
      utGetIn.resetFlags(true, true);
      addInput("UsageType", UsageTypeObjectKeyHelper.toMap(utGetIn, new HashMap(), "UsageTypeObjectKeyData").get("UsageTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the UsageType
 * @param utGetInIn Value of the utGetIn
 *
 */

  public void setUsageType(UsageTypeObjectKeyData utGetInIn) {
    utGetIn = utGetInIn;
  }

  public void translateFromMap() {
    utGetIn = UsageTypeObjectKeyHelper.fromMap(inputMap, "UsageType");
  }

/**
 *
 * Gets the UsageType
 * @return Value of the UsageType
 *
 */

  public UsageTypeObjectKeyData getUsageType( ) {
    return utGetIn;
  }

}

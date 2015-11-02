/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeDeleteBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a UsageTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeObjectKeyData utDeleteIn;
/**
 *
 * Constructor to create a  UsageTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeObjectKeyData utDeleteInIn) {
    super(id, context, "UsageTypeDelete");
    utDeleteIn = utDeleteInIn;
  }

  public void translateToMap() {
    if (utDeleteIn != null) {
      utDeleteIn.resetFlags(true, true);
      addInput("UsageType", UsageTypeObjectKeyHelper.toMap(utDeleteIn, new HashMap(), "UsageTypeObjectKeyData").get("UsageTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the UsageType
 * @param utDeleteInIn Value of the utDeleteIn
 *
 */

  public void setUsageType(UsageTypeObjectKeyData utDeleteInIn) {
    utDeleteIn = utDeleteInIn;
  }

  public void translateFromMap() {
    utDeleteIn = UsageTypeObjectKeyHelper.fromMap(inputMap, "UsageType");
  }

/**
 *
 * Gets the UsageType
 * @return Value of the UsageType
 *
 */

  public UsageTypeObjectKeyData getUsageType( ) {
    return utDeleteIn;
  }

}

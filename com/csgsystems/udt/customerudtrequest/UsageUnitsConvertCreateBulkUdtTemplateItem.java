/*
 * Generated code DO NOT EDIT
 * Generated file: UsageUnitsConvertCreateBulkUdtTemplateItem.java
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
 * Class used to create a UsageUnitsConvertCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageUnitsConvertCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageUnitsConvertObjectData UsageUnitsConvertCreateIn;
/**
 *
 * Constructor to create a  UsageUnitsConvertCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageUnitsConvertCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageUnitsConvertObjectData UsageUnitsConvertCreateInIn) {
    super(id, context, "UsageUnitsConvertCreate");
    UsageUnitsConvertCreateIn = UsageUnitsConvertCreateInIn;
  }

  public void translateToMap() {
    if (UsageUnitsConvertCreateIn != null) {
      UsageUnitsConvertCreateIn.resetFlags(true, true);
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectHelper.toMap(UsageUnitsConvertCreateIn, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
  }


/**
 *
 * Sets the UsageUnitsConvert
 * @param UsageUnitsConvertCreateInIn Value of the UsageUnitsConvertCreateIn
 *
 */

  public void setUsageUnitsConvert(UsageUnitsConvertObjectData UsageUnitsConvertCreateInIn) {
    UsageUnitsConvertCreateIn = UsageUnitsConvertCreateInIn;
  }

  public void translateFromMap() {
    UsageUnitsConvertCreateIn = UsageUnitsConvertObjectHelper.fromMap(inputMap, "UsageUnitsConvert");
  }

/**
 *
 * Gets the UsageUnitsConvert
 * @return Value of the UsageUnitsConvert
 *
 */

  public UsageUnitsConvertObjectData getUsageUnitsConvert( ) {
    return UsageUnitsConvertCreateIn;
  }

}

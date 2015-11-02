/*
 * Generated code DO NOT EDIT
 * Generated file: UsageUnitsConvertGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageUnitsConvertGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageUnitsConvertGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageUnitsConvertObjectData noOpIn;

/**
 *
 * Constructor to create a   UsageUnitsConvertGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageUnitsConvertGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageUnitsConvertObjectData noOpInIn) {
    super(id, context, "UsageUnitsConvertGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectHelper.toMap(noOpIn, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
  }
/**
 *
 * Sets the  UsageUnitsConvert
 * @param noOpInIn UsageUnitsConvertObjectData to set
 *
 */
  public void setUsageUnitsConvert(UsageUnitsConvertObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageUnitsConvert passed into the constructor
 * @return Simulated response
 *
 */
  public UsageUnitsConvertObjectData getUsageUnitsConvert() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageUnitsConvertObjectHelper.fromMap(inputMap, "UsageUnitsConvert");
  }
}

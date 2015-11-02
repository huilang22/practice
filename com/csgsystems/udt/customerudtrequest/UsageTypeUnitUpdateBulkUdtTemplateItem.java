/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeUnitUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UsageTypeUnitUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeUnitUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeUnitObjectData UsageTypeUnitUpdateIn;
  protected UsageTypeUnitObjectFilter UsageTypeUnitUpdateFilter;
  protected UsageTypeUnitObjectData UsageTypeUnitUpdateGet;
/**
 *
 * Constructor to create a  UsageTypeUnitUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeUnitUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeUnitObjectData UsageTypeUnitUpdateInIn, UsageTypeUnitObjectFilter UsageTypeUnitUpdateFilterIn, UsageTypeUnitObjectData UsageTypeUnitUpdateGetIn) {
    super(id, context, "UsageTypeUnitUpdate");
    UsageTypeUnitUpdateIn = UsageTypeUnitUpdateInIn;
    UsageTypeUnitUpdateFilter = UsageTypeUnitUpdateFilterIn;
    UsageTypeUnitUpdateGet = UsageTypeUnitUpdateGetIn;
  }

  public void translateToMap() {
    if (UsageTypeUnitUpdateIn != null) {
      UsageTypeUnitUpdateIn.resetFlags(true, true);
      addInput("UsageTypeUnit", UsageTypeUnitObjectHelper.toMap(UsageTypeUnitUpdateIn, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
    if (UsageTypeUnitUpdateFilter != null) {
      Integer index =  UsageTypeUnitUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageTypeUnitUpdateFilter", UsageTypeUnitObjectHelper.toMap(UsageTypeUnitUpdateFilter, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
    if (UsageTypeUnitUpdateGet != null) {
      UsageTypeUnitUpdateGet.resetFlags(true, true);
      addInput("UsageTypeUnitUpdateGet", UsageTypeUnitObjectHelper.toMap(UsageTypeUnitUpdateGet, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
  }


/**
 *
 * Sets the UsageTypeUnit
 * @param UsageTypeUnitUpdateInIn Value of the UsageTypeUnitUpdateIn
 *
 */

  public void setUsageTypeUnit(UsageTypeUnitObjectData UsageTypeUnitUpdateInIn) {
    UsageTypeUnitUpdateIn = UsageTypeUnitUpdateInIn;
  }

/**
 *
 * Sets the UsageTypeUnitUpdateFilter
 * @param UsageTypeUnitUpdateFilterIn Value of the UsageTypeUnitUpdateFilter
 *
 */

  public void setUsageTypeUnitUpdateFilter(UsageTypeUnitObjectFilter UsageTypeUnitUpdateFilterIn) {
    UsageTypeUnitUpdateFilter = UsageTypeUnitUpdateFilterIn;
  }

/**
 *
 * Sets the UsageTypeUnitUpdateGet
 * @param UsageTypeUnitUpdateGetIn Value of the UsageTypeUnitUpdateGet
 *
 */

  public void setUsageTypeUnitUpdateGet(UsageTypeUnitObjectData UsageTypeUnitUpdateGetIn) {
    UsageTypeUnitUpdateGet = UsageTypeUnitUpdateGetIn;
  }

  public void translateFromMap() {
    UsageTypeUnitUpdateIn = UsageTypeUnitObjectHelper.fromMap(inputMap, "UsageTypeUnit");
    UsageTypeUnitUpdateFilter = UsageTypeUnitObjectHelper.fromMapFilter(inputMap, "UsageTypeUnitUpdateFilter");
    UsageTypeUnitUpdateGet = UsageTypeUnitObjectHelper.fromMap(inputMap, "UsageTypeUnitUpdateGet");
  }

/**
 *
 * Gets the UsageTypeUnit
 * @return Value of the UsageTypeUnit
 *
 */

  public UsageTypeUnitObjectData getUsageTypeUnit( ) {
    return UsageTypeUnitUpdateIn;
  }

/**
 *
 * Gets the UsageTypeUnitUpdateFilter
 * @return Value of the UsageTypeUnitUpdateFilter
 *
 */

  public UsageTypeUnitObjectFilter getUsageTypeUnitUpdateFilter( ) {
    return UsageTypeUnitUpdateFilter;
  }

/**
 *
 * Gets the UsageTypeUnitUpdateGet
 * @return Value of the UsageTypeUnitUpdateGet
 *
 */

  public UsageTypeUnitObjectData getUsageTypeUnitUpdateGet( ) {
    return UsageTypeUnitUpdateGet;
  }

}

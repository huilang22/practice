/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeSplitUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UsageTypeSplitUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeSplitUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeSplitObjectData UsageTypeSplitUpdateIn;
  protected UsageTypeSplitObjectFilter UsageTypeSplitUpdateFilter;
  protected UsageTypeSplitObjectData UsageTypeSplitUpdateGet;
/**
 *
 * Constructor to create a  UsageTypeSplitUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeSplitUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeSplitObjectData UsageTypeSplitUpdateInIn, UsageTypeSplitObjectFilter UsageTypeSplitUpdateFilterIn, UsageTypeSplitObjectData UsageTypeSplitUpdateGetIn) {
    super(id, context, "UsageTypeSplitUpdate");
    UsageTypeSplitUpdateIn = UsageTypeSplitUpdateInIn;
    UsageTypeSplitUpdateFilter = UsageTypeSplitUpdateFilterIn;
    UsageTypeSplitUpdateGet = UsageTypeSplitUpdateGetIn;
  }

  public void translateToMap() {
    if (UsageTypeSplitUpdateIn != null) {
      UsageTypeSplitUpdateIn.resetFlags(true, true);
      addInput("UsageTypeSplit", UsageTypeSplitObjectHelper.toMap(UsageTypeSplitUpdateIn, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
    if (UsageTypeSplitUpdateFilter != null) {
      Integer index =  UsageTypeSplitUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageTypeSplitUpdateFilter", UsageTypeSplitObjectHelper.toMap(UsageTypeSplitUpdateFilter, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
    if (UsageTypeSplitUpdateGet != null) {
      UsageTypeSplitUpdateGet.resetFlags(true, true);
      addInput("UsageTypeSplitUpdateGet", UsageTypeSplitObjectHelper.toMap(UsageTypeSplitUpdateGet, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
  }


/**
 *
 * Sets the UsageTypeSplit
 * @param UsageTypeSplitUpdateInIn Value of the UsageTypeSplitUpdateIn
 *
 */

  public void setUsageTypeSplit(UsageTypeSplitObjectData UsageTypeSplitUpdateInIn) {
    UsageTypeSplitUpdateIn = UsageTypeSplitUpdateInIn;
  }

/**
 *
 * Sets the UsageTypeSplitUpdateFilter
 * @param UsageTypeSplitUpdateFilterIn Value of the UsageTypeSplitUpdateFilter
 *
 */

  public void setUsageTypeSplitUpdateFilter(UsageTypeSplitObjectFilter UsageTypeSplitUpdateFilterIn) {
    UsageTypeSplitUpdateFilter = UsageTypeSplitUpdateFilterIn;
  }

/**
 *
 * Sets the UsageTypeSplitUpdateGet
 * @param UsageTypeSplitUpdateGetIn Value of the UsageTypeSplitUpdateGet
 *
 */

  public void setUsageTypeSplitUpdateGet(UsageTypeSplitObjectData UsageTypeSplitUpdateGetIn) {
    UsageTypeSplitUpdateGet = UsageTypeSplitUpdateGetIn;
  }

  public void translateFromMap() {
    UsageTypeSplitUpdateIn = UsageTypeSplitObjectHelper.fromMap(inputMap, "UsageTypeSplit");
    UsageTypeSplitUpdateFilter = UsageTypeSplitObjectHelper.fromMapFilter(inputMap, "UsageTypeSplitUpdateFilter");
    UsageTypeSplitUpdateGet = UsageTypeSplitObjectHelper.fromMap(inputMap, "UsageTypeSplitUpdateGet");
  }

/**
 *
 * Gets the UsageTypeSplit
 * @return Value of the UsageTypeSplit
 *
 */

  public UsageTypeSplitObjectData getUsageTypeSplit( ) {
    return UsageTypeSplitUpdateIn;
  }

/**
 *
 * Gets the UsageTypeSplitUpdateFilter
 * @return Value of the UsageTypeSplitUpdateFilter
 *
 */

  public UsageTypeSplitObjectFilter getUsageTypeSplitUpdateFilter( ) {
    return UsageTypeSplitUpdateFilter;
  }

/**
 *
 * Gets the UsageTypeSplitUpdateGet
 * @return Value of the UsageTypeSplitUpdateGet
 *
 */

  public UsageTypeSplitObjectData getUsageTypeSplitUpdateGet( ) {
    return UsageTypeSplitUpdateGet;
  }

}

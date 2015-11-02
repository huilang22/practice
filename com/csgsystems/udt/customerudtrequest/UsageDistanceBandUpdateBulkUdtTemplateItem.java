/*
 * Generated code DO NOT EDIT
 * Generated file: UsageDistanceBandUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UsageDistanceBandUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageDistanceBandUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageDistBandObjectData UDBUpdateIn;
  protected UsageDistBandObjectFilter UDBUpdateFilter;
  protected UsageDistBandObjectData UDBUpdateGet;
/**
 *
 * Constructor to create a  UsageDistanceBandUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageDistanceBandUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageDistBandObjectData UDBUpdateInIn, UsageDistBandObjectFilter UDBUpdateFilterIn, UsageDistBandObjectData UDBUpdateGetIn) {
    super(id, context, "UsageDistanceBandUpdate");
    UDBUpdateIn = UDBUpdateInIn;
    UDBUpdateFilter = UDBUpdateFilterIn;
    UDBUpdateGet = UDBUpdateGetIn;
  }

  public void translateToMap() {
    if (UDBUpdateIn != null) {
      UDBUpdateIn.resetFlags(true, true);
      addInput("UsageDistanceBand", UsageDistBandObjectHelper.toMap(UDBUpdateIn, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
    if (UDBUpdateFilter != null) {
      Integer index =  UDBUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UDBUpdateFilter", UsageDistBandObjectHelper.toMap(UDBUpdateFilter, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
    if (UDBUpdateGet != null) {
      UDBUpdateGet.resetFlags(true, true);
      addInput("UDBUpdateGet", UsageDistBandObjectHelper.toMap(UDBUpdateGet, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
  }


/**
 *
 * Sets the UsageDistanceBand
 * @param UDBUpdateInIn Value of the UDBUpdateIn
 *
 */

  public void setUsageDistanceBand(UsageDistBandObjectData UDBUpdateInIn) {
    UDBUpdateIn = UDBUpdateInIn;
  }

/**
 *
 * Sets the UDBUpdateFilter
 * @param UDBUpdateFilterIn Value of the UDBUpdateFilter
 *
 */

  public void setUDBUpdateFilter(UsageDistBandObjectFilter UDBUpdateFilterIn) {
    UDBUpdateFilter = UDBUpdateFilterIn;
  }

/**
 *
 * Sets the UDBUpdateGet
 * @param UDBUpdateGetIn Value of the UDBUpdateGet
 *
 */

  public void setUDBUpdateGet(UsageDistBandObjectData UDBUpdateGetIn) {
    UDBUpdateGet = UDBUpdateGetIn;
  }

  public void translateFromMap() {
    UDBUpdateIn = UsageDistBandObjectHelper.fromMap(inputMap, "UsageDistanceBand");
    UDBUpdateFilter = UsageDistBandObjectHelper.fromMapFilter(inputMap, "UDBUpdateFilter");
    UDBUpdateGet = UsageDistBandObjectHelper.fromMap(inputMap, "UDBUpdateGet");
  }

/**
 *
 * Gets the UsageDistanceBand
 * @return Value of the UsageDistanceBand
 *
 */

  public UsageDistBandObjectData getUsageDistanceBand( ) {
    return UDBUpdateIn;
  }

/**
 *
 * Gets the UDBUpdateFilter
 * @return Value of the UDBUpdateFilter
 *
 */

  public UsageDistBandObjectFilter getUDBUpdateFilter( ) {
    return UDBUpdateFilter;
  }

/**
 *
 * Gets the UDBUpdateGet
 * @return Value of the UDBUpdateGet
 *
 */

  public UsageDistBandObjectData getUDBUpdateGet( ) {
    return UDBUpdateGet;
  }

}

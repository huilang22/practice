/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageUnitsConvertUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UsageUnitsConvertUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageUnitsConvertUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageUnitsConvertObjectData UsageUnitsConvertUpdateIn;
  protected UsageUnitsConvertObjectFilter UsageUnitsConvertUpdateFilter;
  protected UsageUnitsConvertObjectData UsageUnitsConvertUpdateGet;
/**
 *
 * Constructor to create a  UsageUnitsConvertUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageUnitsConvertUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageUnitsConvertObjectData UsageUnitsConvertUpdateInIn, UsageUnitsConvertObjectFilter UsageUnitsConvertUpdateFilterIn, UsageUnitsConvertObjectData UsageUnitsConvertUpdateGetIn) {
    super(id, context, "UsageUnitsConvertUpdate");
    UsageUnitsConvertUpdateIn = UsageUnitsConvertUpdateInIn;
    UsageUnitsConvertUpdateFilter = UsageUnitsConvertUpdateFilterIn;
    UsageUnitsConvertUpdateGet = UsageUnitsConvertUpdateGetIn;
  }

  public void translateToMap() {
    if (UsageUnitsConvertUpdateIn != null) {
      UsageUnitsConvertUpdateIn.resetFlags(true, true);
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectHelper.toMap(UsageUnitsConvertUpdateIn, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
    if (UsageUnitsConvertUpdateFilter != null) {
      Integer index =  UsageUnitsConvertUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageUnitsConvertUpdateFilter", UsageUnitsConvertObjectHelper.toMap(UsageUnitsConvertUpdateFilter, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
    if (UsageUnitsConvertUpdateGet != null) {
      UsageUnitsConvertUpdateGet.resetFlags(true, true);
      addInput("UsageUnitsConvertUpdateGet", UsageUnitsConvertObjectHelper.toMap(UsageUnitsConvertUpdateGet, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
  }


/**
 *
 * Sets the UsageUnitsConvert
 * @param UsageUnitsConvertUpdateInIn Value of the UsageUnitsConvertUpdateIn
 *
 */

  public void setUsageUnitsConvert(UsageUnitsConvertObjectData UsageUnitsConvertUpdateInIn) {
    UsageUnitsConvertUpdateIn = UsageUnitsConvertUpdateInIn;
  }

/**
 *
 * Sets the UsageUnitsConvertUpdateFilter
 * @param UsageUnitsConvertUpdateFilterIn Value of the UsageUnitsConvertUpdateFilter
 *
 */

  public void setUsageUnitsConvertUpdateFilter(UsageUnitsConvertObjectFilter UsageUnitsConvertUpdateFilterIn) {
    UsageUnitsConvertUpdateFilter = UsageUnitsConvertUpdateFilterIn;
  }

/**
 *
 * Sets the UsageUnitsConvertUpdateGet
 * @param UsageUnitsConvertUpdateGetIn Value of the UsageUnitsConvertUpdateGet
 *
 */

  public void setUsageUnitsConvertUpdateGet(UsageUnitsConvertObjectData UsageUnitsConvertUpdateGetIn) {
    UsageUnitsConvertUpdateGet = UsageUnitsConvertUpdateGetIn;
  }

  public void translateFromMap() {
    UsageUnitsConvertUpdateIn = UsageUnitsConvertObjectHelper.fromMap(inputMap, "UsageUnitsConvert");
    UsageUnitsConvertUpdateFilter = UsageUnitsConvertObjectHelper.fromMapFilter(inputMap, "UsageUnitsConvertUpdateFilter");
    UsageUnitsConvertUpdateGet = UsageUnitsConvertObjectHelper.fromMap(inputMap, "UsageUnitsConvertUpdateGet");
  }

/**
 *
 * Gets the UsageUnitsConvert
 * @return Value of the UsageUnitsConvert
 *
 */

  public UsageUnitsConvertObjectData getUsageUnitsConvert( ) {
    return UsageUnitsConvertUpdateIn;
  }

/**
 *
 * Gets the UsageUnitsConvertUpdateFilter
 * @return Value of the UsageUnitsConvertUpdateFilter
 *
 */

  public UsageUnitsConvertObjectFilter getUsageUnitsConvertUpdateFilter( ) {
    return UsageUnitsConvertUpdateFilter;
  }

/**
 *
 * Gets the UsageUnitsConvertUpdateGet
 * @return Value of the UsageUnitsConvertUpdateGet
 *
 */

  public UsageUnitsConvertObjectData getUsageUnitsConvertUpdateGet( ) {
    return UsageUnitsConvertUpdateGet;
  }

}

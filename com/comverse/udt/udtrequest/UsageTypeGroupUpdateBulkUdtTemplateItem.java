/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeGroupUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UsageTypeGroupUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeGroupUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeGroupObjectData UTGUpdIn;
  protected UsageTypeGroupObjectFilter UTGUpdateFilter;
  protected UsageTypeGroupObjectData UTGUpdGet;
/**
 *
 * Constructor to create a  UsageTypeGroupUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeGroupUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeGroupObjectData UTGUpdInIn, UsageTypeGroupObjectFilter UTGUpdateFilterIn, UsageTypeGroupObjectData UTGUpdGetIn) {
    super(id, context, "UsageTypeGroupUpdate");
    UTGUpdIn = UTGUpdInIn;
    UTGUpdateFilter = UTGUpdateFilterIn;
    UTGUpdGet = UTGUpdGetIn;
  }

  public void translateToMap() {
    if (UTGUpdIn != null) {
      UTGUpdIn.resetFlags(true, true);
      addInput("UsageTypeGroup", UsageTypeGroupObjectHelper.toMap(UTGUpdIn, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
    if (UTGUpdateFilter != null) {
      Integer index =  UTGUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UTGUpdateFilter", UsageTypeGroupObjectHelper.toMap(UTGUpdateFilter, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
    if (UTGUpdGet != null) {
      UTGUpdGet.resetFlags(true, true);
      addInput("UTGUpdGet", UsageTypeGroupObjectHelper.toMap(UTGUpdGet, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
  }


/**
 *
 * Sets the UsageTypeGroup
 * @param UTGUpdInIn Value of the UTGUpdIn
 *
 */

  public void setUsageTypeGroup(UsageTypeGroupObjectData UTGUpdInIn) {
    UTGUpdIn = UTGUpdInIn;
  }

/**
 *
 * Sets the UTGUpdateFilter
 * @param UTGUpdateFilterIn Value of the UTGUpdateFilter
 *
 */

  public void setUTGUpdateFilter(UsageTypeGroupObjectFilter UTGUpdateFilterIn) {
    UTGUpdateFilter = UTGUpdateFilterIn;
  }

/**
 *
 * Sets the UTGUpdGet
 * @param UTGUpdGetIn Value of the UTGUpdGet
 *
 */

  public void setUTGUpdGet(UsageTypeGroupObjectData UTGUpdGetIn) {
    UTGUpdGet = UTGUpdGetIn;
  }

  public void translateFromMap() {
    UTGUpdIn = UsageTypeGroupObjectHelper.fromMap(inputMap, "UsageTypeGroup");
    UTGUpdateFilter = UsageTypeGroupObjectHelper.fromMapFilter(inputMap, "UTGUpdateFilter");
    UTGUpdGet = UsageTypeGroupObjectHelper.fromMap(inputMap, "UTGUpdGet");
  }

/**
 *
 * Gets the UsageTypeGroup
 * @return Value of the UsageTypeGroup
 *
 */

  public UsageTypeGroupObjectData getUsageTypeGroup( ) {
    return UTGUpdIn;
  }

/**
 *
 * Gets the UTGUpdateFilter
 * @return Value of the UTGUpdateFilter
 *
 */

  public UsageTypeGroupObjectFilter getUTGUpdateFilter( ) {
    return UTGUpdateFilter;
  }

/**
 *
 * Gets the UTGUpdGet
 * @return Value of the UTGUpdGet
 *
 */

  public UsageTypeGroupObjectData getUTGUpdGet( ) {
    return UTGUpdGet;
  }

}

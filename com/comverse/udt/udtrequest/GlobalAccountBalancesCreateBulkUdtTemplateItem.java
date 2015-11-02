/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalAccountBalancesCreateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a GlobalAccountBalancesCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GlobalAccountBalancesCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GlobalAccountBalancesObjectData GABCreateIn;
/**
 *
 * Constructor to create a  GlobalAccountBalancesCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GlobalAccountBalancesCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalAccountBalancesObjectData GABCreateInIn) {
    super(id, context, "GlobalAccountBalancesCreate");
    GABCreateIn = GABCreateInIn;
  }

  public void translateToMap() {
    if (GABCreateIn != null) {
      GABCreateIn.resetFlags(true, true);
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectHelper.toMap(GABCreateIn, new HashMap(), "GlobalAccountBalances").get("GlobalAccountBalances"));
    }
  }


/**
 *
 * Sets the GlobalAccountBalances
 * @param GABCreateInIn Value of the GABCreateIn
 *
 */

  public void setGlobalAccountBalances(GlobalAccountBalancesObjectData GABCreateInIn) {
    GABCreateIn = GABCreateInIn;
  }

  public void translateFromMap() {
    GABCreateIn = GlobalAccountBalancesObjectHelper.fromMap(inputMap, "GlobalAccountBalances");
  }

/**
 *
 * Gets the GlobalAccountBalances
 * @return Value of the GlobalAccountBalances
 *
 */

  public GlobalAccountBalancesObjectData getGlobalAccountBalances( ) {
    return GABCreateIn;
  }

}

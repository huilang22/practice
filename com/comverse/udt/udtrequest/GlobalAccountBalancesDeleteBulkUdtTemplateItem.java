/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalAccountBalancesDeleteBulkUdtTemplateItem.java
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
 * Class used to create a GlobalAccountBalancesDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class GlobalAccountBalancesDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GlobalAccountBalancesObjectKeyData GABDeleteIn;
/**
 *
 * Constructor to create a  GlobalAccountBalancesDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GlobalAccountBalancesDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalAccountBalancesObjectKeyData GABDeleteInIn) {
    super(id, context, "GlobalAccountBalancesDelete");
    GABDeleteIn = GABDeleteInIn;
  }

  public void translateToMap() {
    if (GABDeleteIn != null) {
      GABDeleteIn.resetFlags(true, true);
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectKeyHelper.toMap(GABDeleteIn, new HashMap(), "GlobalAccountBalancesObjectKeyData").get("GlobalAccountBalancesObjectKeyData"));
    }
  }


/**
 *
 * Sets the GlobalAccountBalances
 * @param GABDeleteInIn Value of the GABDeleteIn
 *
 */

  public void setGlobalAccountBalances(GlobalAccountBalancesObjectKeyData GABDeleteInIn) {
    GABDeleteIn = GABDeleteInIn;
  }

  public void translateFromMap() {
    GABDeleteIn = GlobalAccountBalancesObjectKeyHelper.fromMap(inputMap, "GlobalAccountBalances");
  }

/**
 *
 * Gets the GlobalAccountBalances
 * @return Value of the GlobalAccountBalances
 *
 */

  public GlobalAccountBalancesObjectKeyData getGlobalAccountBalances( ) {
    return GABDeleteIn;
  }

}

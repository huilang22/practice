/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalAccountBalancesFindBulkUdtTemplateItem.java
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
 * Class used to create a GlobalAccountBalancesFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GlobalAccountBalancesFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GlobalAccountBalancesObjectFilter GABFindIn;
/**
 *
 * Constructor to create a  GlobalAccountBalancesFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GlobalAccountBalancesFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalAccountBalancesObjectFilter GABFindInIn) {
    super(id, context, "GlobalAccountBalancesFind");
    GABFindIn = GABFindInIn;
  }

  public void translateToMap() {
    if (GABFindIn != null) {
      Integer index =  GABFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectHelper.toMap(GABFindIn, new HashMap(), "GlobalAccountBalances").get("GlobalAccountBalances"));
    }
  }


/**
 *
 * Sets the GlobalAccountBalances
 * @param GABFindInIn Value of the GABFindIn
 *
 */

  public void setGlobalAccountBalances(GlobalAccountBalancesObjectFilter GABFindInIn) {
    GABFindIn = GABFindInIn;
  }

  public void translateFromMap() {
    GABFindIn = GlobalAccountBalancesObjectHelper.fromMapFilter(inputMap, "GlobalAccountBalances");
  }

/**
 *
 * Gets the GlobalAccountBalances
 * @return Value of the GlobalAccountBalances
 *
 */

  public GlobalAccountBalancesObjectFilter getGlobalAccountBalances( ) {
    return GABFindIn;
  }

}

/*
 * Generated code DO NOT EDIT
 * Generated file: GlobalAccountBalancesUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a GlobalAccountBalancesUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GlobalAccountBalancesUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GlobalAccountBalancesObjectData GABUpdateIn;
/**
 *
 * Constructor to create a  GlobalAccountBalancesUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GlobalAccountBalancesUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalAccountBalancesObjectData GABUpdateInIn) {
    super(id, context, "GlobalAccountBalancesUpdate");
    GABUpdateIn = GABUpdateInIn;
  }

  public void translateToMap() {
    if (GABUpdateIn != null) {
      GABUpdateIn.resetFlags(true, true);
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectHelper.toMap(GABUpdateIn, new HashMap(), "GlobalAccountBalances").get("GlobalAccountBalances"));
    }
  }


/**
 *
 * Sets the GlobalAccountBalances
 * @param GABUpdateInIn Value of the GABUpdateIn
 *
 */

  public void setGlobalAccountBalances(GlobalAccountBalancesObjectData GABUpdateInIn) {
    GABUpdateIn = GABUpdateInIn;
  }

  public void translateFromMap() {
    GABUpdateIn = GlobalAccountBalancesObjectHelper.fromMap(inputMap, "GlobalAccountBalances");
  }

/**
 *
 * Gets the GlobalAccountBalances
 * @return Value of the GlobalAccountBalances
 *
 */

  public GlobalAccountBalancesObjectData getGlobalAccountBalances( ) {
    return GABUpdateIn;
  }

}

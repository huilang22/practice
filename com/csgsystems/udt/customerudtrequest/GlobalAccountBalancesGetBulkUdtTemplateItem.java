/*
 * Generated code DO NOT EDIT
 * Generated file: GlobalAccountBalancesGetBulkUdtTemplateItem.java
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
 * Class used to create a GlobalAccountBalancesGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GlobalAccountBalancesGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GlobalAccountBalancesObjectKeyData GABGetIn;
/**
 *
 * Constructor to create a  GlobalAccountBalancesGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GlobalAccountBalancesGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalAccountBalancesObjectKeyData GABGetInIn) {
    super(id, context, "GlobalAccountBalancesGet");
    GABGetIn = GABGetInIn;
  }

  public void translateToMap() {
    if (GABGetIn != null) {
      GABGetIn.resetFlags(true, true);
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectKeyHelper.toMap(GABGetIn, new HashMap(), "GlobalAccountBalancesObjectKeyData").get("GlobalAccountBalancesObjectKeyData"));
    }
  }


/**
 *
 * Sets the GlobalAccountBalances
 * @param GABGetInIn Value of the GABGetIn
 *
 */

  public void setGlobalAccountBalances(GlobalAccountBalancesObjectKeyData GABGetInIn) {
    GABGetIn = GABGetInIn;
  }

  public void translateFromMap() {
    GABGetIn = GlobalAccountBalancesObjectKeyHelper.fromMap(inputMap, "GlobalAccountBalances");
  }

/**
 *
 * Gets the GlobalAccountBalances
 * @return Value of the GlobalAccountBalances
 *
 */

  public GlobalAccountBalancesObjectKeyData getGlobalAccountBalances( ) {
    return GABGetIn;
  }

}

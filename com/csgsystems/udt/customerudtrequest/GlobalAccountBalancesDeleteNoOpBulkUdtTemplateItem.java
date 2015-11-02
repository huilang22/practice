/*
 * Generated code DO NOT EDIT
 * Generated file: GlobalAccountBalancesDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GlobalAccountBalancesDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GlobalAccountBalancesDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GlobalAccountBalancesObjectData noOpIn;

/**
 *
 * Constructor to create a   GlobalAccountBalancesDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GlobalAccountBalancesDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalAccountBalancesObjectData noOpInIn) {
    super(id, context, "GlobalAccountBalancesDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectHelper.toMap(noOpIn, new HashMap(), "GlobalAccountBalances").get("GlobalAccountBalances"));
    }
  }
/**
 *
 * Sets the  GlobalAccountBalances
 * @param noOpInIn GlobalAccountBalancesObjectData to set
 *
 */
  public void setGlobalAccountBalances(GlobalAccountBalancesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GlobalAccountBalances passed into the constructor
 * @return Simulated response
 *
 */
  public GlobalAccountBalancesObjectData getGlobalAccountBalances() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GlobalAccountBalancesObjectHelper.fromMap(inputMap, "GlobalAccountBalances");
  }
}

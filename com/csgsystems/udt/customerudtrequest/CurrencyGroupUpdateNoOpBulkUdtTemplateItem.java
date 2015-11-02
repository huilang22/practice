/*
 * Generated code DO NOT EDIT
 * Generated file: CurrencyGroupUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CurrencyGroupUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CurrencyGroupUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CurrencyGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   CurrencyGroupUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CurrencyGroupUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CurrencyGroupObjectData noOpInIn) {
    super(id, context, "CurrencyGroupUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CurrencyGroup", CurrencyGroupObjectHelper.toMap(noOpIn, new HashMap(), "CurrencyGroup").get("CurrencyGroup"));
    }
  }
/**
 *
 * Sets the  CurrencyGroup
 * @param noOpInIn CurrencyGroupObjectData to set
 *
 */
  public void setCurrencyGroup(CurrencyGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CurrencyGroup passed into the constructor
 * @return Simulated response
 *
 */
  public CurrencyGroupObjectData getCurrencyGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CurrencyGroupObjectHelper.fromMap(inputMap, "CurrencyGroup");
  }
}

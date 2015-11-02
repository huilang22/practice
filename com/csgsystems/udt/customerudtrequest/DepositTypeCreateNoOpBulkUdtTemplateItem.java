/*
 * Generated code DO NOT EDIT
 * Generated file: DepositTypeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DepositTypeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DepositTypeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DepositTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   DepositTypeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DepositTypeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DepositTypeObjectData noOpInIn) {
    super(id, context, "DepositTypeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DepositType", DepositTypeObjectHelper.toMap(noOpIn, new HashMap(), "DepositType").get("DepositType"));
    }
  }
/**
 *
 * Sets the  DepositType
 * @param noOpInIn DepositTypeObjectData to set
 *
 */
  public void setDepositType(DepositTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DepositType passed into the constructor
 * @return Simulated response
 *
 */
  public DepositTypeObjectData getDepositType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DepositTypeObjectHelper.fromMap(inputMap, "DepositType");
  }
}

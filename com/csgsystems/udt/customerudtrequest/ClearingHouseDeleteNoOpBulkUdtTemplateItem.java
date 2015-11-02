/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ClearingHouseDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ClearingHouseDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ClearingHouseObjectData noOpIn;

/**
 *
 * Constructor to create a   ClearingHouseDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ClearingHouseDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ClearingHouseObjectData noOpInIn) {
    super(id, context, "ClearingHouseDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ClearingHouse", ClearingHouseObjectHelper.toMap(noOpIn, new HashMap(), "ClearingHouse").get("ClearingHouse"));
    }
  }
/**
 *
 * Sets the  ClearingHouse
 * @param noOpInIn ClearingHouseObjectData to set
 *
 */
  public void setClearingHouse(ClearingHouseObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ClearingHouse passed into the constructor
 * @return Simulated response
 *
 */
  public ClearingHouseObjectData getClearingHouse() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ClearingHouseObjectHelper.fromMap(inputMap, "ClearingHouse");
  }
}

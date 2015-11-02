/*
 * Generated code DO NOT EDIT
 * Generated file: EquipClassCodeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EquipClassCodeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EquipClassCodeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ECCObjectData noOpIn;

/**
 *
 * Constructor to create a   EquipClassCodeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EquipClassCodeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ECCObjectData noOpInIn) {
    super(id, context, "EquipClassCodeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EquipClassCode", ECCObjectHelper.toMap(noOpIn, new HashMap(), "EquipClassCode").get("EquipClassCode"));
    }
  }
/**
 *
 * Sets the  EquipClassCode
 * @param noOpInIn ECCObjectData to set
 *
 */
  public void setEquipClassCode(ECCObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EquipClassCode passed into the constructor
 * @return Simulated response
 *
 */
  public ECCObjectData getEquipClassCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ECCObjectHelper.fromMap(inputMap, "EquipClassCode");
  }
}

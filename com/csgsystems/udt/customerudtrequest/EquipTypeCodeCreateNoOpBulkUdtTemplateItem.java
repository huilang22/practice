/*
 * Generated code DO NOT EDIT
 * Generated file: EquipTypeCodeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EquipTypeCodeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EquipTypeCodeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ETGObjectData noOpIn;

/**
 *
 * Constructor to create a   EquipTypeCodeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EquipTypeCodeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ETGObjectData noOpInIn) {
    super(id, context, "EquipTypeCodeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EquipTypeCode", ETGObjectHelper.toMap(noOpIn, new HashMap(), "EquipTypeCode").get("EquipTypeCode"));
    }
  }
/**
 *
 * Sets the  EquipTypeCode
 * @param noOpInIn ETGObjectData to set
 *
 */
  public void setEquipTypeCode(ETGObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EquipTypeCode passed into the constructor
 * @return Simulated response
 *
 */
  public ETGObjectData getEquipTypeCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ETGObjectHelper.fromMap(inputMap, "EquipTypeCode");
  }
}

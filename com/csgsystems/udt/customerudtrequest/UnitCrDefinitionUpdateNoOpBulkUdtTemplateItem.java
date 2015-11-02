/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrDefinitionUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UnitCrDefinitionUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitCrDefinitionUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitCrDefinitionObjectData noOpIn;

/**
 *
 * Constructor to create a   UnitCrDefinitionUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitCrDefinitionUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrDefinitionObjectData noOpInIn) {
    super(id, context, "UnitCrDefinitionUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UnitCrDefinition", UnitCrDefinitionObjectHelper.toMap(noOpIn, new HashMap(), "UnitCrDefinition").get("UnitCrDefinition"));
    }
  }
/**
 *
 * Sets the  UnitCrDefinition
 * @param noOpInIn UnitCrDefinitionObjectData to set
 *
 */
  public void setUnitCrDefinition(UnitCrDefinitionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnitCrDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrDefinitionObjectData getUnitCrDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnitCrDefinitionObjectHelper.fromMap(inputMap, "UnitCrDefinition");
  }
}

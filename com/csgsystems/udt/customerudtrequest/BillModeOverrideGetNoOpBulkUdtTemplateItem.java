/*
 * Generated code DO NOT EDIT
 * Generated file: BillModeOverrideGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillModeOverrideGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillModeOverrideGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BMOObjectData noOpIn;

/**
 *
 * Constructor to create a   BillModeOverrideGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillModeOverrideGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BMOObjectData noOpInIn) {
    super(id, context, "BillModeOverrideGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillModeOverride", BMOObjectHelper.toMap(noOpIn, new HashMap(), "BillModeOverride").get("BillModeOverride"));
    }
  }
/**
 *
 * Sets the  BillModeOverride
 * @param noOpInIn BMOObjectData to set
 *
 */
  public void setBillModeOverride(BMOObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillModeOverride passed into the constructor
 * @return Simulated response
 *
 */
  public BMOObjectData getBillModeOverride() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BMOObjectHelper.fromMap(inputMap, "BillModeOverride");
  }
}

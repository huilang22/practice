/*
 * Generated code DO NOT EDIT
 * Generated file: BsdBusinessUnitUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdBusinessUnitUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdBusinessUnitUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdBusinessUnitObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdBusinessUnitUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdBusinessUnitUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdBusinessUnitObjectData noOpInIn) {
    super(id, context, "BsdBusinessUnitUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectHelper.toMap(noOpIn, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }
/**
 *
 * Sets the  BsdBusinessUnit
 * @param noOpInIn BsdBusinessUnitObjectData to set
 *
 */
  public void setBsdBusinessUnit(BsdBusinessUnitObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdBusinessUnit passed into the constructor
 * @return Simulated response
 *
 */
  public BsdBusinessUnitObjectData getBsdBusinessUnit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdBusinessUnitObjectHelper.fromMap(inputMap, "BsdBusinessUnit");
  }
}

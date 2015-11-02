/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationConstraintCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdApplicationConstraintCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationConstraintCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationConstraintObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationConstraintCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationConstraintCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationConstraintObjectData noOpInIn) {
    super(id, context, "BsdApplicationConstraintCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplicationConstraint").get("BsdApplicationConstraint"));
    }
  }
/**
 *
 * Sets the  BsdApplicationConstraint
 * @param noOpInIn BsdApplicationConstraintObjectData to set
 *
 */
  public void setBsdApplicationConstraint(BsdApplicationConstraintObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplicationConstraint passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationConstraintObjectData getBsdApplicationConstraint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationConstraintObjectHelper.fromMap(inputMap, "BsdApplicationConstraint");
  }
}

/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdRelationalConstraintUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdRelationalConstraintUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdRelationalConstraintObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdRelationalConstraintUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdRelationalConstraintUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintObjectData noOpInIn) {
    super(id, context, "BsdRelationalConstraintUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectHelper.toMap(noOpIn, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }
/**
 *
 * Sets the  BsdRelationalConstraint
 * @param noOpInIn BsdRelationalConstraintObjectData to set
 *
 */
  public void setBsdRelationalConstraint(BsdRelationalConstraintObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdRelationalConstraint passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintObjectData getBsdRelationalConstraint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdRelationalConstraintObjectHelper.fromMap(inputMap, "BsdRelationalConstraint");
  }
}

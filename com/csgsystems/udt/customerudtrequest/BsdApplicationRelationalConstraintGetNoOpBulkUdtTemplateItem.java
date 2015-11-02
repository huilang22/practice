/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationRelationalConstraintGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdApplicationRelationalConstraintGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationRelationalConstraintGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationRelationalConstraintObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationRelationalConstraintGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationRelationalConstraintGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationRelationalConstraintObjectData noOpInIn) {
    super(id, context, "BsdApplicationRelationalConstraintGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdApplicationRelationalConstraint", BsdApplicationRelationalConstraintObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplicationRelationalConstraint").get("BsdApplicationRelationalConstraint"));
    }
  }
/**
 *
 * Sets the  BsdApplicationRelationalConstraint
 * @param noOpInIn BsdApplicationRelationalConstraintObjectData to set
 *
 */
  public void setBsdApplicationRelationalConstraint(BsdApplicationRelationalConstraintObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplicationRelationalConstraint passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationRelationalConstraintObjectData getBsdApplicationRelationalConstraint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationRelationalConstraintObjectHelper.fromMap(inputMap, "BsdApplicationRelationalConstraint");
  }
}

/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationAttributeConstraintGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdApplicationAttributeConstraintGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationAttributeConstraintGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationAttributeConstraintObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationAttributeConstraintGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationAttributeConstraintGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationAttributeConstraintObjectData noOpInIn) {
    super(id, context, "BsdApplicationAttributeConstraintGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdApplicationAttributeConstraint", BsdApplicationAttributeConstraintObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplicationAttributeConstraint").get("BsdApplicationAttributeConstraint"));
    }
  }
/**
 *
 * Sets the  BsdApplicationAttributeConstraint
 * @param noOpInIn BsdApplicationAttributeConstraintObjectData to set
 *
 */
  public void setBsdApplicationAttributeConstraint(BsdApplicationAttributeConstraintObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplicationAttributeConstraint passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationAttributeConstraintObjectData getBsdApplicationAttributeConstraint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationAttributeConstraintObjectHelper.fromMap(inputMap, "BsdApplicationAttributeConstraint");
  }
}

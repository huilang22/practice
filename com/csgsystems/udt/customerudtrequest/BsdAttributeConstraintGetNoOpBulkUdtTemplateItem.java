/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdAttributeConstraintGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeConstraintGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeConstraintObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeConstraintGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeConstraintGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintObjectData noOpInIn) {
    super(id, context, "BsdAttributeConstraintGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectHelper.toMap(noOpIn, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }
/**
 *
 * Sets the  BsdAttributeConstraint
 * @param noOpInIn BsdAttributeConstraintObjectData to set
 *
 */
  public void setBsdAttributeConstraint(BsdAttributeConstraintObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttributeConstraint passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintObjectData getBsdAttributeConstraint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeConstraintObjectHelper.fromMap(inputMap, "BsdAttributeConstraint");
  }
}

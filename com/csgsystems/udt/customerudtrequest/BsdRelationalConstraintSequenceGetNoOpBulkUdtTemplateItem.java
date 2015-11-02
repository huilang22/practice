/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdRelationalConstraintSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdRelationalConstraintSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdRelationalConstraintObjectBaseKeyData noOpIn;

/**
 *
 * Constructor to create a   BsdRelationalConstraintSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdRelationalConstraintSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintObjectBaseKeyData noOpInIn) {
    super(id, context, "BsdRelationalConstraintSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseKeyHelper.toMap(noOpIn, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }
/**
 *
 * Sets the  BsdRelationalConstraint
 * @param noOpInIn BsdRelationalConstraintObjectBaseKeyData to set
 *
 */
  public void setBsdRelationalConstraint(BsdRelationalConstraintObjectBaseKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdRelationalConstraint passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintObjectBaseKeyData getBsdRelationalConstraint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdRelationalConstraintObjectBaseKeyHelper.fromMap(inputMap, "BsdRelationalConstraint");
  }
}

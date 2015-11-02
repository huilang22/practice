/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintTypeDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdRelationalConstraintTypeDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdRelationalConstraintTypeDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdRelationalConstraintTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdRelationalConstraintTypeDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdRelationalConstraintTypeDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintTypeObjectData noOpInIn) {
    super(id, context, "BsdRelationalConstraintTypeDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectHelper.toMap(noOpIn, new HashMap(), "BsdRelationalConstraintType").get("BsdRelationalConstraintType"));
    }
  }
/**
 *
 * Sets the  BsdRelationalConstraintType
 * @param noOpInIn BsdRelationalConstraintTypeObjectData to set
 *
 */
  public void setBsdRelationalConstraintType(BsdRelationalConstraintTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdRelationalConstraintType passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintTypeObjectData getBsdRelationalConstraintType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdRelationalConstraintTypeObjectHelper.fromMap(inputMap, "BsdRelationalConstraintType");
  }
}

/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintTypeDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdAttributeConstraintTypeDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeConstraintTypeDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeConstraintTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeConstraintTypeDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeConstraintTypeDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintTypeObjectData noOpInIn) {
    super(id, context, "BsdAttributeConstraintTypeDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectHelper.toMap(noOpIn, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }
/**
 *
 * Sets the  BsdAttributeConstraintType
 * @param noOpInIn BsdAttributeConstraintTypeObjectData to set
 *
 */
  public void setBsdAttributeConstraintType(BsdAttributeConstraintTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttributeConstraintType passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintTypeObjectData getBsdAttributeConstraintType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeConstraintTypeObjectHelper.fromMap(inputMap, "BsdAttributeConstraintType");
  }
}

/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintTypeSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdAttributeConstraintTypeSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeConstraintTypeSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeConstraintTypeObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeConstraintTypeSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeConstraintTypeSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintTypeObjectKeyData noOpInIn) {
    super(id, context, "BsdAttributeConstraintTypeSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }
/**
 *
 * Sets the  BsdAttributeConstraintType
 * @param noOpInIn BsdAttributeConstraintTypeObjectKeyData to set
 *
 */
  public void setBsdAttributeConstraintType(BsdAttributeConstraintTypeObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttributeConstraintType passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintTypeObjectKeyData getBsdAttributeConstraintType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeConstraintTypeObjectKeyHelper.fromMap(inputMap, "BsdAttributeConstraintType");
  }
}

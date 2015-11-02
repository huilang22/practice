/*
 * Generated code DO NOT EDIT
 * Generated file: CtmEnumerationCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a CtmEnumerationCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtmEnumerationCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtmEnumerationObjectData noOpIn;

/**
 *
 * Constructor to create a   CtmEnumerationCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtmEnumerationCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmEnumerationObjectData noOpInIn) {
    super(id, context, "CtmEnumerationCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtmEnumeration", CtmEnumerationObjectHelper.toMap(noOpIn, new HashMap(), "CtmEnumeration").get("CtmEnumeration"));
    }
  }
/**
 *
 * Sets the  CtmEnumeration
 * @param noOpInIn CtmEnumerationObjectData to set
 *
 */
  public void setCtmEnumeration(CtmEnumerationObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtmEnumeration passed into the constructor
 * @return Simulated response
 *
 */
  public CtmEnumerationObjectData getCtmEnumeration() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtmEnumerationObjectHelper.fromMap(inputMap, "CtmEnumeration");
  }
}

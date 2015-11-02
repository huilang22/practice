/*
 * Generated code DO NOT EDIT
 * Generated file: ClassOfServiceCodeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ClassOfServiceCodeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ClassOfServiceCodeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected COSCObjectData noOpIn;

/**
 *
 * Constructor to create a   ClassOfServiceCodeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ClassOfServiceCodeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, COSCObjectData noOpInIn) {
    super(id, context, "ClassOfServiceCodeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ClassOfServiceCode", COSCObjectHelper.toMap(noOpIn, new HashMap(), "ClassOfServiceCode").get("ClassOfServiceCode"));
    }
  }
/**
 *
 * Sets the  ClassOfServiceCode
 * @param noOpInIn COSCObjectData to set
 *
 */
  public void setClassOfServiceCode(COSCObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ClassOfServiceCode passed into the constructor
 * @return Simulated response
 *
 */
  public COSCObjectData getClassOfServiceCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = COSCObjectHelper.fromMap(inputMap, "ClassOfServiceCode");
  }
}

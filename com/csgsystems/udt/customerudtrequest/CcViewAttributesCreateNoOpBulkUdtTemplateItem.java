/*
 * Generated code DO NOT EDIT
 * Generated file: CcViewAttributesCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CcViewAttributesCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CcViewAttributesCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CcViewAttributesObjectData noOpIn;

/**
 *
 * Constructor to create a   CcViewAttributesCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CcViewAttributesCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CcViewAttributesObjectData noOpInIn) {
    super(id, context, "CcViewAttributesCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CcViewAttributes", CcViewAttributesObjectHelper.toMap(noOpIn, new HashMap(), "CcViewAttributes").get("CcViewAttributes"));
    }
  }
/**
 *
 * Sets the  CcViewAttributes
 * @param noOpInIn CcViewAttributesObjectData to set
 *
 */
  public void setCcViewAttributes(CcViewAttributesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CcViewAttributes passed into the constructor
 * @return Simulated response
 *
 */
  public CcViewAttributesObjectData getCcViewAttributes() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CcViewAttributesObjectHelper.fromMap(inputMap, "CcViewAttributes");
  }
}

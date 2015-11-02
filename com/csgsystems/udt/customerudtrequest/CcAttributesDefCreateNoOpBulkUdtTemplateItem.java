/*
 * Generated code DO NOT EDIT
 * Generated file: CcAttributesDefCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CcAttributesDefCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CcAttributesDefCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CcAttributesDefObjectData noOpIn;

/**
 *
 * Constructor to create a   CcAttributesDefCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CcAttributesDefCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CcAttributesDefObjectData noOpInIn) {
    super(id, context, "CcAttributesDefCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CcAttributesDef", CcAttributesDefObjectHelper.toMap(noOpIn, new HashMap(), "CcAttributesDef").get("CcAttributesDef"));
    }
  }
/**
 *
 * Sets the  CcAttributesDef
 * @param noOpInIn CcAttributesDefObjectData to set
 *
 */
  public void setCcAttributesDef(CcAttributesDefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CcAttributesDef passed into the constructor
 * @return Simulated response
 *
 */
  public CcAttributesDefObjectData getCcAttributesDef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CcAttributesDefObjectHelper.fromMap(inputMap, "CcAttributesDef");
  }
}

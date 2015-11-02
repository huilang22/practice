/*
 * Generated code DO NOT EDIT
 * Generated file: CcAttributesDefGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CcAttributesDefGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CcAttributesDefGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CcAttributesDefObjectData noOpIn;

/**
 *
 * Constructor to create a   CcAttributesDefGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CcAttributesDefGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CcAttributesDefObjectData noOpInIn) {
    super(id, context, "CcAttributesDefGet");
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

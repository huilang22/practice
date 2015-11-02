/*
 * Generated code DO NOT EDIT
 * Generated file: CcViewDefCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CcViewDefCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CcViewDefCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CcViewDefObjectData noOpIn;

/**
 *
 * Constructor to create a   CcViewDefCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CcViewDefCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CcViewDefObjectData noOpInIn) {
    super(id, context, "CcViewDefCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CcViewDef", CcViewDefObjectHelper.toMap(noOpIn, new HashMap(), "CcViewDef").get("CcViewDef"));
    }
  }
/**
 *
 * Sets the  CcViewDef
 * @param noOpInIn CcViewDefObjectData to set
 *
 */
  public void setCcViewDef(CcViewDefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CcViewDef passed into the constructor
 * @return Simulated response
 *
 */
  public CcViewDefObjectData getCcViewDef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CcViewDefObjectHelper.fromMap(inputMap, "CcViewDef");
  }
}

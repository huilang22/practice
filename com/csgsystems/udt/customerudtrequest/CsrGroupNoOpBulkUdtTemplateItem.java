/*
 * Generated code DO NOT EDIT
 * Generated file: CsrGroupNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a CsrGroupNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CsrGroupNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CsrGroupOutputData noOpIn;

/**
 *
 * Constructor to create a   CsrGroupNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CsrGroupNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrGroupOutputData noOpInIn) {
    super(id, context, "CsrGroup");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CsrGroupOutputData", CsrGroupOutputHelper.toMap(noOpIn).get("CsrGroupOutputData"));
    }
  }
/**
 *
 * Sets the  CsrGroupOutputData
 * @param noOpInIn CsrGroupOutputData to set
 *
 */
  public void setCsrGroupOutputData(CsrGroupOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CsrGroupOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public CsrGroupOutputData getCsrGroupOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CsrGroupOutputHelper.fromMap(inputMap);
  }
}

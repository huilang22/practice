/*
 * Generated code DO NOT EDIT
 * Generated file: CsrAccountSegmentCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CsrAccountSegmentCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CsrAccountSegmentCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CsrAccountSegmentObjectData noOpIn;

/**
 *
 * Constructor to create a   CsrAccountSegmentCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CsrAccountSegmentCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrAccountSegmentObjectData noOpInIn) {
    super(id, context, "CsrAccountSegmentCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CsrAccountSegment", CsrAccountSegmentObjectHelper.toMap(noOpIn, new HashMap(), "CsrAccountSegment").get("CsrAccountSegment"));
    }
  }
/**
 *
 * Sets the  CsrAccountSegment
 * @param noOpInIn CsrAccountSegmentObjectData to set
 *
 */
  public void setCsrAccountSegment(CsrAccountSegmentObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CsrAccountSegment passed into the constructor
 * @return Simulated response
 *
 */
  public CsrAccountSegmentObjectData getCsrAccountSegment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CsrAccountSegmentObjectHelper.fromMap(inputMap, "CsrAccountSegment");
  }
}

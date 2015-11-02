/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrAccountSegmentDeleteNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a CsrAccountSegmentDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CsrAccountSegmentDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CsrAccountSegmentObjectData noOpIn;

/**
 *
 * Constructor to create a   CsrAccountSegmentDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CsrAccountSegmentDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrAccountSegmentObjectData noOpInIn) {
    super(id, context, "CsrAccountSegmentDelete");
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

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupFunctionGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CsrGroupFunctionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CsrGroupFunctionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CsrGroupFunctionObjectData noOpIn;

/**
 *
 * Constructor to create a   CsrGroupFunctionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CsrGroupFunctionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrGroupFunctionObjectData noOpInIn) {
    super(id, context, "CsrGroupFunctionGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CsrGroupFunction", CsrGroupFunctionObjectHelper.toMap(noOpIn, new HashMap(), "CsrGroupFunction").get("CsrGroupFunction"));
    }
  }
/**
 *
 * Sets the  CsrGroupFunction
 * @param noOpInIn CsrGroupFunctionObjectData to set
 *
 */
  public void setCsrGroupFunction(CsrGroupFunctionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CsrGroupFunction passed into the constructor
 * @return Simulated response
 *
 */
  public CsrGroupFunctionObjectData getCsrGroupFunction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CsrGroupFunctionObjectHelper.fromMap(inputMap, "CsrGroupFunction");
  }
}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupNoOpBulkUdtTemplateItem.java
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
      addInput("CsrGroupOutputData", CsrGroupOutputHelper.toMap(noOpIn));
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

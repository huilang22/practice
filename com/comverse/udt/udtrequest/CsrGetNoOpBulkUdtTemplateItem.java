/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CsrGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CsrGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CsrObjectData noOpIn;

/**
 *
 * Constructor to create a   CsrGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CsrGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrObjectData noOpInIn) {
    super(id, context, "CsrGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Csr", CsrObjectHelper.toMap(noOpIn, new HashMap(), "Csr").get("Csr"));
    }
  }
/**
 *
 * Sets the  Csr
 * @param noOpInIn CsrObjectData to set
 *
 */
  public void setCsr(CsrObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Csr passed into the constructor
 * @return Simulated response
 *
 */
  public CsrObjectData getCsr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CsrObjectHelper.fromMap(inputMap, "Csr");
  }
}

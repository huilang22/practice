/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExtendedDataParamCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExtendedDataParamCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected XPDObjectData noOpIn;

/**
 *
 * Constructor to create a   ExtendedDataParamCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExtendedDataParamCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, XPDObjectData noOpInIn) {
    super(id, context, "ExtendedDataParamCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(noOpIn, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }
/**
 *
 * Sets the  ExtendedDataParam
 * @param noOpInIn XPDObjectData to set
 *
 */
  public void setExtendedDataParam(XPDObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExtendedDataParam passed into the constructor
 * @return Simulated response
 *
 */
  public XPDObjectData getExtendedDataParam() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = XPDObjectHelper.fromMap(inputMap, "ExtendedDataParam");
  }
}

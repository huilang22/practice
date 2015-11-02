/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a CtmParamGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtmParamGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtmParamObjectData noOpIn;

/**
 *
 * Constructor to create a   CtmParamGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtmParamGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmParamObjectData noOpInIn) {
    super(id, context, "CtmParamGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtmParam", CtmParamObjectHelper.toMap(noOpIn, new HashMap(), "CtmParam").get("CtmParam"));
    }
  }
/**
 *
 * Sets the  CtmParam
 * @param noOpInIn CtmParamObjectData to set
 *
 */
  public void setCtmParam(CtmParamObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtmParam passed into the constructor
 * @return Simulated response
 *
 */
  public CtmParamObjectData getCtmParam() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtmParamObjectHelper.fromMap(inputMap, "CtmParam");
  }
}

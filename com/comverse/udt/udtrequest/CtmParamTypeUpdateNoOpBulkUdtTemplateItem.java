/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamTypeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtmParamTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtmParamTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtmParamTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   CtmParamTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtmParamTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmParamTypeObjectData noOpInIn) {
    super(id, context, "CtmParamTypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtmParamType", CtmParamTypeObjectHelper.toMap(noOpIn, new HashMap(), "CtmParamType").get("CtmParamType"));
    }
  }
/**
 *
 * Sets the  CtmParamType
 * @param noOpInIn CtmParamTypeObjectData to set
 *
 */
  public void setCtmParamType(CtmParamTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtmParamType passed into the constructor
 * @return Simulated response
 *
 */
  public CtmParamTypeObjectData getCtmParamType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtmParamTypeObjectHelper.fromMap(inputMap, "CtmParamType");
  }
}

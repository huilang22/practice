/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsHlrGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsHlrGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsHlrGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsHlrObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsHlrGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsHlrGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsHlrObjectData noOpInIn) {
    super(id, context, "InvsHlrGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsHlr", InvsHlrObjectHelper.toMap(noOpIn, new HashMap(), "InvsHlr").get("InvsHlr"));
    }
  }
/**
 *
 * Sets the  InvsHlr
 * @param noOpInIn InvsHlrObjectData to set
 *
 */
  public void setInvsHlr(InvsHlrObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsHlr passed into the constructor
 * @return Simulated response
 *
 */
  public InvsHlrObjectData getInvsHlr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsHlrObjectHelper.fromMap(inputMap, "InvsHlr");
  }
}

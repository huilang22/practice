/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatDeleteNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcFormatDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcFormatDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcFormatObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcFormatDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcFormatDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFormatObjectData noOpInIn) {
    super(id, context, "CtcFormatDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcFormat", CtcFormatObjectHelper.toMap(noOpIn, new HashMap(), "CtcFormat").get("CtcFormat"));
    }
  }
/**
 *
 * Sets the  CtcFormat
 * @param noOpInIn CtcFormatObjectData to set
 *
 */
  public void setCtcFormat(CtcFormatObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcFormat passed into the constructor
 * @return Simulated response
 *
 */
  public CtcFormatObjectData getCtcFormat() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcFormatObjectHelper.fromMap(inputMap, "CtcFormat");
  }
}

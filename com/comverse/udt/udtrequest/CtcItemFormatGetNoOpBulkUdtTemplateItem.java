/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemFormatGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcItemFormatGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcItemFormatGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcItemFormatObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcItemFormatGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcItemFormatGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemFormatObjectData noOpInIn) {
    super(id, context, "CtcItemFormatGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcItemFormat", CtcItemFormatObjectHelper.toMap(noOpIn, new HashMap(), "CtcItemFormat").get("CtcItemFormat"));
    }
  }
/**
 *
 * Sets the  CtcItemFormat
 * @param noOpInIn CtcItemFormatObjectData to set
 *
 */
  public void setCtcItemFormat(CtcItemFormatObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcItemFormat passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemFormatObjectData getCtcItemFormat() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcItemFormatObjectHelper.fromMap(inputMap, "CtcItemFormat");
  }
}

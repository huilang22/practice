/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LineOfBusinessRefGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LineOfBusinessRefGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LineOfBusinessRefGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LineOfBusinessRefObjectData noOpIn;

/**
 *
 * Constructor to create a   LineOfBusinessRefGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LineOfBusinessRefGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LineOfBusinessRefObjectData noOpInIn) {
    super(id, context, "LineOfBusinessRefGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("LineOfBusinessRef", LineOfBusinessRefObjectHelper.toMap(noOpIn, new HashMap(), "LineOfBusinessRef").get("LineOfBusinessRef"));
    }
  }
/**
 *
 * Sets the  LineOfBusinessRef
 * @param noOpInIn LineOfBusinessRefObjectData to set
 *
 */
  public void setLineOfBusinessRef(LineOfBusinessRefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LineOfBusinessRef passed into the constructor
 * @return Simulated response
 *
 */
  public LineOfBusinessRefObjectData getLineOfBusinessRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LineOfBusinessRefObjectHelper.fromMap(inputMap, "LineOfBusinessRef");
  }
}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LineOfBusinessValuesGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LineOfBusinessValuesGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LineOfBusinessValuesGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LineOfBusinessValuesObjectData noOpIn;

/**
 *
 * Constructor to create a   LineOfBusinessValuesGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LineOfBusinessValuesGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LineOfBusinessValuesObjectData noOpInIn) {
    super(id, context, "LineOfBusinessValuesGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("LineOfBusinessValues", LineOfBusinessValuesObjectHelper.toMap(noOpIn, new HashMap(), "LineOfBusinessValues").get("LineOfBusinessValues"));
    }
  }
/**
 *
 * Sets the  LineOfBusinessValues
 * @param noOpInIn LineOfBusinessValuesObjectData to set
 *
 */
  public void setLineOfBusinessValues(LineOfBusinessValuesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LineOfBusinessValues passed into the constructor
 * @return Simulated response
 *
 */
  public LineOfBusinessValuesObjectData getLineOfBusinessValues() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LineOfBusinessValuesObjectHelper.fromMap(inputMap, "LineOfBusinessValues");
  }
}

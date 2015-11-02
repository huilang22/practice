/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmDataGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtmDataGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtmDataGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtmDataRowData noOpIn;

/**
 *
 * Constructor to create a   CtmDataGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtmDataGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmDataRowData noOpInIn) {
    super(id, context, "CtmDataGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtmData", CtmDataRowHelper.toMap(noOpIn, new HashMap(), "CtmData").get("CtmData"));
    }
  }
/**
 *
 * Sets the  CtmData
 * @param noOpInIn CtmDataRowData to set
 *
 */
  public void setCtmData(CtmDataRowData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtmData passed into the constructor
 * @return Simulated response
 *
 */
  public CtmDataRowData getCtmData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtmDataRowHelper.fromMap(inputMap, "CtmData");
  }
}

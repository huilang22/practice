/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmDataCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtmDataCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtmDataCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtmDataRowData noOpIn;

/**
 *
 * Constructor to create a   CtmDataCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtmDataCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmDataRowData noOpInIn) {
    super(id, context, "CtmDataCreate");
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

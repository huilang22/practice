/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ReverseBulkAdjustmentGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ReverseBulkAdjustmentGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ReverseBulkAdjustmentGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ReverseBulkAdjustmentGetOutputData noOpIn;

/**
 *
 * Constructor to create a   ReverseBulkAdjustmentGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ReverseBulkAdjustmentGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ReverseBulkAdjustmentGetOutputData noOpInIn) {
    super(id, context, "ReverseBulkAdjustmentGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ReverseBulkAdjustmentGetOutputData", ReverseBulkAdjustmentGetOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  ReverseBulkAdjustmentGetOutputData
 * @param noOpInIn ReverseBulkAdjustmentGetOutputData to set
 *
 */
  public void setReverseBulkAdjustmentGetOutputData(ReverseBulkAdjustmentGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ReverseBulkAdjustmentGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public ReverseBulkAdjustmentGetOutputData getReverseBulkAdjustmentGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ReverseBulkAdjustmentGetOutputHelper.fromMap(inputMap);
  }
}

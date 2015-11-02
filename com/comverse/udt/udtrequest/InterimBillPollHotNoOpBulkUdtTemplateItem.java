/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillPollHotNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a InterimBillPollHotNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InterimBillPollHotNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InterimBillPollHotOutputData noOpIn;

/**
 *
 * Constructor to create a   InterimBillPollHotNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InterimBillPollHotNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InterimBillPollHotOutputData noOpInIn) {
    super(id, context, "InterimBillPollHot");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InterimBillPollHotOutputData", InterimBillPollHotOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  InterimBillPollHotOutputData
 * @param noOpInIn InterimBillPollHotOutputData to set
 *
 */
  public void setInterimBillPollHotOutputData(InterimBillPollHotOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InterimBillPollHotOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InterimBillPollHotOutputData getInterimBillPollHotOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InterimBillPollHotOutputHelper.fromMap(inputMap);
  }
}

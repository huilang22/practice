/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoActionSelectNumsNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvAutoActionSelectNumsNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvAutoActionSelectNumsNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvAutoActionSelectNumsOutputData noOpIn;

/**
 *
 * Constructor to create a   InvAutoActionSelectNumsNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvAutoActionSelectNumsNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvAutoActionSelectNumsOutputData noOpInIn) {
    super(id, context, "InvAutoActionSelectNums");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvAutoActionSelectNumsOutputData", InvAutoActionSelectNumsOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  InvAutoActionSelectNumsOutputData
 * @param noOpInIn InvAutoActionSelectNumsOutputData to set
 *
 */
  public void setInvAutoActionSelectNumsOutputData(InvAutoActionSelectNumsOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvAutoActionSelectNumsOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvAutoActionSelectNumsOutputData getInvAutoActionSelectNumsOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvAutoActionSelectNumsOutputHelper.fromMap(inputMap);
  }
}

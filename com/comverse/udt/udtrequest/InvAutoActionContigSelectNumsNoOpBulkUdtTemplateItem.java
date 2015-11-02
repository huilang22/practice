/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoActionContigSelectNumsNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvAutoActionContigSelectNumsNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvAutoActionContigSelectNumsNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvAutoActionContigSelectNumsOutputData noOpIn;

/**
 *
 * Constructor to create a   InvAutoActionContigSelectNumsNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvAutoActionContigSelectNumsNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvAutoActionContigSelectNumsOutputData noOpInIn) {
    super(id, context, "InvAutoActionContigSelectNums");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvAutoActionContigSelectNumsOutputData", InvAutoActionContigSelectNumsOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  InvAutoActionContigSelectNumsOutputData
 * @param noOpInIn InvAutoActionContigSelectNumsOutputData to set
 *
 */
  public void setInvAutoActionContigSelectNumsOutputData(InvAutoActionContigSelectNumsOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvAutoActionContigSelectNumsOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvAutoActionContigSelectNumsOutputData getInvAutoActionContigSelectNumsOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvAutoActionContigSelectNumsOutputHelper.fromMap(inputMap);
  }
}

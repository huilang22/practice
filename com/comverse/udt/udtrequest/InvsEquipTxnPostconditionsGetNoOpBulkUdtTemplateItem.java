/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPostconditionsGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsEquipTxnPostconditionsGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipTxnPostconditionsGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipTxnPostconditionsObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsEquipTxnPostconditionsGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipTxnPostconditionsGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipTxnPostconditionsObjectData noOpInIn) {
    super(id, context, "InvsEquipTxnPostconditionsGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectHelper.toMap(noOpIn, new HashMap(), "InvsEquipTxnPostconditions").get("InvsEquipTxnPostconditions"));
    }
  }
/**
 *
 * Sets the  InvsEquipTxnPostconditions
 * @param noOpInIn InvsEquipTxnPostconditionsObjectData to set
 *
 */
  public void setInvsEquipTxnPostconditions(InvsEquipTxnPostconditionsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsEquipTxnPostconditions passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipTxnPostconditionsObjectData getInvsEquipTxnPostconditions() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsEquipTxnPostconditionsObjectHelper.fromMap(inputMap, "InvsEquipTxnPostconditions");
  }
}

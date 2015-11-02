/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillDispatchMethodGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillDispatchMethodGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillDispatchMethodGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillDispatchMethodObjectData noOpIn;

/**
 *
 * Constructor to create a   BillDispatchMethodGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillDispatchMethodGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillDispatchMethodObjectData noOpInIn) {
    super(id, context, "BillDispatchMethodGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillDispatchMethod", BillDispatchMethodObjectHelper.toMap(noOpIn, new HashMap(), "BillDispatchMethod").get("BillDispatchMethod"));
    }
  }
/**
 *
 * Sets the  BillDispatchMethod
 * @param noOpInIn BillDispatchMethodObjectData to set
 *
 */
  public void setBillDispatchMethod(BillDispatchMethodObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillDispatchMethod passed into the constructor
 * @return Simulated response
 *
 */
  public BillDispatchMethodObjectData getBillDispatchMethod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillDispatchMethodObjectHelper.fromMap(inputMap, "BillDispatchMethod");
  }
}

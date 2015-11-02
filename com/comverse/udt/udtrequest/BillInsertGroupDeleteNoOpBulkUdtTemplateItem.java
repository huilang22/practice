/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillInsertGroupDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillInsertGroupDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillInsertGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   BillInsertGroupDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillInsertGroupDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupObjectData noOpInIn) {
    super(id, context, "BillInsertGroupDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillInsertGroup", BillInsertGroupObjectHelper.toMap(noOpIn, new HashMap(), "BillInsertGroup").get("BillInsertGroup"));
    }
  }
/**
 *
 * Sets the  BillInsertGroup
 * @param noOpInIn BillInsertGroupObjectData to set
 *
 */
  public void setBillInsertGroup(BillInsertGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillInsertGroup passed into the constructor
 * @return Simulated response
 *
 */
  public BillInsertGroupObjectData getBillInsertGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillInsertGroupObjectHelper.fromMap(inputMap, "BillInsertGroup");
  }
}

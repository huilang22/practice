/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupMapGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillInsertGroupMapGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillInsertGroupMapGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillInsertGroupMapObjectData noOpIn;

/**
 *
 * Constructor to create a   BillInsertGroupMapGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillInsertGroupMapGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupMapObjectData noOpInIn) {
    super(id, context, "BillInsertGroupMapGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectHelper.toMap(noOpIn, new HashMap(), "BillInsertGroupMap").get("BillInsertGroupMap"));
    }
  }
/**
 *
 * Sets the  BillInsertGroupMap
 * @param noOpInIn BillInsertGroupMapObjectData to set
 *
 */
  public void setBillInsertGroupMap(BillInsertGroupMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillInsertGroupMap passed into the constructor
 * @return Simulated response
 *
 */
  public BillInsertGroupMapObjectData getBillInsertGroupMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillInsertGroupMapObjectHelper.fromMap(inputMap, "BillInsertGroupMap");
  }
}

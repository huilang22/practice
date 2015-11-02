/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillClassGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillClassGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillClassGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BCObjectData noOpIn;

/**
 *
 * Constructor to create a   BillClassGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillClassGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BCObjectData noOpInIn) {
    super(id, context, "BillClassGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillClass", BCObjectHelper.toMap(noOpIn, new HashMap(), "BillClass").get("BillClass"));
    }
  }
/**
 *
 * Sets the  BillClass
 * @param noOpInIn BCObjectData to set
 *
 */
  public void setBillClass(BCObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillClass passed into the constructor
 * @return Simulated response
 *
 */
  public BCObjectData getBillClass() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BCObjectHelper.fromMap(inputMap, "BillClass");
  }
}

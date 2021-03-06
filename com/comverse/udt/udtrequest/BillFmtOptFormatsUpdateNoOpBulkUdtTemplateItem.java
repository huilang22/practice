/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptFormatsUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillFmtOptFormatsUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillFmtOptFormatsUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillFmtOptFormatsObjectData noOpIn;

/**
 *
 * Constructor to create a   BillFmtOptFormatsUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillFmtOptFormatsUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillFmtOptFormatsObjectData noOpInIn) {
    super(id, context, "BillFmtOptFormatsUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(noOpIn, new HashMap(), "BillFmtOptFormats").get("BillFmtOptFormats"));
    }
  }
/**
 *
 * Sets the  BillFmtOptFormats
 * @param noOpInIn BillFmtOptFormatsObjectData to set
 *
 */
  public void setBillFmtOptFormats(BillFmtOptFormatsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillFmtOptFormats passed into the constructor
 * @return Simulated response
 *
 */
  public BillFmtOptFormatsObjectData getBillFmtOptFormats() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillFmtOptFormatsObjectHelper.fromMap(inputMap, "BillFmtOptFormats");
  }
}

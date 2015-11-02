/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptFormatsCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillFmtOptFormatsCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillFmtOptFormatsCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillFmtOptFormatsObjectData noOpIn;

/**
 *
 * Constructor to create a   BillFmtOptFormatsCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillFmtOptFormatsCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillFmtOptFormatsObjectData noOpInIn) {
    super(id, context, "BillFmtOptFormatsCreate");
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

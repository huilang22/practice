/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillPeriodGetBulkUdtTemplateItem.java
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
 * Class used to create a BillPeriodGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BillPeriodGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BPObjectKeyData BPGetIn;
/**
 *
 * Constructor to create a  BillPeriodGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillPeriodGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BPObjectKeyData BPGetInIn) {
    super(id, context, "BillPeriodGet");
    BPGetIn = BPGetInIn;
  }

  public void translateToMap() {
    if (BPGetIn != null) {
      BPGetIn.resetFlags(true, true);
      addInput("BillPeriod", BPObjectKeyHelper.toMap(BPGetIn, new HashMap(), "BPObjectKeyData").get("BPObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillPeriod
 * @param BPGetInIn Value of the BPGetIn
 *
 */

  public void setBillPeriod(BPObjectKeyData BPGetInIn) {
    BPGetIn = BPGetInIn;
  }

  public void translateFromMap() {
    BPGetIn = BPObjectKeyHelper.fromMap(inputMap, "BillPeriod");
  }

/**
 *
 * Gets the BillPeriod
 * @return Value of the BillPeriod
 *
 */

  public BPObjectKeyData getBillPeriod( ) {
    return BPGetIn;
  }

}

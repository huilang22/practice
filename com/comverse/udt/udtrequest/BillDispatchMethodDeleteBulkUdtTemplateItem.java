/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillDispatchMethodDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BillDispatchMethodDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BillDispatchMethodDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillDispatchMethodObjectKeyData BDMDeleteIn;
/**
 *
 * Constructor to create a  BillDispatchMethodDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillDispatchMethodDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BillDispatchMethodObjectKeyData BDMDeleteInIn) {
    super(id, context, "BillDispatchMethodDelete");
    BDMDeleteIn = BDMDeleteInIn;
  }

  public void translateToMap() {
    if (BDMDeleteIn != null) {
      BDMDeleteIn.resetFlags(true, true);
      addInput("BillDispatchMethod", BillDispatchMethodObjectKeyHelper.toMap(BDMDeleteIn, new HashMap(), "BillDispatchMethodObjectKeyData").get("BillDispatchMethodObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillDispatchMethod
 * @param BDMDeleteInIn Value of the BDMDeleteIn
 *
 */

  public void setBillDispatchMethod(BillDispatchMethodObjectKeyData BDMDeleteInIn) {
    BDMDeleteIn = BDMDeleteInIn;
  }

  public void translateFromMap() {
    BDMDeleteIn = BillDispatchMethodObjectKeyHelper.fromMap(inputMap, "BillDispatchMethod");
  }

/**
 *
 * Gets the BillDispatchMethod
 * @return Value of the BillDispatchMethod
 *
 */

  public BillDispatchMethodObjectKeyData getBillDispatchMethod( ) {
    return BDMDeleteIn;
  }

}

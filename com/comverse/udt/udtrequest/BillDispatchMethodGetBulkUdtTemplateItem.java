/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillDispatchMethodGetBulkUdtTemplateItem.java
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
 * Class used to create a BillDispatchMethodGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BillDispatchMethodGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillDispatchMethodObjectKeyData BDMGetIn;
/**
 *
 * Constructor to create a  BillDispatchMethodGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillDispatchMethodGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BillDispatchMethodObjectKeyData BDMGetInIn) {
    super(id, context, "BillDispatchMethodGet");
    BDMGetIn = BDMGetInIn;
  }

  public void translateToMap() {
    if (BDMGetIn != null) {
      BDMGetIn.resetFlags(true, true);
      addInput("BillDispatchMethod", BillDispatchMethodObjectKeyHelper.toMap(BDMGetIn, new HashMap(), "BillDispatchMethodObjectKeyData").get("BillDispatchMethodObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillDispatchMethod
 * @param BDMGetInIn Value of the BDMGetIn
 *
 */

  public void setBillDispatchMethod(BillDispatchMethodObjectKeyData BDMGetInIn) {
    BDMGetIn = BDMGetInIn;
  }

  public void translateFromMap() {
    BDMGetIn = BillDispatchMethodObjectKeyHelper.fromMap(inputMap, "BillDispatchMethod");
  }

/**
 *
 * Gets the BillDispatchMethod
 * @return Value of the BillDispatchMethod
 *
 */

  public BillDispatchMethodObjectKeyData getBillDispatchMethod( ) {
    return BDMGetIn;
  }

}

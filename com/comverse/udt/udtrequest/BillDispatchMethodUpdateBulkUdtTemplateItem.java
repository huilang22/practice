/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillDispatchMethodUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BillDispatchMethodUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillDispatchMethodUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillDispatchMethodObjectData BDMUpdateIn;
/**
 *
 * Constructor to create a  BillDispatchMethodUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillDispatchMethodUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BillDispatchMethodObjectData BDMUpdateInIn) {
    super(id, context, "BillDispatchMethodUpdate");
    BDMUpdateIn = BDMUpdateInIn;
  }

  public void translateToMap() {
    if (BDMUpdateIn != null) {
      BDMUpdateIn.resetFlags(true, true);
      addInput("BillDispatchMethod", BillDispatchMethodObjectHelper.toMap(BDMUpdateIn, new HashMap(), "BillDispatchMethod").get("BillDispatchMethod"));
    }
  }


/**
 *
 * Sets the BillDispatchMethod
 * @param BDMUpdateInIn Value of the BDMUpdateIn
 *
 */

  public void setBillDispatchMethod(BillDispatchMethodObjectData BDMUpdateInIn) {
    BDMUpdateIn = BDMUpdateInIn;
  }

  public void translateFromMap() {
    BDMUpdateIn = BillDispatchMethodObjectHelper.fromMap(inputMap, "BillDispatchMethod");
  }

/**
 *
 * Gets the BillDispatchMethod
 * @return Value of the BillDispatchMethod
 *
 */

  public BillDispatchMethodObjectData getBillDispatchMethod( ) {
    return BDMUpdateIn;
  }

}

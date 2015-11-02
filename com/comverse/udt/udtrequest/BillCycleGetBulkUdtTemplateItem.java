/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillCycleGetBulkUdtTemplateItem.java
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
 * Class used to create a BillCycleGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BillCycleGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillCycleObjectKeyData BillCyclegetIn;
/**
 *
 * Constructor to create a  BillCycleGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillCycleGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BillCycleObjectKeyData BillCyclegetInIn) {
    super(id, context, "BillCycleGet");
    BillCyclegetIn = BillCyclegetInIn;
  }

  public void translateToMap() {
    if (BillCyclegetIn != null) {
      BillCyclegetIn.resetFlags(true, true);
      addInput("BillCycle", BillCycleObjectKeyHelper.toMap(BillCyclegetIn, new HashMap(), "BillCycleObjectKeyData").get("BillCycleObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillCycle
 * @param BillCyclegetInIn Value of the BillCyclegetIn
 *
 */

  public void setBillCycle(BillCycleObjectKeyData BillCyclegetInIn) {
    BillCyclegetIn = BillCyclegetInIn;
  }

  public void translateFromMap() {
    BillCyclegetIn = BillCycleObjectKeyHelper.fromMap(inputMap, "BillCycle");
  }

/**
 *
 * Gets the BillCycle
 * @return Value of the BillCycle
 *
 */

  public BillCycleObjectKeyData getBillCycle( ) {
    return BillCyclegetIn;
  }

}

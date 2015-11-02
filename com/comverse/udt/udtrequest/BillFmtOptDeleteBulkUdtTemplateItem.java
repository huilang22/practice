/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BillFmtOptDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BillFmtOptDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BllFmtOptObjectKeyData BllFmtOptDeleteIn;
/**
 *
 * Constructor to create a  BillFmtOptDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillFmtOptDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BllFmtOptObjectKeyData BllFmtOptDeleteInIn) {
    super(id, context, "BillFmtOptDelete");
    BllFmtOptDeleteIn = BllFmtOptDeleteInIn;
  }

  public void translateToMap() {
    if (BllFmtOptDeleteIn != null) {
      BllFmtOptDeleteIn.resetFlags(true, true);
      addInput("BillFmtOpt", BllFmtOptObjectKeyHelper.toMap(BllFmtOptDeleteIn, new HashMap(), "BllFmtOptObjectKeyData").get("BllFmtOptObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillFmtOpt
 * @param BllFmtOptDeleteInIn Value of the BllFmtOptDeleteIn
 *
 */

  public void setBillFmtOpt(BllFmtOptObjectKeyData BllFmtOptDeleteInIn) {
    BllFmtOptDeleteIn = BllFmtOptDeleteInIn;
  }

  public void translateFromMap() {
    BllFmtOptDeleteIn = BllFmtOptObjectKeyHelper.fromMap(inputMap, "BillFmtOpt");
  }

/**
 *
 * Gets the BillFmtOpt
 * @return Value of the BillFmtOpt
 *
 */

  public BllFmtOptObjectKeyData getBillFmtOpt( ) {
    return BllFmtOptDeleteIn;
  }

}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptGetBulkUdtTemplateItem.java
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
 * Class used to create a BillFmtOptGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BillFmtOptGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BllFmtOptObjectKeyData BllFmtOptGetIn;
/**
 *
 * Constructor to create a  BillFmtOptGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillFmtOptGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BllFmtOptObjectKeyData BllFmtOptGetInIn) {
    super(id, context, "BillFmtOptGet");
    BllFmtOptGetIn = BllFmtOptGetInIn;
  }

  public void translateToMap() {
    if (BllFmtOptGetIn != null) {
      BllFmtOptGetIn.resetFlags(true, true);
      addInput("BillFmtOpt", BllFmtOptObjectKeyHelper.toMap(BllFmtOptGetIn, new HashMap(), "BllFmtOptObjectKeyData").get("BllFmtOptObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillFmtOpt
 * @param BllFmtOptGetInIn Value of the BllFmtOptGetIn
 *
 */

  public void setBillFmtOpt(BllFmtOptObjectKeyData BllFmtOptGetInIn) {
    BllFmtOptGetIn = BllFmtOptGetInIn;
  }

  public void translateFromMap() {
    BllFmtOptGetIn = BllFmtOptObjectKeyHelper.fromMap(inputMap, "BillFmtOpt");
  }

/**
 *
 * Gets the BillFmtOpt
 * @return Value of the BillFmtOpt
 *
 */

  public BllFmtOptObjectKeyData getBillFmtOpt( ) {
    return BllFmtOptGetIn;
  }

}

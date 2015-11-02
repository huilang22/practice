/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BillFmtOptUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillFmtOptUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BllFmtOptObjectData BllFmtOptUpdateIn;
/**
 *
 * Constructor to create a  BillFmtOptUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillFmtOptUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BllFmtOptObjectData BllFmtOptUpdateInIn) {
    super(id, context, "BillFmtOptUpdate");
    BllFmtOptUpdateIn = BllFmtOptUpdateInIn;
  }

  public void translateToMap() {
    if (BllFmtOptUpdateIn != null) {
      BllFmtOptUpdateIn.resetFlags(true, true);
      addInput("BillFmtOpt", BllFmtOptObjectHelper.toMap(BllFmtOptUpdateIn, new HashMap(), "BillFmtOpt").get("BillFmtOpt"));
    }
  }


/**
 *
 * Sets the BillFmtOpt
 * @param BllFmtOptUpdateInIn Value of the BllFmtOptUpdateIn
 *
 */

  public void setBillFmtOpt(BllFmtOptObjectData BllFmtOptUpdateInIn) {
    BllFmtOptUpdateIn = BllFmtOptUpdateInIn;
  }

  public void translateFromMap() {
    BllFmtOptUpdateIn = BllFmtOptObjectHelper.fromMap(inputMap, "BillFmtOpt");
  }

/**
 *
 * Gets the BillFmtOpt
 * @return Value of the BillFmtOpt
 *
 */

  public BllFmtOptObjectData getBillFmtOpt( ) {
    return BllFmtOptUpdateIn;
  }

}

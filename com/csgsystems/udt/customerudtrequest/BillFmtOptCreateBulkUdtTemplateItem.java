/*
 * Generated code DO NOT EDIT
 * Generated file: BillFmtOptCreateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a BillFmtOptCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillFmtOptCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BllFmtOptObjectData BllFmtOptCreateIn;
/**
 *
 * Constructor to create a  BillFmtOptCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillFmtOptCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BllFmtOptObjectData BllFmtOptCreateInIn) {
    super(id, context, "BillFmtOptCreate");
    BllFmtOptCreateIn = BllFmtOptCreateInIn;
  }

  public void translateToMap() {
    if (BllFmtOptCreateIn != null) {
      BllFmtOptCreateIn.resetFlags(true, true);
      addInput("BillFmtOpt", BllFmtOptObjectHelper.toMap(BllFmtOptCreateIn, new HashMap(), "BillFmtOpt").get("BillFmtOpt"));
    }
  }


/**
 *
 * Sets the BillFmtOpt
 * @param BllFmtOptCreateInIn Value of the BllFmtOptCreateIn
 *
 */

  public void setBillFmtOpt(BllFmtOptObjectData BllFmtOptCreateInIn) {
    BllFmtOptCreateIn = BllFmtOptCreateInIn;
  }

  public void translateFromMap() {
    BllFmtOptCreateIn = BllFmtOptObjectHelper.fromMap(inputMap, "BillFmtOpt");
  }

/**
 *
 * Gets the BillFmtOpt
 * @return Value of the BillFmtOpt
 *
 */

  public BllFmtOptObjectData getBillFmtOpt( ) {
    return BllFmtOptCreateIn;
  }

}

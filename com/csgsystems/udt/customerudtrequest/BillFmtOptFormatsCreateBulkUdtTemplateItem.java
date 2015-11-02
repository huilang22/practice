/*
 * Generated code DO NOT EDIT
 * Generated file: BillFmtOptFormatsCreateBulkUdtTemplateItem.java
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
 * Class used to create a BillFmtOptFormatsCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillFmtOptFormatsCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillFmtOptFormatsObjectData BillFmtOptFormatsCreateIn;
/**
 *
 * Constructor to create a  BillFmtOptFormatsCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillFmtOptFormatsCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BillFmtOptFormatsObjectData BillFmtOptFormatsCreateInIn) {
    super(id, context, "BillFmtOptFormatsCreate");
    BillFmtOptFormatsCreateIn = BillFmtOptFormatsCreateInIn;
  }

  public void translateToMap() {
    if (BillFmtOptFormatsCreateIn != null) {
      BillFmtOptFormatsCreateIn.resetFlags(true, true);
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(BillFmtOptFormatsCreateIn, new HashMap(), "BillFmtOptFormats").get("BillFmtOptFormats"));
    }
  }


/**
 *
 * Sets the BillFmtOptFormats
 * @param BillFmtOptFormatsCreateInIn Value of the BillFmtOptFormatsCreateIn
 *
 */

  public void setBillFmtOptFormats(BillFmtOptFormatsObjectData BillFmtOptFormatsCreateInIn) {
    BillFmtOptFormatsCreateIn = BillFmtOptFormatsCreateInIn;
  }

  public void translateFromMap() {
    BillFmtOptFormatsCreateIn = BillFmtOptFormatsObjectHelper.fromMap(inputMap, "BillFmtOptFormats");
  }

/**
 *
 * Gets the BillFmtOptFormats
 * @return Value of the BillFmtOptFormats
 *
 */

  public BillFmtOptFormatsObjectData getBillFmtOptFormats( ) {
    return BillFmtOptFormatsCreateIn;
  }

}

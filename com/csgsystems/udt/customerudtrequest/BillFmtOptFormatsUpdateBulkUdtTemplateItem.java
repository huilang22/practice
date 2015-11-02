/*
 * Generated code DO NOT EDIT
 * Generated file: BillFmtOptFormatsUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BillFmtOptFormatsUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillFmtOptFormatsUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillFmtOptFormatsObjectData BillFmtOptFormatsUpdateIn;
/**
 *
 * Constructor to create a  BillFmtOptFormatsUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillFmtOptFormatsUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BillFmtOptFormatsObjectData BillFmtOptFormatsUpdateInIn) {
    super(id, context, "BillFmtOptFormatsUpdate");
    BillFmtOptFormatsUpdateIn = BillFmtOptFormatsUpdateInIn;
  }

  public void translateToMap() {
    if (BillFmtOptFormatsUpdateIn != null) {
      BillFmtOptFormatsUpdateIn.resetFlags(true, true);
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(BillFmtOptFormatsUpdateIn, new HashMap(), "BillFmtOptFormats").get("BillFmtOptFormats"));
    }
  }


/**
 *
 * Sets the BillFmtOptFormats
 * @param BillFmtOptFormatsUpdateInIn Value of the BillFmtOptFormatsUpdateIn
 *
 */

  public void setBillFmtOptFormats(BillFmtOptFormatsObjectData BillFmtOptFormatsUpdateInIn) {
    BillFmtOptFormatsUpdateIn = BillFmtOptFormatsUpdateInIn;
  }

  public void translateFromMap() {
    BillFmtOptFormatsUpdateIn = BillFmtOptFormatsObjectHelper.fromMap(inputMap, "BillFmtOptFormats");
  }

/**
 *
 * Gets the BillFmtOptFormats
 * @return Value of the BillFmtOptFormats
 *
 */

  public BillFmtOptFormatsObjectData getBillFmtOptFormats( ) {
    return BillFmtOptFormatsUpdateIn;
  }

}

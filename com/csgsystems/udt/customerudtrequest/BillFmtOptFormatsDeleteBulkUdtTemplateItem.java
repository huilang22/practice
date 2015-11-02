/*
 * Generated code DO NOT EDIT
 * Generated file: BillFmtOptFormatsDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BillFmtOptFormatsDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BillFmtOptFormatsDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillFmtOptFormatsObjectData BillFmtOptFormatsDeleteIn;
/**
 *
 * Constructor to create a  BillFmtOptFormatsDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillFmtOptFormatsDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BillFmtOptFormatsObjectData BillFmtOptFormatsDeleteInIn) {
    super(id, context, "BillFmtOptFormatsDelete");
    BillFmtOptFormatsDeleteIn = BillFmtOptFormatsDeleteInIn;
  }

  public void translateToMap() {
    if (BillFmtOptFormatsDeleteIn != null) {
      BillFmtOptFormatsDeleteIn.resetFlags(true, true);
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(BillFmtOptFormatsDeleteIn, new HashMap(), "BillFmtOptFormats").get("BillFmtOptFormats"));
    }
  }


/**
 *
 * Sets the BillFmtOptFormats
 * @param BillFmtOptFormatsDeleteInIn Value of the BillFmtOptFormatsDeleteIn
 *
 */

  public void setBillFmtOptFormats(BillFmtOptFormatsObjectData BillFmtOptFormatsDeleteInIn) {
    BillFmtOptFormatsDeleteIn = BillFmtOptFormatsDeleteInIn;
  }

  public void translateFromMap() {
    BillFmtOptFormatsDeleteIn = BillFmtOptFormatsObjectHelper.fromMap(inputMap, "BillFmtOptFormats");
  }

/**
 *
 * Gets the BillFmtOptFormats
 * @return Value of the BillFmtOptFormats
 *
 */

  public BillFmtOptFormatsObjectData getBillFmtOptFormats( ) {
    return BillFmtOptFormatsDeleteIn;
  }

}

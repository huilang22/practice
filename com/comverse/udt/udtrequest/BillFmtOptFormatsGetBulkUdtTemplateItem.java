/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptFormatsGetBulkUdtTemplateItem.java
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
 * Class used to create a BillFmtOptFormatsGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BillFmtOptFormatsGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillFmtOptFormatsObjectKeyData BillFmtOptFormatsGetIn;
/**
 *
 * Constructor to create a  BillFmtOptFormatsGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillFmtOptFormatsGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BillFmtOptFormatsObjectKeyData BillFmtOptFormatsGetInIn) {
    super(id, context, "BillFmtOptFormatsGet");
    BillFmtOptFormatsGetIn = BillFmtOptFormatsGetInIn;
  }

  public void translateToMap() {
    if (BillFmtOptFormatsGetIn != null) {
      BillFmtOptFormatsGetIn.resetFlags(true, true);
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectKeyHelper.toMap(BillFmtOptFormatsGetIn, new HashMap(), "BillFmtOptFormatsObjectKeyData").get("BillFmtOptFormatsObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillFmtOptFormats
 * @param BillFmtOptFormatsGetInIn Value of the BillFmtOptFormatsGetIn
 *
 */

  public void setBillFmtOptFormats(BillFmtOptFormatsObjectKeyData BillFmtOptFormatsGetInIn) {
    BillFmtOptFormatsGetIn = BillFmtOptFormatsGetInIn;
  }

  public void translateFromMap() {
    BillFmtOptFormatsGetIn = BillFmtOptFormatsObjectKeyHelper.fromMap(inputMap, "BillFmtOptFormats");
  }

/**
 *
 * Gets the BillFmtOptFormats
 * @return Value of the BillFmtOptFormats
 *
 */

  public BillFmtOptFormatsObjectKeyData getBillFmtOptFormats( ) {
    return BillFmtOptFormatsGetIn;
  }

}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillImageGetBulkUdtTemplateItem.java
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
 * Class used to create a BillImageGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BillImageGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillImageObjectKeyData bill_imageGetIn;
/**
 *
 * Constructor to create a  BillImageGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillImageGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BillImageObjectKeyData bill_imageGetInIn) {
    super(id, context, "BillImageGet");
    bill_imageGetIn = bill_imageGetInIn;
  }

  public void translateToMap() {
    if (bill_imageGetIn != null) {
      bill_imageGetIn.resetFlags(true, true);
      addInput("BillImage", BillImageObjectKeyHelper.toMap(bill_imageGetIn, new HashMap(), "BillImageObjectKeyData").get("BillImageObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillImage
 * @param bill_imageGetInIn Value of the bill_imageGetIn
 *
 */

  public void setBillImage(BillImageObjectKeyData bill_imageGetInIn) {
    bill_imageGetIn = bill_imageGetInIn;
  }

  public void translateFromMap() {
    bill_imageGetIn = BillImageObjectKeyHelper.fromMap(inputMap, "BillImage");
  }

/**
 *
 * Gets the BillImage
 * @return Value of the BillImage
 *
 */

  public BillImageObjectKeyData getBillImage( ) {
    return bill_imageGetIn;
  }

}

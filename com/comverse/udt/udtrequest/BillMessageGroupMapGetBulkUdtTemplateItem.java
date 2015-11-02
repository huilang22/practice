/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupMapGetBulkUdtTemplateItem.java
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
 * Class used to create a BillMessageGroupMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BillMessageGroupMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillMessageGroupMapObjectKeyData BMGGetIn;
/**
 *
 * Constructor to create a  BillMessageGroupMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillMessageGroupMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BillMessageGroupMapObjectKeyData BMGGetInIn) {
    super(id, context, "BillMessageGroupMapGet");
    BMGGetIn = BMGGetInIn;
  }

  public void translateToMap() {
    if (BMGGetIn != null) {
      BMGGetIn.resetFlags(true, true);
      addInput("BillMessageGroupMap", BillMessageGroupMapObjectKeyHelper.toMap(BMGGetIn, new HashMap(), "BillMessageGroupMapObjectKeyData").get("BillMessageGroupMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillMessageGroupMap
 * @param BMGGetInIn Value of the BMGGetIn
 *
 */

  public void setBillMessageGroupMap(BillMessageGroupMapObjectKeyData BMGGetInIn) {
    BMGGetIn = BMGGetInIn;
  }

  public void translateFromMap() {
    BMGGetIn = BillMessageGroupMapObjectKeyHelper.fromMap(inputMap, "BillMessageGroupMap");
  }

/**
 *
 * Gets the BillMessageGroupMap
 * @return Value of the BillMessageGroupMap
 *
 */

  public BillMessageGroupMapObjectKeyData getBillMessageGroupMap( ) {
    return BMGGetIn;
  }

}

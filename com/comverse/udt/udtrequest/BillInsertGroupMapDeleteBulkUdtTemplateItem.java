/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupMapDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BillInsertGroupMapDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BillInsertGroupMapDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillInsertGroupMapObjectKeyData BIGDeleteIn;
/**
 *
 * Constructor to create a  BillInsertGroupMapDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillInsertGroupMapDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupMapObjectKeyData BIGDeleteInIn) {
    super(id, context, "BillInsertGroupMapDelete");
    BIGDeleteIn = BIGDeleteInIn;
  }

  public void translateToMap() {
    if (BIGDeleteIn != null) {
      BIGDeleteIn.resetFlags(true, true);
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectKeyHelper.toMap(BIGDeleteIn, new HashMap(), "BillInsertGroupMapObjectKeyData").get("BillInsertGroupMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillInsertGroupMap
 * @param BIGDeleteInIn Value of the BIGDeleteIn
 *
 */

  public void setBillInsertGroupMap(BillInsertGroupMapObjectKeyData BIGDeleteInIn) {
    BIGDeleteIn = BIGDeleteInIn;
  }

  public void translateFromMap() {
    BIGDeleteIn = BillInsertGroupMapObjectKeyHelper.fromMap(inputMap, "BillInsertGroupMap");
  }

/**
 *
 * Gets the BillInsertGroupMap
 * @return Value of the BillInsertGroupMap
 *
 */

  public BillInsertGroupMapObjectKeyData getBillInsertGroupMap( ) {
    return BIGDeleteIn;
  }

}

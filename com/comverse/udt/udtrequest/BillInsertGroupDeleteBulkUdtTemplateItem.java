/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BillInsertGroupDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BillInsertGroupDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillInsertGroupObjectKeyData IGIDeleteIn;
/**
 *
 * Constructor to create a  BillInsertGroupDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillInsertGroupDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupObjectKeyData IGIDeleteInIn) {
    super(id, context, "BillInsertGroupDelete");
    IGIDeleteIn = IGIDeleteInIn;
  }

  public void translateToMap() {
    if (IGIDeleteIn != null) {
      IGIDeleteIn.resetFlags(true, true);
      addInput("BillInsertGroup", BillInsertGroupObjectKeyHelper.toMap(IGIDeleteIn, new HashMap(), "BillInsertGroupObjectKeyData").get("BillInsertGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillInsertGroup
 * @param IGIDeleteInIn Value of the IGIDeleteIn
 *
 */

  public void setBillInsertGroup(BillInsertGroupObjectKeyData IGIDeleteInIn) {
    IGIDeleteIn = IGIDeleteInIn;
  }

  public void translateFromMap() {
    IGIDeleteIn = BillInsertGroupObjectKeyHelper.fromMap(inputMap, "BillInsertGroup");
  }

/**
 *
 * Gets the BillInsertGroup
 * @return Value of the BillInsertGroup
 *
 */

  public BillInsertGroupObjectKeyData getBillInsertGroup( ) {
    return IGIDeleteIn;
  }

}

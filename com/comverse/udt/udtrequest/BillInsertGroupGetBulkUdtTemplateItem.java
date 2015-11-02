/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupGetBulkUdtTemplateItem.java
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
 * Class used to create a BillInsertGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BillInsertGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillInsertGroupObjectKeyData IGIGetIn;
/**
 *
 * Constructor to create a  BillInsertGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillInsertGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupObjectKeyData IGIGetInIn) {
    super(id, context, "BillInsertGroupGet");
    IGIGetIn = IGIGetInIn;
  }

  public void translateToMap() {
    if (IGIGetIn != null) {
      IGIGetIn.resetFlags(true, true);
      addInput("BillInsertGroup", BillInsertGroupObjectKeyHelper.toMap(IGIGetIn, new HashMap(), "BillInsertGroupObjectKeyData").get("BillInsertGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillInsertGroup
 * @param IGIGetInIn Value of the IGIGetIn
 *
 */

  public void setBillInsertGroup(BillInsertGroupObjectKeyData IGIGetInIn) {
    IGIGetIn = IGIGetInIn;
  }

  public void translateFromMap() {
    IGIGetIn = BillInsertGroupObjectKeyHelper.fromMap(inputMap, "BillInsertGroup");
  }

/**
 *
 * Gets the BillInsertGroup
 * @return Value of the BillInsertGroup
 *
 */

  public BillInsertGroupObjectKeyData getBillInsertGroup( ) {
    return IGIGetIn;
  }

}

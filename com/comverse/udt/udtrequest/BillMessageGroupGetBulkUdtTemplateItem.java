/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupGetBulkUdtTemplateItem.java
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
 * Class used to create a BillMessageGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BillMessageGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillMessageGroupObjectKeyData MGIGetIn;
/**
 *
 * Constructor to create a  BillMessageGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillMessageGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BillMessageGroupObjectKeyData MGIGetInIn) {
    super(id, context, "BillMessageGroupGet");
    MGIGetIn = MGIGetInIn;
  }

  public void translateToMap() {
    if (MGIGetIn != null) {
      MGIGetIn.resetFlags(true, true);
      addInput("BillMessageGroup", BillMessageGroupObjectKeyHelper.toMap(MGIGetIn, new HashMap(), "BillMessageGroupObjectKeyData").get("BillMessageGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillMessageGroup
 * @param MGIGetInIn Value of the MGIGetIn
 *
 */

  public void setBillMessageGroup(BillMessageGroupObjectKeyData MGIGetInIn) {
    MGIGetIn = MGIGetInIn;
  }

  public void translateFromMap() {
    MGIGetIn = BillMessageGroupObjectKeyHelper.fromMap(inputMap, "BillMessageGroup");
  }

/**
 *
 * Gets the BillMessageGroup
 * @return Value of the BillMessageGroup
 *
 */

  public BillMessageGroupObjectKeyData getBillMessageGroup( ) {
    return MGIGetIn;
  }

}

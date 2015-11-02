/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BillMessageGroupDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BillMessageGroupDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillMessageGroupObjectKeyData MGIDeleteIn;
/**
 *
 * Constructor to create a  BillMessageGroupDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillMessageGroupDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BillMessageGroupObjectKeyData MGIDeleteInIn) {
    super(id, context, "BillMessageGroupDelete");
    MGIDeleteIn = MGIDeleteInIn;
  }

  public void translateToMap() {
    if (MGIDeleteIn != null) {
      MGIDeleteIn.resetFlags(true, true);
      addInput("BillMessageGroup", BillMessageGroupObjectKeyHelper.toMap(MGIDeleteIn, new HashMap(), "BillMessageGroupObjectKeyData").get("BillMessageGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillMessageGroup
 * @param MGIDeleteInIn Value of the MGIDeleteIn
 *
 */

  public void setBillMessageGroup(BillMessageGroupObjectKeyData MGIDeleteInIn) {
    MGIDeleteIn = MGIDeleteInIn;
  }

  public void translateFromMap() {
    MGIDeleteIn = BillMessageGroupObjectKeyHelper.fromMap(inputMap, "BillMessageGroup");
  }

/**
 *
 * Gets the BillMessageGroup
 * @return Value of the BillMessageGroup
 *
 */

  public BillMessageGroupObjectKeyData getBillMessageGroup( ) {
    return MGIDeleteIn;
  }

}

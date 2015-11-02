/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BillMessageGroupUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillMessageGroupUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillMessageGroupObjectData MGIUpdateIn;
/**
 *
 * Constructor to create a  BillMessageGroupUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillMessageGroupUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BillMessageGroupObjectData MGIUpdateInIn) {
    super(id, context, "BillMessageGroupUpdate");
    MGIUpdateIn = MGIUpdateInIn;
  }

  public void translateToMap() {
    if (MGIUpdateIn != null) {
      MGIUpdateIn.resetFlags(true, true);
      addInput("BillMessageGroup", BillMessageGroupObjectHelper.toMap(MGIUpdateIn, new HashMap(), "BillMessageGroup").get("BillMessageGroup"));
    }
  }


/**
 *
 * Sets the BillMessageGroup
 * @param MGIUpdateInIn Value of the MGIUpdateIn
 *
 */

  public void setBillMessageGroup(BillMessageGroupObjectData MGIUpdateInIn) {
    MGIUpdateIn = MGIUpdateInIn;
  }

  public void translateFromMap() {
    MGIUpdateIn = BillMessageGroupObjectHelper.fromMap(inputMap, "BillMessageGroup");
  }

/**
 *
 * Gets the BillMessageGroup
 * @return Value of the BillMessageGroup
 *
 */

  public BillMessageGroupObjectData getBillMessageGroup( ) {
    return MGIUpdateIn;
  }

}

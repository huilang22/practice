/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BillInsertGroupUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillInsertGroupUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillInsertGroupObjectData IGIUpdateIn;
/**
 *
 * Constructor to create a  BillInsertGroupUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillInsertGroupUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupObjectData IGIUpdateInIn) {
    super(id, context, "BillInsertGroupUpdate");
    IGIUpdateIn = IGIUpdateInIn;
  }

  public void translateToMap() {
    if (IGIUpdateIn != null) {
      IGIUpdateIn.resetFlags(true, true);
      addInput("BillInsertGroup", BillInsertGroupObjectHelper.toMap(IGIUpdateIn, new HashMap(), "BillInsertGroup").get("BillInsertGroup"));
    }
  }


/**
 *
 * Sets the BillInsertGroup
 * @param IGIUpdateInIn Value of the IGIUpdateIn
 *
 */

  public void setBillInsertGroup(BillInsertGroupObjectData IGIUpdateInIn) {
    IGIUpdateIn = IGIUpdateInIn;
  }

  public void translateFromMap() {
    IGIUpdateIn = BillInsertGroupObjectHelper.fromMap(inputMap, "BillInsertGroup");
  }

/**
 *
 * Gets the BillInsertGroup
 * @return Value of the BillInsertGroup
 *
 */

  public BillInsertGroupObjectData getBillInsertGroup( ) {
    return IGIUpdateIn;
  }

}

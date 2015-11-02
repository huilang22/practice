/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a BillMessageGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BillMessageGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillMessageGroupObjectFilter MGIFindIn;
/**
 *
 * Constructor to create a  BillMessageGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillMessageGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BillMessageGroupObjectFilter MGIFindInIn) {
    super(id, context, "BillMessageGroupFind");
    MGIFindIn = MGIFindInIn;
  }

  public void translateToMap() {
    if (MGIFindIn != null) {
      Integer index =  MGIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillMessageGroup", BillMessageGroupObjectHelper.toMap(MGIFindIn, new HashMap(), "BillMessageGroup").get("BillMessageGroup"));
    }
  }


/**
 *
 * Sets the BillMessageGroup
 * @param MGIFindInIn Value of the MGIFindIn
 *
 */

  public void setBillMessageGroup(BillMessageGroupObjectFilter MGIFindInIn) {
    MGIFindIn = MGIFindInIn;
  }

  public void translateFromMap() {
    MGIFindIn = BillMessageGroupObjectHelper.fromMapFilter(inputMap, "BillMessageGroup");
  }

/**
 *
 * Gets the BillMessageGroup
 * @return Value of the BillMessageGroup
 *
 */

  public BillMessageGroupObjectFilter getBillMessageGroup( ) {
    return MGIFindIn;
  }

}

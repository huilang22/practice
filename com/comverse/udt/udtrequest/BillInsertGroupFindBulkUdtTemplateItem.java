/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a BillInsertGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BillInsertGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillInsertGroupObjectFilter IGIFindIn;
/**
 *
 * Constructor to create a  BillInsertGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillInsertGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupObjectFilter IGIFindInIn) {
    super(id, context, "BillInsertGroupFind");
    IGIFindIn = IGIFindInIn;
  }

  public void translateToMap() {
    if (IGIFindIn != null) {
      Integer index =  IGIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillInsertGroup", BillInsertGroupObjectHelper.toMap(IGIFindIn, new HashMap(), "BillInsertGroup").get("BillInsertGroup"));
    }
  }


/**
 *
 * Sets the BillInsertGroup
 * @param IGIFindInIn Value of the IGIFindIn
 *
 */

  public void setBillInsertGroup(BillInsertGroupObjectFilter IGIFindInIn) {
    IGIFindIn = IGIFindInIn;
  }

  public void translateFromMap() {
    IGIFindIn = BillInsertGroupObjectHelper.fromMapFilter(inputMap, "BillInsertGroup");
  }

/**
 *
 * Gets the BillInsertGroup
 * @return Value of the BillInsertGroup
 *
 */

  public BillInsertGroupObjectFilter getBillInsertGroup( ) {
    return IGIFindIn;
  }

}

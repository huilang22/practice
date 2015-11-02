/*
 * Generated code DO NOT EDIT
 * Generated file: BillInsertGroupCreateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a BillInsertGroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillInsertGroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillInsertGroupObjectData IGICreateIn;
/**
 *
 * Constructor to create a  BillInsertGroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillInsertGroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupObjectData IGICreateInIn) {
    super(id, context, "BillInsertGroupCreate");
    IGICreateIn = IGICreateInIn;
  }

  public void translateToMap() {
    if (IGICreateIn != null) {
      IGICreateIn.resetFlags(true, true);
      addInput("BillInsertGroup", BillInsertGroupObjectHelper.toMap(IGICreateIn, new HashMap(), "BillInsertGroup").get("BillInsertGroup"));
    }
  }


/**
 *
 * Sets the BillInsertGroup
 * @param IGICreateInIn Value of the IGICreateIn
 *
 */

  public void setBillInsertGroup(BillInsertGroupObjectData IGICreateInIn) {
    IGICreateIn = IGICreateInIn;
  }

  public void translateFromMap() {
    IGICreateIn = BillInsertGroupObjectHelper.fromMap(inputMap, "BillInsertGroup");
  }

/**
 *
 * Gets the BillInsertGroup
 * @return Value of the BillInsertGroup
 *
 */

  public BillInsertGroupObjectData getBillInsertGroup( ) {
    return IGICreateIn;
  }

}

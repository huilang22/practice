/*
 * Generated code DO NOT EDIT
 * Generated file: BillMessageGroupCreateBulkUdtTemplateItem.java
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
 * Class used to create a BillMessageGroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillMessageGroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillMessageGroupObjectData MGICreateIn;
/**
 *
 * Constructor to create a  BillMessageGroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillMessageGroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BillMessageGroupObjectData MGICreateInIn) {
    super(id, context, "BillMessageGroupCreate");
    MGICreateIn = MGICreateInIn;
  }

  public void translateToMap() {
    if (MGICreateIn != null) {
      MGICreateIn.resetFlags(true, true);
      addInput("BillMessageGroup", BillMessageGroupObjectHelper.toMap(MGICreateIn, new HashMap(), "BillMessageGroup").get("BillMessageGroup"));
    }
  }


/**
 *
 * Sets the BillMessageGroup
 * @param MGICreateInIn Value of the MGICreateIn
 *
 */

  public void setBillMessageGroup(BillMessageGroupObjectData MGICreateInIn) {
    MGICreateIn = MGICreateInIn;
  }

  public void translateFromMap() {
    MGICreateIn = BillMessageGroupObjectHelper.fromMap(inputMap, "BillMessageGroup");
  }

/**
 *
 * Gets the BillMessageGroup
 * @return Value of the BillMessageGroup
 *
 */

  public BillMessageGroupObjectData getBillMessageGroup( ) {
    return MGICreateIn;
  }

}

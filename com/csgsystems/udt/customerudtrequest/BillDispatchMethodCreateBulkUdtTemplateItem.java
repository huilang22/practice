/*
 * Generated code DO NOT EDIT
 * Generated file: BillDispatchMethodCreateBulkUdtTemplateItem.java
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
 * Class used to create a BillDispatchMethodCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillDispatchMethodCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillDispatchMethodObjectData BDMCreateIn;
/**
 *
 * Constructor to create a  BillDispatchMethodCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillDispatchMethodCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BillDispatchMethodObjectData BDMCreateInIn) {
    super(id, context, "BillDispatchMethodCreate");
    BDMCreateIn = BDMCreateInIn;
  }

  public void translateToMap() {
    if (BDMCreateIn != null) {
      BDMCreateIn.resetFlags(true, true);
      addInput("BillDispatchMethod", BillDispatchMethodObjectHelper.toMap(BDMCreateIn, new HashMap(), "BillDispatchMethod").get("BillDispatchMethod"));
    }
  }


/**
 *
 * Sets the BillDispatchMethod
 * @param BDMCreateInIn Value of the BDMCreateIn
 *
 */

  public void setBillDispatchMethod(BillDispatchMethodObjectData BDMCreateInIn) {
    BDMCreateIn = BDMCreateInIn;
  }

  public void translateFromMap() {
    BDMCreateIn = BillDispatchMethodObjectHelper.fromMap(inputMap, "BillDispatchMethod");
  }

/**
 *
 * Gets the BillDispatchMethod
 * @return Value of the BillDispatchMethod
 *
 */

  public BillDispatchMethodObjectData getBillDispatchMethod( ) {
    return BDMCreateIn;
  }

}

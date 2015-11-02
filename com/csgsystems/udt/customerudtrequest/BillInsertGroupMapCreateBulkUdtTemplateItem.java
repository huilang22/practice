/*
 * Generated code DO NOT EDIT
 * Generated file: BillInsertGroupMapCreateBulkUdtTemplateItem.java
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
 * Class used to create a BillInsertGroupMapCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillInsertGroupMapCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillInsertGroupMapObjectData BIGCreateIn;
/**
 *
 * Constructor to create a  BillInsertGroupMapCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillInsertGroupMapCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupMapObjectData BIGCreateInIn) {
    super(id, context, "BillInsertGroupMapCreate");
    BIGCreateIn = BIGCreateInIn;
  }

  public void translateToMap() {
    if (BIGCreateIn != null) {
      BIGCreateIn.resetFlags(true, true);
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectHelper.toMap(BIGCreateIn, new HashMap(), "BillInsertGroupMap").get("BillInsertGroupMap"));
    }
  }


/**
 *
 * Sets the BillInsertGroupMap
 * @param BIGCreateInIn Value of the BIGCreateIn
 *
 */

  public void setBillInsertGroupMap(BillInsertGroupMapObjectData BIGCreateInIn) {
    BIGCreateIn = BIGCreateInIn;
  }

  public void translateFromMap() {
    BIGCreateIn = BillInsertGroupMapObjectHelper.fromMap(inputMap, "BillInsertGroupMap");
  }

/**
 *
 * Gets the BillInsertGroupMap
 * @return Value of the BillInsertGroupMap
 *
 */

  public BillInsertGroupMapObjectData getBillInsertGroupMap( ) {
    return BIGCreateIn;
  }

}

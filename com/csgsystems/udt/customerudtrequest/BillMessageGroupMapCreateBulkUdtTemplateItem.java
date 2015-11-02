/*
 * Generated code DO NOT EDIT
 * Generated file: BillMessageGroupMapCreateBulkUdtTemplateItem.java
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
 * Class used to create a BillMessageGroupMapCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillMessageGroupMapCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillMessageGroupMapObjectData BMGCreateIn;
/**
 *
 * Constructor to create a  BillMessageGroupMapCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillMessageGroupMapCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BillMessageGroupMapObjectData BMGCreateInIn) {
    super(id, context, "BillMessageGroupMapCreate");
    BMGCreateIn = BMGCreateInIn;
  }

  public void translateToMap() {
    if (BMGCreateIn != null) {
      BMGCreateIn.resetFlags(true, true);
      addInput("BillMessageGroupMap", BillMessageGroupMapObjectHelper.toMap(BMGCreateIn, new HashMap(), "BillMessageGroupMap").get("BillMessageGroupMap"));
    }
  }


/**
 *
 * Sets the BillMessageGroupMap
 * @param BMGCreateInIn Value of the BMGCreateIn
 *
 */

  public void setBillMessageGroupMap(BillMessageGroupMapObjectData BMGCreateInIn) {
    BMGCreateIn = BMGCreateInIn;
  }

  public void translateFromMap() {
    BMGCreateIn = BillMessageGroupMapObjectHelper.fromMap(inputMap, "BillMessageGroupMap");
  }

/**
 *
 * Gets the BillMessageGroupMap
 * @return Value of the BillMessageGroupMap
 *
 */

  public BillMessageGroupMapObjectData getBillMessageGroupMap( ) {
    return BMGCreateIn;
  }

}

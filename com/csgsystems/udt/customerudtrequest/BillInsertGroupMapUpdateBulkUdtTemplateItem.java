/*
 * Generated code DO NOT EDIT
 * Generated file: BillInsertGroupMapUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BillInsertGroupMapUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillInsertGroupMapUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillInsertGroupMapObjectData BIGUpdateIn;
/**
 *
 * Constructor to create a  BillInsertGroupMapUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillInsertGroupMapUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupMapObjectData BIGUpdateInIn) {
    super(id, context, "BillInsertGroupMapUpdate");
    BIGUpdateIn = BIGUpdateInIn;
  }

  public void translateToMap() {
    if (BIGUpdateIn != null) {
      BIGUpdateIn.resetFlags(true, true);
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectHelper.toMap(BIGUpdateIn, new HashMap(), "BillInsertGroupMap").get("BillInsertGroupMap"));
    }
  }


/**
 *
 * Sets the BillInsertGroupMap
 * @param BIGUpdateInIn Value of the BIGUpdateIn
 *
 */

  public void setBillInsertGroupMap(BillInsertGroupMapObjectData BIGUpdateInIn) {
    BIGUpdateIn = BIGUpdateInIn;
  }

  public void translateFromMap() {
    BIGUpdateIn = BillInsertGroupMapObjectHelper.fromMap(inputMap, "BillInsertGroupMap");
  }

/**
 *
 * Gets the BillInsertGroupMap
 * @return Value of the BillInsertGroupMap
 *
 */

  public BillInsertGroupMapObjectData getBillInsertGroupMap( ) {
    return BIGUpdateIn;
  }

}

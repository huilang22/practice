/*
 * Generated code DO NOT EDIT
 * Generated file: BillInsertGroupMapGetBulkUdtTemplateItem.java
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
 * Class used to create a BillInsertGroupMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BillInsertGroupMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillInsertGroupMapObjectKeyData BIGGetIn;
/**
 *
 * Constructor to create a  BillInsertGroupMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillInsertGroupMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupMapObjectKeyData BIGGetInIn) {
    super(id, context, "BillInsertGroupMapGet");
    BIGGetIn = BIGGetInIn;
  }

  public void translateToMap() {
    if (BIGGetIn != null) {
      BIGGetIn.resetFlags(true, true);
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectKeyHelper.toMap(BIGGetIn, new HashMap(), "BillInsertGroupMapObjectKeyData").get("BillInsertGroupMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillInsertGroupMap
 * @param BIGGetInIn Value of the BIGGetIn
 *
 */

  public void setBillInsertGroupMap(BillInsertGroupMapObjectKeyData BIGGetInIn) {
    BIGGetIn = BIGGetInIn;
  }

  public void translateFromMap() {
    BIGGetIn = BillInsertGroupMapObjectKeyHelper.fromMap(inputMap, "BillInsertGroupMap");
  }

/**
 *
 * Gets the BillInsertGroupMap
 * @return Value of the BillInsertGroupMap
 *
 */

  public BillInsertGroupMapObjectKeyData getBillInsertGroupMap( ) {
    return BIGGetIn;
  }

}

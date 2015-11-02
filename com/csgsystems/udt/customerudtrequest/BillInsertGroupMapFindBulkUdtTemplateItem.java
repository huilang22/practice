/*
 * Generated code DO NOT EDIT
 * Generated file: BillInsertGroupMapFindBulkUdtTemplateItem.java
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
 * Class used to create a BillInsertGroupMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BillInsertGroupMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillInsertGroupMapObjectFilter BIGFindIn;
/**
 *
 * Constructor to create a  BillInsertGroupMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillInsertGroupMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInsertGroupMapObjectFilter BIGFindInIn) {
    super(id, context, "BillInsertGroupMapFind");
    BIGFindIn = BIGFindInIn;
  }

  public void translateToMap() {
    if (BIGFindIn != null) {
      Integer index =  BIGFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectHelper.toMap(BIGFindIn, new HashMap(), "BillInsertGroupMap").get("BillInsertGroupMap"));
    }
  }


/**
 *
 * Sets the BillInsertGroupMap
 * @param BIGFindInIn Value of the BIGFindIn
 *
 */

  public void setBillInsertGroupMap(BillInsertGroupMapObjectFilter BIGFindInIn) {
    BIGFindIn = BIGFindInIn;
  }

  public void translateFromMap() {
    BIGFindIn = BillInsertGroupMapObjectHelper.fromMapFilter(inputMap, "BillInsertGroupMap");
  }

/**
 *
 * Gets the BillInsertGroupMap
 * @return Value of the BillInsertGroupMap
 *
 */

  public BillInsertGroupMapObjectFilter getBillInsertGroupMap( ) {
    return BIGFindIn;
  }

}

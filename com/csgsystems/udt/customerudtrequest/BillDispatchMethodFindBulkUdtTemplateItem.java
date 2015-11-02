/*
 * Generated code DO NOT EDIT
 * Generated file: BillDispatchMethodFindBulkUdtTemplateItem.java
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
 * Class used to create a BillDispatchMethodFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BillDispatchMethodFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillDispatchMethodObjectFilter BDMFindIn;
/**
 *
 * Constructor to create a  BillDispatchMethodFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillDispatchMethodFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BillDispatchMethodObjectFilter BDMFindInIn) {
    super(id, context, "BillDispatchMethodFind");
    BDMFindIn = BDMFindInIn;
  }

  public void translateToMap() {
    if (BDMFindIn != null) {
      Integer index =  BDMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillDispatchMethod", BillDispatchMethodObjectHelper.toMap(BDMFindIn, new HashMap(), "BillDispatchMethod").get("BillDispatchMethod"));
    }
  }


/**
 *
 * Sets the BillDispatchMethod
 * @param BDMFindInIn Value of the BDMFindIn
 *
 */

  public void setBillDispatchMethod(BillDispatchMethodObjectFilter BDMFindInIn) {
    BDMFindIn = BDMFindInIn;
  }

  public void translateFromMap() {
    BDMFindIn = BillDispatchMethodObjectHelper.fromMapFilter(inputMap, "BillDispatchMethod");
  }

/**
 *
 * Gets the BillDispatchMethod
 * @return Value of the BillDispatchMethod
 *
 */

  public BillDispatchMethodObjectFilter getBillDispatchMethod( ) {
    return BDMFindIn;
  }

}

/*
 * Generated code DO NOT EDIT
 * Generated file: BillClassCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a BillClassCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillClassCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BCObjectData BCCreateIn;
/**
 *
 * Constructor to create a  BillClassCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillClassCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BCObjectData BCCreateInIn) {
    super(id, context, "BillClassCreate");
    BCCreateIn = BCCreateInIn;
  }

  public void translateToMap() {
    if (BCCreateIn != null) {
      BCCreateIn.resetFlags(true, true);
      addInput("BillClass", BCObjectHelper.toMap(BCCreateIn, new HashMap(), "BillClass").get("BillClass"));
    }
  }


/**
 *
 * Sets the BillClass
 * @param BCCreateInIn Value of the BCCreateIn
 *
 */

  public void setBillClass(BCObjectData BCCreateInIn) {
    BCCreateIn = BCCreateInIn;
  }

  public void translateFromMap() {
    BCCreateIn = BCObjectHelper.fromMap(inputMap, "BillClass");
  }

/**
 *
 * Gets the BillClass
 * @return Value of the BillClass
 *
 */

  public BCObjectData getBillClass( ) {
    return BCCreateIn;
  }

}

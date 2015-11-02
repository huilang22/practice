/*
 * Generated code DO NOT EDIT
 * Generated file: BillClassFindBulkUdtTemplateItem.java
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
 * Class used to create a BillClassFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BillClassFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BCObjectFilter BCFindIn;
/**
 *
 * Constructor to create a  BillClassFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillClassFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BCObjectFilter BCFindInIn) {
    super(id, context, "BillClassFind");
    BCFindIn = BCFindInIn;
  }

  public void translateToMap() {
    if (BCFindIn != null) {
      Integer index =  BCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillClass", BCObjectHelper.toMap(BCFindIn, new HashMap(), "BillClass").get("BillClass"));
    }
  }


/**
 *
 * Sets the BillClass
 * @param BCFindInIn Value of the BCFindIn
 *
 */

  public void setBillClass(BCObjectFilter BCFindInIn) {
    BCFindIn = BCFindInIn;
  }

  public void translateFromMap() {
    BCFindIn = BCObjectHelper.fromMapFilter(inputMap, "BillClass");
  }

/**
 *
 * Gets the BillClass
 * @return Value of the BillClass
 *
 */

  public BCObjectFilter getBillClass( ) {
    return BCFindIn;
  }

}

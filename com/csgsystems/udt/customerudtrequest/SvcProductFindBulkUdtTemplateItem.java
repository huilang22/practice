/*
 * Generated code DO NOT EDIT
 * Generated file: SvcProductFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a SvcProductFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SvcProductFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SvcProductObjectFilter SvcProductFindIn;
/**
 *
 * Constructor to create a  SvcProductFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SvcProductFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SvcProductObjectFilter SvcProductFindInIn) {
    super(id, context, "SvcProductFind");
    SvcProductFindIn = SvcProductFindInIn;
  }

  public void translateToMap() {
    if (SvcProductFindIn != null) {
      Integer index =  SvcProductFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SvcProduct", SvcProductObjectHelper.toMap(SvcProductFindIn, new HashMap(), "SvcProduct").get("SvcProduct"));
    }
  }


/**
 *
 * Sets the SvcProduct
 * @param SvcProductFindInIn Value of the SvcProductFindIn
 *
 */

  public void setSvcProduct(SvcProductObjectFilter SvcProductFindInIn) {
    SvcProductFindIn = SvcProductFindInIn;
  }

  public void translateFromMap() {
    SvcProductFindIn = SvcProductObjectHelper.fromMapFilter(inputMap, "SvcProduct");
  }

/**
 *
 * Gets the SvcProduct
 * @return Value of the SvcProduct
 *
 */

  public SvcProductObjectFilter getSvcProduct( ) {
    return SvcProductFindIn;
  }

}

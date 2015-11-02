/*
 * Generated code DO NOT EDIT
 * Generated file: BsdObjectFindBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * Class used to create a BsdObjectFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdObjectFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdObjectObjectFilter bsdObjectFindIn;
/**
 *
 * Constructor to create a  BsdObjectFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdObjectFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectObjectFilter bsdObjectFindInIn) {
    super(id, context, "BsdObjectFind");
    bsdObjectFindIn = bsdObjectFindInIn;
  }

  public void translateToMap() {
    if (bsdObjectFindIn != null) {
      Integer index =  bsdObjectFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdObject", BsdObjectObjectHelper.toMap(bsdObjectFindIn, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }


/**
 *
 * Sets the BsdObject
 * @param bsdObjectFindInIn Value of the bsdObjectFindIn
 *
 */

  public void setBsdObject(BsdObjectObjectFilter bsdObjectFindInIn) {
    bsdObjectFindIn = bsdObjectFindInIn;
  }

  public void translateFromMap() {
    bsdObjectFindIn = BsdObjectObjectHelper.fromMapFilter(inputMap, "BsdObject");
  }

/**
 *
 * Gets the BsdObject
 * @return Value of the BsdObject
 *
 */

  public BsdObjectObjectFilter getBsdObject( ) {
    return bsdObjectFindIn;
  }

}

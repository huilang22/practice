/*
 * Generated code DO NOT EDIT
 * Generated file: BsdObjectCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdObjectCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdObjectCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdObjectObjectData bsdObjectCreateIn;
/**
 *
 * Constructor to create a  BsdObjectCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdObjectCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectObjectData bsdObjectCreateInIn) {
    super(id, context, "BsdObjectCreate");
    bsdObjectCreateIn = bsdObjectCreateInIn;
  }

  public void translateToMap() {
    if (bsdObjectCreateIn != null) {
      bsdObjectCreateIn.resetFlags(true, true);
      addInput("BsdObject", BsdObjectObjectHelper.toMap(bsdObjectCreateIn, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }


/**
 *
 * Sets the BsdObject
 * @param bsdObjectCreateInIn Value of the bsdObjectCreateIn
 *
 */

  public void setBsdObject(BsdObjectObjectData bsdObjectCreateInIn) {
    bsdObjectCreateIn = bsdObjectCreateInIn;
  }

  public void translateFromMap() {
    bsdObjectCreateIn = BsdObjectObjectHelper.fromMap(inputMap, "BsdObject");
  }

/**
 *
 * Gets the BsdObject
 * @return Value of the BsdObject
 *
 */

  public BsdObjectObjectData getBsdObject( ) {
    return bsdObjectCreateIn;
  }

}

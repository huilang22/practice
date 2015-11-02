/*
 * Generated code DO NOT EDIT
 * Generated file: BsdObjectUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdObjectUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdObjectUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdObjectObjectData bsdObjectUpdateIn;
/**
 *
 * Constructor to create a  BsdObjectUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdObjectUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectObjectData bsdObjectUpdateInIn) {
    super(id, context, "BsdObjectUpdate");
    bsdObjectUpdateIn = bsdObjectUpdateInIn;
  }

  public void translateToMap() {
    if (bsdObjectUpdateIn != null) {
      bsdObjectUpdateIn.resetFlags(true, true);
      addInput("BsdObject", BsdObjectObjectHelper.toMap(bsdObjectUpdateIn, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }


/**
 *
 * Sets the BsdObject
 * @param bsdObjectUpdateInIn Value of the bsdObjectUpdateIn
 *
 */

  public void setBsdObject(BsdObjectObjectData bsdObjectUpdateInIn) {
    bsdObjectUpdateIn = bsdObjectUpdateInIn;
  }

  public void translateFromMap() {
    bsdObjectUpdateIn = BsdObjectObjectHelper.fromMap(inputMap, "BsdObject");
  }

/**
 *
 * Gets the BsdObject
 * @return Value of the BsdObject
 *
 */

  public BsdObjectObjectData getBsdObject( ) {
    return bsdObjectUpdateIn;
  }

}

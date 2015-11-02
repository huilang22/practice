/*
 * Generated code DO NOT EDIT
 * Generated file: BsdActionCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdActionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdActionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdActionObjectData bsdActionCreateIn;
/**
 *
 * Constructor to create a  BsdActionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdActionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdActionObjectData bsdActionCreateInIn) {
    super(id, context, "BsdActionCreate");
    bsdActionCreateIn = bsdActionCreateInIn;
  }

  public void translateToMap() {
    if (bsdActionCreateIn != null) {
      bsdActionCreateIn.resetFlags(true, true);
      addInput("BsdAction", BsdActionObjectHelper.toMap(bsdActionCreateIn, new HashMap(), "BsdAction").get("BsdAction"));
    }
  }


/**
 *
 * Sets the BsdAction
 * @param bsdActionCreateInIn Value of the bsdActionCreateIn
 *
 */

  public void setBsdAction(BsdActionObjectData bsdActionCreateInIn) {
    bsdActionCreateIn = bsdActionCreateInIn;
  }

  public void translateFromMap() {
    bsdActionCreateIn = BsdActionObjectHelper.fromMap(inputMap, "BsdAction");
  }

/**
 *
 * Gets the BsdAction
 * @return Value of the BsdAction
 *
 */

  public BsdActionObjectData getBsdAction( ) {
    return bsdActionCreateIn;
  }

}

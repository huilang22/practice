/*
 * Generated code DO NOT EDIT
 * Generated file: BsdActionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdActionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdActionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdActionObjectData bsdActionUpdateIn;
/**
 *
 * Constructor to create a  BsdActionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdActionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdActionObjectData bsdActionUpdateInIn) {
    super(id, context, "BsdActionUpdate");
    bsdActionUpdateIn = bsdActionUpdateInIn;
  }

  public void translateToMap() {
    if (bsdActionUpdateIn != null) {
      bsdActionUpdateIn.resetFlags(true, true);
      addInput("BsdAction", BsdActionObjectHelper.toMap(bsdActionUpdateIn, new HashMap(), "BsdAction").get("BsdAction"));
    }
  }


/**
 *
 * Sets the BsdAction
 * @param bsdActionUpdateInIn Value of the bsdActionUpdateIn
 *
 */

  public void setBsdAction(BsdActionObjectData bsdActionUpdateInIn) {
    bsdActionUpdateIn = bsdActionUpdateInIn;
  }

  public void translateFromMap() {
    bsdActionUpdateIn = BsdActionObjectHelper.fromMap(inputMap, "BsdAction");
  }

/**
 *
 * Gets the BsdAction
 * @return Value of the BsdAction
 *
 */

  public BsdActionObjectData getBsdAction( ) {
    return bsdActionUpdateIn;
  }

}

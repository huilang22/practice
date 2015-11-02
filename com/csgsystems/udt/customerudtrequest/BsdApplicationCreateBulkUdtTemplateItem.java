/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationObjectData bsdApplicationCreateIn;
/**
 *
 * Constructor to create a  BsdApplicationCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationObjectData bsdApplicationCreateInIn) {
    super(id, context, "BsdApplicationCreate");
    bsdApplicationCreateIn = bsdApplicationCreateInIn;
  }

  public void translateToMap() {
    if (bsdApplicationCreateIn != null) {
      bsdApplicationCreateIn.resetFlags(true, true);
      addInput("BsdApplication", BsdApplicationObjectHelper.toMap(bsdApplicationCreateIn, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }


/**
 *
 * Sets the BsdApplication
 * @param bsdApplicationCreateInIn Value of the bsdApplicationCreateIn
 *
 */

  public void setBsdApplication(BsdApplicationObjectData bsdApplicationCreateInIn) {
    bsdApplicationCreateIn = bsdApplicationCreateInIn;
  }

  public void translateFromMap() {
    bsdApplicationCreateIn = BsdApplicationObjectHelper.fromMap(inputMap, "BsdApplication");
  }

/**
 *
 * Gets the BsdApplication
 * @return Value of the BsdApplication
 *
 */

  public BsdApplicationObjectData getBsdApplication( ) {
    return bsdApplicationCreateIn;
  }

}

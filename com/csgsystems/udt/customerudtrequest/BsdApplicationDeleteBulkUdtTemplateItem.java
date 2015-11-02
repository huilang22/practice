/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationObjectKeyData bsdApplicationDeleteIn;
/**
 *
 * Constructor to create a  BsdApplicationDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationObjectKeyData bsdApplicationDeleteInIn) {
    super(id, context, "BsdApplicationDelete");
    bsdApplicationDeleteIn = bsdApplicationDeleteInIn;
  }

  public void translateToMap() {
    if (bsdApplicationDeleteIn != null) {
      bsdApplicationDeleteIn.resetFlags(true, true);
      addInput("BsdApplication", BsdApplicationObjectKeyHelper.toMap(bsdApplicationDeleteIn, new HashMap(), "BsdApplicationObjectKeyData").get("BsdApplicationObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdApplication
 * @param bsdApplicationDeleteInIn Value of the bsdApplicationDeleteIn
 *
 */

  public void setBsdApplication(BsdApplicationObjectKeyData bsdApplicationDeleteInIn) {
    bsdApplicationDeleteIn = bsdApplicationDeleteInIn;
  }

  public void translateFromMap() {
    bsdApplicationDeleteIn = BsdApplicationObjectKeyHelper.fromMap(inputMap, "BsdApplication");
  }

/**
 *
 * Gets the BsdApplication
 * @return Value of the BsdApplication
 *
 */

  public BsdApplicationObjectKeyData getBsdApplication( ) {
    return bsdApplicationDeleteIn;
  }

}

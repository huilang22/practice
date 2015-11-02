/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationDefaultDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationDefaultDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationDefaultDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationDefaultObjectKeyData bsdApplicationDefaultDeleteIn;
/**
 *
 * Constructor to create a  BsdApplicationDefaultDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationDefaultDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationDefaultObjectKeyData bsdApplicationDefaultDeleteInIn) {
    super(id, context, "BsdApplicationDefaultDelete");
    bsdApplicationDefaultDeleteIn = bsdApplicationDefaultDeleteInIn;
  }

  public void translateToMap() {
    if (bsdApplicationDefaultDeleteIn != null) {
      bsdApplicationDefaultDeleteIn.resetFlags(true, true);
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectKeyHelper.toMap(bsdApplicationDefaultDeleteIn, new HashMap(), "BsdApplicationDefaultObjectKeyData").get("BsdApplicationDefaultObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdApplicationDefault
 * @param bsdApplicationDefaultDeleteInIn Value of the bsdApplicationDefaultDeleteIn
 *
 */

  public void setBsdApplicationDefault(BsdApplicationDefaultObjectKeyData bsdApplicationDefaultDeleteInIn) {
    bsdApplicationDefaultDeleteIn = bsdApplicationDefaultDeleteInIn;
  }

  public void translateFromMap() {
    bsdApplicationDefaultDeleteIn = BsdApplicationDefaultObjectKeyHelper.fromMap(inputMap, "BsdApplicationDefault");
  }

/**
 *
 * Gets the BsdApplicationDefault
 * @return Value of the BsdApplicationDefault
 *
 */

  public BsdApplicationDefaultObjectKeyData getBsdApplicationDefault( ) {
    return bsdApplicationDefaultDeleteIn;
  }

}

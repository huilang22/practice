/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationRelationalDefaultGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationRelationalDefaultGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationRelationalDefaultGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationRelationalDefaultObjectKeyData bsdApplicationRelationalDefaultGetIn;
/**
 *
 * Constructor to create a  BsdApplicationRelationalDefaultGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationRelationalDefaultGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationRelationalDefaultObjectKeyData bsdApplicationRelationalDefaultGetInIn) {
    super(id, context, "BsdApplicationRelationalDefaultGet");
    bsdApplicationRelationalDefaultGetIn = bsdApplicationRelationalDefaultGetInIn;
  }

  public void translateToMap() {
    if (bsdApplicationRelationalDefaultGetIn != null) {
      bsdApplicationRelationalDefaultGetIn.resetFlags(true, true);
      addInput("BsdApplicationRelationalDefault", BsdApplicationRelationalDefaultObjectKeyHelper.toMap(bsdApplicationRelationalDefaultGetIn, new HashMap(), "BsdApplicationRelationalDefaultObjectKeyData").get("BsdApplicationRelationalDefaultObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdApplicationRelationalDefault
 * @param bsdApplicationRelationalDefaultGetInIn Value of the bsdApplicationRelationalDefaultGetIn
 *
 */

  public void setBsdApplicationRelationalDefault(BsdApplicationRelationalDefaultObjectKeyData bsdApplicationRelationalDefaultGetInIn) {
    bsdApplicationRelationalDefaultGetIn = bsdApplicationRelationalDefaultGetInIn;
  }

  public void translateFromMap() {
    bsdApplicationRelationalDefaultGetIn = BsdApplicationRelationalDefaultObjectKeyHelper.fromMap(inputMap, "BsdApplicationRelationalDefault");
  }

/**
 *
 * Gets the BsdApplicationRelationalDefault
 * @return Value of the BsdApplicationRelationalDefault
 *
 */

  public BsdApplicationRelationalDefaultObjectKeyData getBsdApplicationRelationalDefault( ) {
    return bsdApplicationRelationalDefaultGetIn;
  }

}

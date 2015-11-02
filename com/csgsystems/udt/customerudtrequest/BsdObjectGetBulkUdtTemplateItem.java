/*
 * Generated code DO NOT EDIT
 * Generated file: BsdObjectGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdObjectGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdObjectGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdObjectObjectKeyData bsdObjectGetIn;
/**
 *
 * Constructor to create a  BsdObjectGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdObjectGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectObjectKeyData bsdObjectGetInIn) {
    super(id, context, "BsdObjectGet");
    bsdObjectGetIn = bsdObjectGetInIn;
  }

  public void translateToMap() {
    if (bsdObjectGetIn != null) {
      bsdObjectGetIn.resetFlags(true, true);
      addInput("BsdObject", BsdObjectObjectKeyHelper.toMap(bsdObjectGetIn, new HashMap(), "BsdObjectObjectKeyData").get("BsdObjectObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdObject
 * @param bsdObjectGetInIn Value of the bsdObjectGetIn
 *
 */

  public void setBsdObject(BsdObjectObjectKeyData bsdObjectGetInIn) {
    bsdObjectGetIn = bsdObjectGetInIn;
  }

  public void translateFromMap() {
    bsdObjectGetIn = BsdObjectObjectKeyHelper.fromMap(inputMap, "BsdObject");
  }

/**
 *
 * Gets the BsdObject
 * @return Value of the BsdObject
 *
 */

  public BsdObjectObjectKeyData getBsdObject( ) {
    return bsdObjectGetIn;
  }

}

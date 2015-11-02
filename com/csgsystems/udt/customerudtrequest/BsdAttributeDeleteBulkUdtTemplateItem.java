/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeObjectKeyData bsdAttributeDeleteIn;
/**
 *
 * Constructor to create a  BsdAttributeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeObjectKeyData bsdAttributeDeleteInIn) {
    super(id, context, "BsdAttributeDelete");
    bsdAttributeDeleteIn = bsdAttributeDeleteInIn;
  }

  public void translateToMap() {
    if (bsdAttributeDeleteIn != null) {
      bsdAttributeDeleteIn.resetFlags(true, true);
      addInput("BsdAttribute", BsdAttributeObjectKeyHelper.toMap(bsdAttributeDeleteIn, new HashMap(), "BsdAttributeObjectKeyData").get("BsdAttributeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdAttribute
 * @param bsdAttributeDeleteInIn Value of the bsdAttributeDeleteIn
 *
 */

  public void setBsdAttribute(BsdAttributeObjectKeyData bsdAttributeDeleteInIn) {
    bsdAttributeDeleteIn = bsdAttributeDeleteInIn;
  }

  public void translateFromMap() {
    bsdAttributeDeleteIn = BsdAttributeObjectKeyHelper.fromMap(inputMap, "BsdAttribute");
  }

/**
 *
 * Gets the BsdAttribute
 * @return Value of the BsdAttribute
 *
 */

  public BsdAttributeObjectKeyData getBsdAttribute( ) {
    return bsdAttributeDeleteIn;
  }

}

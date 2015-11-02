/*
 * Generated code DO NOT EDIT
 * Generated file: BsdObjectAttributeCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdObjectAttributeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdObjectAttributeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdObjectAttributeObjectBaseData bsdObjectAttributeCreateIn;
/**
 *
 * Constructor to create a  BsdObjectAttributeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdObjectAttributeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectAttributeObjectBaseData bsdObjectAttributeCreateInIn) {
    super(id, context, "BsdObjectAttributeCreate");
    bsdObjectAttributeCreateIn = bsdObjectAttributeCreateInIn;
  }

  public void translateToMap() {
    if (bsdObjectAttributeCreateIn != null) {
      bsdObjectAttributeCreateIn.resetFlags(true, true);
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectBaseHelper.toMap(bsdObjectAttributeCreateIn, new HashMap(), "BsdObjectAttribute").get("BsdObjectAttribute"));
    }
  }


/**
 *
 * Sets the BsdObjectAttribute
 * @param bsdObjectAttributeCreateInIn Value of the bsdObjectAttributeCreateIn
 *
 */

  public void setBsdObjectAttribute(BsdObjectAttributeObjectBaseData bsdObjectAttributeCreateInIn) {
    bsdObjectAttributeCreateIn = bsdObjectAttributeCreateInIn;
  }

  public void translateFromMap() {
    bsdObjectAttributeCreateIn = BsdObjectAttributeObjectBaseHelper.fromMap(inputMap, "BsdObjectAttribute");
  }

/**
 *
 * Gets the BsdObjectAttribute
 * @return Value of the BsdObjectAttribute
 *
 */

  public BsdObjectAttributeObjectBaseData getBsdObjectAttribute( ) {
    return bsdObjectAttributeCreateIn;
  }

}

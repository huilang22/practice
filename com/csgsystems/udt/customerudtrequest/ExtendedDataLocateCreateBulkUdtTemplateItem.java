/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataLocateCreateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ExtendedDataLocateCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataLocateCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExtendedDataLocateObjectData elcIn;
/**
 *
 * Constructor to create a  ExtendedDataLocateCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataLocateCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ExtendedDataLocateObjectData elcInIn) {
    super(id, context, "ExtendedDataLocateCreate");
    elcIn = elcInIn;
  }

  public void translateToMap() {
    if (elcIn != null) {
      elcIn.resetFlags(true, true);
      addInput("ExtendedDataLocate", ExtendedDataLocateObjectHelper.toMap(elcIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the ExtendedDataLocate
 * @param elcInIn Value of the elcIn
 *
 */

  public void setExtendedDataLocate(ExtendedDataLocateObjectData elcInIn) {
    elcIn = elcInIn;
  }

  public void translateFromMap() {
    elcIn = ExtendedDataLocateObjectHelper.fromMap(inputMap, "ExtendedDataLocate");
  }

/**
 *
 * Gets the ExtendedDataLocate
 * @return Value of the ExtendedDataLocate
 *
 */

  public ExtendedDataLocateObjectData getExtendedDataLocate( ) {
    return elcIn;
  }

}

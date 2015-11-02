/*
 * Generated code DO NOT EDIT
 * Generated file: GenericEnumerationGetBulkUdtTemplateItem.java
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
 * Class used to create a GenericEnumerationGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GenericEnumerationGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GEObjectKeyData GEGetIn;
/**
 *
 * Constructor to create a  GenericEnumerationGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GenericEnumerationGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GEObjectKeyData GEGetInIn) {
    super(id, context, "GenericEnumerationGet");
    GEGetIn = GEGetInIn;
  }

  public void translateToMap() {
    if (GEGetIn != null) {
      GEGetIn.resetFlags(true, true);
      addInput("GenericEnumeration", GEObjectKeyHelper.toMap(GEGetIn, new HashMap(), "GEObjectKeyData").get("GEObjectKeyData"));
    }
  }


/**
 *
 * Sets the GenericEnumeration
 * @param GEGetInIn Value of the GEGetIn
 *
 */

  public void setGenericEnumeration(GEObjectKeyData GEGetInIn) {
    GEGetIn = GEGetInIn;
  }

  public void translateFromMap() {
    GEGetIn = GEObjectKeyHelper.fromMap(inputMap, "GenericEnumeration");
  }

/**
 *
 * Gets the GenericEnumeration
 * @return Value of the GenericEnumeration
 *
 */

  public GEObjectKeyData getGenericEnumeration( ) {
    return GEGetIn;
  }

}

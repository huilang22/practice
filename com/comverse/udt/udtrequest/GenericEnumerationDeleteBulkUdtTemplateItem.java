/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenericEnumerationDeleteBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a GenericEnumerationDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class GenericEnumerationDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GEObjectKeyData GEDeleteIn;
/**
 *
 * Constructor to create a  GenericEnumerationDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GenericEnumerationDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, GEObjectKeyData GEDeleteInIn) {
    super(id, context, "GenericEnumerationDelete");
    GEDeleteIn = GEDeleteInIn;
  }

  public void translateToMap() {
    if (GEDeleteIn != null) {
      GEDeleteIn.resetFlags(true, true);
      addInput("GenericEnumeration", GEObjectKeyHelper.toMap(GEDeleteIn, new HashMap(), "GEObjectKeyData").get("GEObjectKeyData"));
    }
  }


/**
 *
 * Sets the GenericEnumeration
 * @param GEDeleteInIn Value of the GEDeleteIn
 *
 */

  public void setGenericEnumeration(GEObjectKeyData GEDeleteInIn) {
    GEDeleteIn = GEDeleteInIn;
  }

  public void translateFromMap() {
    GEDeleteIn = GEObjectKeyHelper.fromMap(inputMap, "GenericEnumeration");
  }

/**
 *
 * Gets the GenericEnumeration
 * @return Value of the GenericEnumeration
 *
 */

  public GEObjectKeyData getGenericEnumeration( ) {
    return GEDeleteIn;
  }

}

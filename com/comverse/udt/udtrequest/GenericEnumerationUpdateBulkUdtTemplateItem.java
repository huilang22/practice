/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenericEnumerationUpdateBulkUdtTemplateItem.java
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
 * Class used to create a GenericEnumerationUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GenericEnumerationUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GEObjectData GEUpdateIn;
/**
 *
 * Constructor to create a  GenericEnumerationUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GenericEnumerationUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GEObjectData GEUpdateInIn) {
    super(id, context, "GenericEnumerationUpdate");
    GEUpdateIn = GEUpdateInIn;
  }

  public void translateToMap() {
    if (GEUpdateIn != null) {
      GEUpdateIn.resetFlags(true, true);
      addInput("GenericEnumeration", GEObjectHelper.toMap(GEUpdateIn, new HashMap(), "GenericEnumeration").get("GenericEnumeration"));
    }
  }


/**
 *
 * Sets the GenericEnumeration
 * @param GEUpdateInIn Value of the GEUpdateIn
 *
 */

  public void setGenericEnumeration(GEObjectData GEUpdateInIn) {
    GEUpdateIn = GEUpdateInIn;
  }

  public void translateFromMap() {
    GEUpdateIn = GEObjectHelper.fromMap(inputMap, "GenericEnumeration");
  }

/**
 *
 * Gets the GenericEnumeration
 * @return Value of the GenericEnumeration
 *
 */

  public GEObjectData getGenericEnumeration( ) {
    return GEUpdateIn;
  }

}

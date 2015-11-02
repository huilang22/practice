/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * Class used to create a GeoAreaDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GAObjectKeyData GADeleteIn;
/**
 *
 * Constructor to create a  GeoAreaDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, GAObjectKeyData GADeleteInIn) {
    super(id, context, "GeoAreaDelete");
    GADeleteIn = GADeleteInIn;
  }

  public void translateToMap() {
    if (GADeleteIn != null) {
      GADeleteIn.resetFlags(true, true);
      addInput("GeoArea", GAObjectKeyHelper.toMap(GADeleteIn, new HashMap(), "GAObjectKeyData").get("GAObjectKeyData"));
    }
  }


/**
 *
 * Sets the GeoArea
 * @param GADeleteInIn Value of the GADeleteIn
 *
 */

  public void setGeoArea(GAObjectKeyData GADeleteInIn) {
    GADeleteIn = GADeleteInIn;
  }

  public void translateFromMap() {
    GADeleteIn = GAObjectKeyHelper.fromMap(inputMap, "GeoArea");
  }

/**
 *
 * Gets the GeoArea
 * @return Value of the GeoArea
 *
 */

  public GAObjectKeyData getGeoArea( ) {
    return GADeleteIn;
  }

}

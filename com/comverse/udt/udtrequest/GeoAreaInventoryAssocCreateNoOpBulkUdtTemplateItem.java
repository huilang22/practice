/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAssocCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaInventoryAssocCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaInventoryAssocCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeoAreaInventoryAssocObjectData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaInventoryAssocCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaInventoryAssocCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaInventoryAssocObjectData noOpInIn) {
    super(id, context, "GeoAreaInventoryAssocCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectHelper.toMap(noOpIn, new HashMap(), "GeoAreaInventoryAssoc").get("GeoAreaInventoryAssoc"));
    }
  }
/**
 *
 * Sets the  GeoAreaInventoryAssoc
 * @param noOpInIn GeoAreaInventoryAssocObjectData to set
 *
 */
  public void setGeoAreaInventoryAssoc(GeoAreaInventoryAssocObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaInventoryAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaInventoryAssocObjectData getGeoAreaInventoryAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GeoAreaInventoryAssocObjectHelper.fromMap(inputMap, "GeoAreaInventoryAssoc");
  }
}

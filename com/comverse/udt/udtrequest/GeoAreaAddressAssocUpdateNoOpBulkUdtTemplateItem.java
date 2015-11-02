/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaAddressAssocUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaAddressAssocUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeoAreaAddressAssocObjectData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaAddressAssocUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaAddressAssocUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaAddressAssocObjectData noOpInIn) {
    super(id, context, "GeoAreaAddressAssocUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectHelper.toMap(noOpIn, new HashMap(), "GeoAreaAddressAssoc").get("GeoAreaAddressAssoc"));
    }
  }
/**
 *
 * Sets the  GeoAreaAddressAssoc
 * @param noOpInIn GeoAreaAddressAssocObjectData to set
 *
 */
  public void setGeoAreaAddressAssoc(GeoAreaAddressAssocObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaAddressAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaAddressAssocObjectData getGeoAreaAddressAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GeoAreaAddressAssocObjectHelper.fromMap(inputMap, "GeoAreaAddressAssoc");
  }
}

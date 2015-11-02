/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAutoAssociateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaAddressAutoAssociateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaAddressAutoAssociateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeoAreaAddressAutoAssociateOutputData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaAddressAutoAssociateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaAddressAutoAssociateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaAddressAutoAssociateOutputData noOpInIn) {
    super(id, context, "GeoAreaAddressAutoAssociate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GeoAreaAddressAutoAssociateOutputData", GeoAreaAddressAutoAssociateOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  GeoAreaAddressAutoAssociateOutputData
 * @param noOpInIn GeoAreaAddressAutoAssociateOutputData to set
 *
 */
  public void setGeoAreaAddressAutoAssociateOutputData(GeoAreaAddressAutoAssociateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaAddressAutoAssociateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaAddressAutoAssociateOutputData getGeoAreaAddressAutoAssociateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GeoAreaAddressAutoAssociateOutputHelper.fromMap(inputMap);
  }
}

/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaSvcGrpCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a GeoAreaSvcGrpCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaSvcGrpCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GASGObjData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaSvcGrpCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaSvcGrpCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGObjData noOpInIn) {
    super(id, context, "GeoAreaSvcGrpCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GeoAreaSvcGrp", GASGObjHelper.toMap(noOpIn, new HashMap(), "GeoAreaSvcGrp").get("GeoAreaSvcGrp"));
    }
  }
/**
 *
 * Sets the  GeoAreaSvcGrp
 * @param noOpInIn GASGObjData to set
 *
 */
  public void setGeoAreaSvcGrp(GASGObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaSvcGrp passed into the constructor
 * @return Simulated response
 *
 */
  public GASGObjData getGeoAreaSvcGrp() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GASGObjHelper.fromMap(inputMap, "GeoAreaSvcGrp");
  }
}

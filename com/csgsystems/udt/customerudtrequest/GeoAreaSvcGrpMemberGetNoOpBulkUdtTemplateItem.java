/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaSvcGrpMemberGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaSvcGrpMemberGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaSvcGrpMemberGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GASGMObjData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaSvcGrpMemberGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaSvcGrpMemberGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGMObjData noOpInIn) {
    super(id, context, "GeoAreaSvcGrpMemberGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GeoAreaSvcGrpMember", GASGMObjHelper.toMap(noOpIn, new HashMap(), "GeoAreaSvcGrpMember").get("GeoAreaSvcGrpMember"));
    }
  }
/**
 *
 * Sets the  GeoAreaSvcGrpMember
 * @param noOpInIn GASGMObjData to set
 *
 */
  public void setGeoAreaSvcGrpMember(GASGMObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaSvcGrpMember passed into the constructor
 * @return Simulated response
 *
 */
  public GASGMObjData getGeoAreaSvcGrpMember() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GASGMObjHelper.fromMap(inputMap, "GeoAreaSvcGrpMember");
  }
}

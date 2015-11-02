/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaSvcGrpMemberDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaSvcGrpMemberDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaSvcGrpMemberDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GASGMObjData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaSvcGrpMemberDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaSvcGrpMemberDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGMObjData noOpInIn) {
    super(id, context, "GeoAreaSvcGrpMemberDelete");
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

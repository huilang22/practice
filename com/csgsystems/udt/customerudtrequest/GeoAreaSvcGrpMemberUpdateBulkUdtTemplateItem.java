/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaSvcGrpMemberUpdateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaSvcGrpMemberUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaSvcGrpMemberUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GASGMObjData GeoAreaSvcGrpMemberUpdateIn;
/**
 *
 * Constructor to create a  GeoAreaSvcGrpMemberUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaSvcGrpMemberUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGMObjData GeoAreaSvcGrpMemberUpdateInIn) {
    super(id, context, "GeoAreaSvcGrpMemberUpdate");
    GeoAreaSvcGrpMemberUpdateIn = GeoAreaSvcGrpMemberUpdateInIn;
  }

  public void translateToMap() {
    if (GeoAreaSvcGrpMemberUpdateIn != null) {
      GeoAreaSvcGrpMemberUpdateIn.resetFlags(true, true);
      addInput("GeoAreaSvcGrpMember", GASGMObjHelper.toMap(GeoAreaSvcGrpMemberUpdateIn, new HashMap(), "GeoAreaSvcGrpMember").get("GeoAreaSvcGrpMember"));
    }
  }


/**
 *
 * Sets the GeoAreaSvcGrpMember
 * @param GeoAreaSvcGrpMemberUpdateInIn Value of the GeoAreaSvcGrpMemberUpdateIn
 *
 */

  public void setGeoAreaSvcGrpMember(GASGMObjData GeoAreaSvcGrpMemberUpdateInIn) {
    GeoAreaSvcGrpMemberUpdateIn = GeoAreaSvcGrpMemberUpdateInIn;
  }

  public void translateFromMap() {
    GeoAreaSvcGrpMemberUpdateIn = GASGMObjHelper.fromMap(inputMap, "GeoAreaSvcGrpMember");
  }

/**
 *
 * Gets the GeoAreaSvcGrpMember
 * @return Value of the GeoAreaSvcGrpMember
 *
 */

  public GASGMObjData getGeoAreaSvcGrpMember( ) {
    return GeoAreaSvcGrpMemberUpdateIn;
  }

}

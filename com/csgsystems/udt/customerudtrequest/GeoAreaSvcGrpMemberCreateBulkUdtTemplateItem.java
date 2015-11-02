/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaSvcGrpMemberCreateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaSvcGrpMemberCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaSvcGrpMemberCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GASGMObjData GeoAreaSvcGrpMemberCreateIn;
/**
 *
 * Constructor to create a  GeoAreaSvcGrpMemberCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaSvcGrpMemberCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGMObjData GeoAreaSvcGrpMemberCreateInIn) {
    super(id, context, "GeoAreaSvcGrpMemberCreate");
    GeoAreaSvcGrpMemberCreateIn = GeoAreaSvcGrpMemberCreateInIn;
  }

  public void translateToMap() {
    if (GeoAreaSvcGrpMemberCreateIn != null) {
      GeoAreaSvcGrpMemberCreateIn.resetFlags(true, true);
      addInput("GeoAreaSvcGrpMember", GASGMObjHelper.toMap(GeoAreaSvcGrpMemberCreateIn, new HashMap(), "GeoAreaSvcGrpMember").get("GeoAreaSvcGrpMember"));
    }
  }


/**
 *
 * Sets the GeoAreaSvcGrpMember
 * @param GeoAreaSvcGrpMemberCreateInIn Value of the GeoAreaSvcGrpMemberCreateIn
 *
 */

  public void setGeoAreaSvcGrpMember(GASGMObjData GeoAreaSvcGrpMemberCreateInIn) {
    GeoAreaSvcGrpMemberCreateIn = GeoAreaSvcGrpMemberCreateInIn;
  }

  public void translateFromMap() {
    GeoAreaSvcGrpMemberCreateIn = GASGMObjHelper.fromMap(inputMap, "GeoAreaSvcGrpMember");
  }

/**
 *
 * Gets the GeoAreaSvcGrpMember
 * @return Value of the GeoAreaSvcGrpMember
 *
 */

  public GASGMObjData getGeoAreaSvcGrpMember( ) {
    return GeoAreaSvcGrpMemberCreateIn;
  }

}

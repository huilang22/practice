/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpMemberGetBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaSvcGrpMemberGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaSvcGrpMemberGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GASGMObjKeyData GeoAreaSvcGrpMemberGetIn;
/**
 *
 * Constructor to create a  GeoAreaSvcGrpMemberGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaSvcGrpMemberGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGMObjKeyData GeoAreaSvcGrpMemberGetInIn) {
    super(id, context, "GeoAreaSvcGrpMemberGet");
    GeoAreaSvcGrpMemberGetIn = GeoAreaSvcGrpMemberGetInIn;
  }

  public void translateToMap() {
    if (GeoAreaSvcGrpMemberGetIn != null) {
      GeoAreaSvcGrpMemberGetIn.resetFlags(true, true);
      addInput("GeoAreaSvcGrpMember", GASGMObjKeyHelper.toMap(GeoAreaSvcGrpMemberGetIn, new HashMap(), "GASGMObjKeyData").get("GASGMObjKeyData"));
    }
  }


/**
 *
 * Sets the GeoAreaSvcGrpMember
 * @param GeoAreaSvcGrpMemberGetInIn Value of the GeoAreaSvcGrpMemberGetIn
 *
 */

  public void setGeoAreaSvcGrpMember(GASGMObjKeyData GeoAreaSvcGrpMemberGetInIn) {
    GeoAreaSvcGrpMemberGetIn = GeoAreaSvcGrpMemberGetInIn;
  }

  public void translateFromMap() {
    GeoAreaSvcGrpMemberGetIn = GASGMObjKeyHelper.fromMap(inputMap, "GeoAreaSvcGrpMember");
  }

/**
 *
 * Gets the GeoAreaSvcGrpMember
 * @return Value of the GeoAreaSvcGrpMember
 *
 */

  public GASGMObjKeyData getGeoAreaSvcGrpMember( ) {
    return GeoAreaSvcGrpMemberGetIn;
  }

}

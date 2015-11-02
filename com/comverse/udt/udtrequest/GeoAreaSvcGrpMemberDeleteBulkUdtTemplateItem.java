/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpMemberDeleteBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaSvcGrpMemberDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaSvcGrpMemberDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GASGMObjKeyData GeoAreaSvcGrpMemberDeleteIn;
/**
 *
 * Constructor to create a  GeoAreaSvcGrpMemberDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaSvcGrpMemberDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGMObjKeyData GeoAreaSvcGrpMemberDeleteInIn) {
    super(id, context, "GeoAreaSvcGrpMemberDelete");
    GeoAreaSvcGrpMemberDeleteIn = GeoAreaSvcGrpMemberDeleteInIn;
  }

  public void translateToMap() {
    if (GeoAreaSvcGrpMemberDeleteIn != null) {
      GeoAreaSvcGrpMemberDeleteIn.resetFlags(true, true);
      addInput("GeoAreaSvcGrpMember", GASGMObjKeyHelper.toMap(GeoAreaSvcGrpMemberDeleteIn, new HashMap(), "GASGMObjKeyData").get("GASGMObjKeyData"));
    }
  }


/**
 *
 * Sets the GeoAreaSvcGrpMember
 * @param GeoAreaSvcGrpMemberDeleteInIn Value of the GeoAreaSvcGrpMemberDeleteIn
 *
 */

  public void setGeoAreaSvcGrpMember(GASGMObjKeyData GeoAreaSvcGrpMemberDeleteInIn) {
    GeoAreaSvcGrpMemberDeleteIn = GeoAreaSvcGrpMemberDeleteInIn;
  }

  public void translateFromMap() {
    GeoAreaSvcGrpMemberDeleteIn = GASGMObjKeyHelper.fromMap(inputMap, "GeoAreaSvcGrpMember");
  }

/**
 *
 * Gets the GeoAreaSvcGrpMember
 * @return Value of the GeoAreaSvcGrpMember
 *
 */

  public GASGMObjKeyData getGeoAreaSvcGrpMember( ) {
    return GeoAreaSvcGrpMemberDeleteIn;
  }

}

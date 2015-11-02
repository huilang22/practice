/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaSvcGrpMemberFindBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaSvcGrpMemberFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaSvcGrpMemberFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GASGMObjFilter GeoAreaSvcGrpMemberFindIn;
/**
 *
 * Constructor to create a  GeoAreaSvcGrpMemberFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaSvcGrpMemberFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGMObjFilter GeoAreaSvcGrpMemberFindInIn) {
    super(id, context, "GeoAreaSvcGrpMemberFind");
    GeoAreaSvcGrpMemberFindIn = GeoAreaSvcGrpMemberFindInIn;
  }

  public void translateToMap() {
    if (GeoAreaSvcGrpMemberFindIn != null) {
      Integer index =  GeoAreaSvcGrpMemberFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaSvcGrpMember", GASGMObjHelper.toMap(GeoAreaSvcGrpMemberFindIn, new HashMap(), "GeoAreaSvcGrpMember").get("GeoAreaSvcGrpMember"));
    }
  }


/**
 *
 * Sets the GeoAreaSvcGrpMember
 * @param GeoAreaSvcGrpMemberFindInIn Value of the GeoAreaSvcGrpMemberFindIn
 *
 */

  public void setGeoAreaSvcGrpMember(GASGMObjFilter GeoAreaSvcGrpMemberFindInIn) {
    GeoAreaSvcGrpMemberFindIn = GeoAreaSvcGrpMemberFindInIn;
  }

  public void translateFromMap() {
    GeoAreaSvcGrpMemberFindIn = GASGMObjHelper.fromMapFilter(inputMap, "GeoAreaSvcGrpMember");
  }

/**
 *
 * Gets the GeoAreaSvcGrpMember
 * @return Value of the GeoAreaSvcGrpMember
 *
 */

  public GASGMObjFilter getGeoAreaSvcGrpMember( ) {
    return GeoAreaSvcGrpMemberFindIn;
  }

}

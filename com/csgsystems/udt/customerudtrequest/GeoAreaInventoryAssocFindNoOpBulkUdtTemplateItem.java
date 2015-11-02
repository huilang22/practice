/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaInventoryAssocFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaInventoryAssocFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaInventoryAssocFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeoAreaInventoryAssocObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GeoAreaInventoryAssocFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaInventoryAssocFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaInventoryAssocObjectDataList noOpInIn) {
    super(id, context, "GeoAreaInventoryAssocFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = GeoAreaInventoryAssocObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaInventoryAssoc", noOpIn);
      }
      addInput("GeoAreaInventoryAssoc", mapList);
    }
  }
/**
 *
 * Sets the  GeoAreaInventoryAssoc
 * @param noOpInIn GeoAreaInventoryAssocObjectDataList to set
 *
 */
  public void setGeoAreaInventoryAssoc(GeoAreaInventoryAssocObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaInventoryAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaInventoryAssocObjectDataList getGeoAreaInventoryAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GeoAreaInventoryAssocObjectHelper.fromMapList(inputMap, "GeoAreaInventoryAssocList");
  }
}

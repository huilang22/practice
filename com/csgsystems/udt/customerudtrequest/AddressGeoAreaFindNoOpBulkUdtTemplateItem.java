/*
 * Generated code DO NOT EDIT
 * Generated file: AddressGeoAreaFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AddressGeoAreaFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AddressGeoAreaFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AGAObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AddressGeoAreaFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AddressGeoAreaFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AGAObjectDataList noOpInIn) {
    super(id, context, "AddressGeoAreaFind");
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
        mapArray[i] = AGAObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AddressGeoArea", noOpIn);
      }
      addInput("AddressGeoArea", mapList);
    }
  }
/**
 *
 * Sets the  AddressGeoArea
 * @param noOpInIn AGAObjectDataList to set
 *
 */
  public void setAddressGeoArea(AGAObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AddressGeoArea passed into the constructor
 * @return Simulated response
 *
 */
  public AGAObjectDataList getAddressGeoArea() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AGAObjectHelper.fromMapList(inputMap, "AddressGeoAreaList");
  }
}

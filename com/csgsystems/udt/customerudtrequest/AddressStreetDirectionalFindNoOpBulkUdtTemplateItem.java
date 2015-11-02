/*
 * Generated code DO NOT EDIT
 * Generated file: AddressStreetDirectionalFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a AddressStreetDirectionalFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AddressStreetDirectionalFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AddressStreetDirectionalObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AddressStreetDirectionalFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AddressStreetDirectionalFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressStreetDirectionalObjectDataList noOpInIn) {
    super(id, context, "AddressStreetDirectionalFind");
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
        mapArray[i] = AddressStreetDirectionalObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AddressStreetDirectional", noOpIn);
      }
      addInput("AddressStreetDirectional", mapList);
    }
  }
/**
 *
 * Sets the  AddressStreetDirectional
 * @param noOpInIn AddressStreetDirectionalObjectDataList to set
 *
 */
  public void setAddressStreetDirectional(AddressStreetDirectionalObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AddressStreetDirectional passed into the constructor
 * @return Simulated response
 *
 */
  public AddressStreetDirectionalObjectDataList getAddressStreetDirectional() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AddressStreetDirectionalObjectHelper.fromMapList(inputMap, "AddressStreetDirectionalList");
  }
}

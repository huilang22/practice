/*
 * Generated code DO NOT EDIT
 * Generated file: AddressTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AddressTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AddressTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AddressTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AddressTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AddressTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressTypeObjectDataList noOpInIn) {
    super(id, context, "AddressTypeFind");
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
        mapArray[i] = AddressTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AddressType", noOpIn);
      }
      addInput("AddressType", mapList);
    }
  }
/**
 *
 * Sets the  AddressType
 * @param noOpInIn AddressTypeObjectDataList to set
 *
 */
  public void setAddressType(AddressTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AddressType passed into the constructor
 * @return Simulated response
 *
 */
  public AddressTypeObjectDataList getAddressType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AddressTypeObjectHelper.fromMapList(inputMap, "AddressTypeList");
  }
}

/*
 * Generated code DO NOT EDIT
 * Generated file: AddressSecondaryUnitTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AddressSecondaryUnitTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AddressSecondaryUnitTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AddressSecondaryUnitTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AddressSecondaryUnitTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AddressSecondaryUnitTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressSecondaryUnitTypeObjectDataList noOpInIn) {
    super(id, context, "AddressSecondaryUnitTypeFind");
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
        mapArray[i] = AddressSecondaryUnitTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AddressSecondaryUnitType", noOpIn);
      }
      addInput("AddressSecondaryUnitType", mapList);
    }
  }
/**
 *
 * Sets the  AddressSecondaryUnitType
 * @param noOpInIn AddressSecondaryUnitTypeObjectDataList to set
 *
 */
  public void setAddressSecondaryUnitType(AddressSecondaryUnitTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AddressSecondaryUnitType passed into the constructor
 * @return Simulated response
 *
 */
  public AddressSecondaryUnitTypeObjectDataList getAddressSecondaryUnitType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AddressSecondaryUnitTypeObjectHelper.fromMapList(inputMap, "AddressSecondaryUnitTypeList");
  }
}

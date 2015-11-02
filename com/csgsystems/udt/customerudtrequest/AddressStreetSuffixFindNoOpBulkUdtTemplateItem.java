/*
 * Generated code DO NOT EDIT
 * Generated file: AddressStreetSuffixFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AddressStreetSuffixFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AddressStreetSuffixFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AddressStreetSuffixObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AddressStreetSuffixFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AddressStreetSuffixFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressStreetSuffixObjectDataList noOpInIn) {
    super(id, context, "AddressStreetSuffixFind");
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
        mapArray[i] = AddressStreetSuffixObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AddressStreetSuffix", noOpIn);
      }
      addInput("AddressStreetSuffix", mapList);
    }
  }
/**
 *
 * Sets the  AddressStreetSuffix
 * @param noOpInIn AddressStreetSuffixObjectDataList to set
 *
 */
  public void setAddressStreetSuffix(AddressStreetSuffixObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AddressStreetSuffix passed into the constructor
 * @return Simulated response
 *
 */
  public AddressStreetSuffixObjectDataList getAddressStreetSuffix() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AddressStreetSuffixObjectHelper.fromMapList(inputMap, "AddressStreetSuffixList");
  }
}

/*
 * Generated code DO NOT EDIT
 * Generated file: AddressCategoryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AddressCategoryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AddressCategoryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AddressCategoryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AddressCategoryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AddressCategoryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressCategoryObjectDataList noOpInIn) {
    super(id, context, "AddressCategoryFind");
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
        mapArray[i] = AddressCategoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AddressCategory", noOpIn);
      }
      addInput("AddressCategory", mapList);
    }
  }
/**
 *
 * Sets the  AddressCategory
 * @param noOpInIn AddressCategoryObjectDataList to set
 *
 */
  public void setAddressCategory(AddressCategoryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AddressCategory passed into the constructor
 * @return Simulated response
 *
 */
  public AddressCategoryObjectDataList getAddressCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AddressCategoryObjectHelper.fromMapList(inputMap, "AddressCategoryList");
  }
}

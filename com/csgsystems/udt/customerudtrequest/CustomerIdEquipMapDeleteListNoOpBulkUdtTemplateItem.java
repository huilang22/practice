/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerIdEquipMapDeleteListNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a CustomerIdEquipMapDeleteListNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerIdEquipMapDeleteListNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerIdEquipMapObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CustomerIdEquipMapDeleteListNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerIdEquipMapDeleteListNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectDataList noOpInIn) {
    super(id, context, "CustomerIdEquipMapDeleteList");
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
        mapArray[i] = CustomerIdEquipMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerIdEquipMap", noOpIn);
      }
      addInput("CustomerIdEquipMap", mapList);
    }
  }
/**
 *
 * Sets the  CustomerIdEquipMap
 * @param noOpInIn CustomerIdEquipMapObjectDataList to set
 *
 */
  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerIdEquipMap passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerIdEquipMapObjectDataList getCustomerIdEquipMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerIdEquipMapObjectHelper.fromMapList(inputMap, "CustomerIdEquipMapList");
  }
}

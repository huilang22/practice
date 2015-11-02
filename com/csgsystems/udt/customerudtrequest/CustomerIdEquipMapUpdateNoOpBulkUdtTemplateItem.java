/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerIdEquipMapUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CustomerIdEquipMapUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerIdEquipMapUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerIdEquipMapObjectData noOpIn;

/**
 *
 * Constructor to create a   CustomerIdEquipMapUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerIdEquipMapUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectData noOpInIn) {
    super(id, context, "CustomerIdEquipMapUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(noOpIn, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
/**
 *
 * Sets the  CustomerIdEquipMap
 * @param noOpInIn CustomerIdEquipMapObjectData to set
 *
 */
  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerIdEquipMap passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerIdEquipMapObjectData getCustomerIdEquipMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerIdEquipMapObjectHelper.fromMap(inputMap, "CustomerIdEquipMap");
  }
}

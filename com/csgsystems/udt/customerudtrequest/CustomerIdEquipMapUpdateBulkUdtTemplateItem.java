/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerIdEquipMapUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CustomerIdEquipMapUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerIdEquipMapUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerIdEquipMapObjectData CustomerIdEquipMapUpdateIn;
/**
 *
 * Constructor to create a  CustomerIdEquipMapUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerIdEquipMapUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectData CustomerIdEquipMapUpdateInIn) {
    super(id, context, "CustomerIdEquipMapUpdate");
    CustomerIdEquipMapUpdateIn = CustomerIdEquipMapUpdateInIn;
  }

  public void translateToMap() {
    if (CustomerIdEquipMapUpdateIn != null) {
      CustomerIdEquipMapUpdateIn.resetFlags(true, true);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapUpdateIn, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }


/**
 *
 * Sets the CustomerIdEquipMap
 * @param CustomerIdEquipMapUpdateInIn Value of the CustomerIdEquipMapUpdateIn
 *
 */

  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectData CustomerIdEquipMapUpdateInIn) {
    CustomerIdEquipMapUpdateIn = CustomerIdEquipMapUpdateInIn;
  }

  public void translateFromMap() {
    CustomerIdEquipMapUpdateIn = CustomerIdEquipMapObjectHelper.fromMap(inputMap, "CustomerIdEquipMap");
  }

/**
 *
 * Gets the CustomerIdEquipMap
 * @return Value of the CustomerIdEquipMap
 *
 */

  public CustomerIdEquipMapObjectData getCustomerIdEquipMap( ) {
    return CustomerIdEquipMapUpdateIn;
  }

}

/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerIdEquipMapDefaultCreateBulkUdtTemplateItem.java
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
 * Class used to create a CustomerIdEquipMapDefaultCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerIdEquipMapDefaultCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerIdEquipMapObjectData CustomerIdEquipMapDefaultCreateIn;
/**
 *
 * Constructor to create a  CustomerIdEquipMapDefaultCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerIdEquipMapDefaultCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectData CustomerIdEquipMapDefaultCreateInIn) {
    super(id, context, "CustomerIdEquipMapDefaultCreate");
    CustomerIdEquipMapDefaultCreateIn = CustomerIdEquipMapDefaultCreateInIn;
  }

  public void translateToMap() {
    if (CustomerIdEquipMapDefaultCreateIn != null) {
      CustomerIdEquipMapDefaultCreateIn.resetFlags(true, true);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapDefaultCreateIn, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }


/**
 *
 * Sets the CustomerIdEquipMap
 * @param CustomerIdEquipMapDefaultCreateInIn Value of the CustomerIdEquipMapDefaultCreateIn
 *
 */

  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectData CustomerIdEquipMapDefaultCreateInIn) {
    CustomerIdEquipMapDefaultCreateIn = CustomerIdEquipMapDefaultCreateInIn;
  }

  public void translateFromMap() {
    CustomerIdEquipMapDefaultCreateIn = CustomerIdEquipMapObjectHelper.fromMap(inputMap, "CustomerIdEquipMap");
  }

/**
 *
 * Gets the CustomerIdEquipMap
 * @return Value of the CustomerIdEquipMap
 *
 */

  public CustomerIdEquipMapObjectData getCustomerIdEquipMap( ) {
    return CustomerIdEquipMapDefaultCreateIn;
  }

}

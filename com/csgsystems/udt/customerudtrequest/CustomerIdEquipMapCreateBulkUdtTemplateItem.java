/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerIdEquipMapCreateBulkUdtTemplateItem.java
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
 * Class used to create a CustomerIdEquipMapCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerIdEquipMapCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerIdEquipMapObjectData CustomerIdEquipMapCreateIn;
/**
 *
 * Constructor to create a  CustomerIdEquipMapCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerIdEquipMapCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectData CustomerIdEquipMapCreateInIn) {
    super(id, context, "CustomerIdEquipMapCreate");
    CustomerIdEquipMapCreateIn = CustomerIdEquipMapCreateInIn;
  }

  public void translateToMap() {
    if (CustomerIdEquipMapCreateIn != null) {
      CustomerIdEquipMapCreateIn.resetFlags(true, true);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapCreateIn, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }


/**
 *
 * Sets the CustomerIdEquipMap
 * @param CustomerIdEquipMapCreateInIn Value of the CustomerIdEquipMapCreateIn
 *
 */

  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectData CustomerIdEquipMapCreateInIn) {
    CustomerIdEquipMapCreateIn = CustomerIdEquipMapCreateInIn;
  }

  public void translateFromMap() {
    CustomerIdEquipMapCreateIn = CustomerIdEquipMapObjectHelper.fromMap(inputMap, "CustomerIdEquipMap");
  }

/**
 *
 * Gets the CustomerIdEquipMap
 * @return Value of the CustomerIdEquipMap
 *
 */

  public CustomerIdEquipMapObjectData getCustomerIdEquipMap( ) {
    return CustomerIdEquipMapCreateIn;
  }

}

/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerIdEquipMapDisconnectValidateBulkUdtTemplateItem.java
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
 * Class used to create a CustomerIdEquipMapDisconnectValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerIdEquipMapDisconnectValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerIdEquipMapObjectData CustomerIdEquipMapDiscValidateIn;
/**
 *
 * Constructor to create a  CustomerIdEquipMapDisconnectValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerIdEquipMapDisconnectValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectData CustomerIdEquipMapDiscValidateInIn) {
    super(id, context, "CustomerIdEquipMapDisconnectValidate");
    CustomerIdEquipMapDiscValidateIn = CustomerIdEquipMapDiscValidateInIn;
  }

  public void translateToMap() {
    if (CustomerIdEquipMapDiscValidateIn != null) {
      CustomerIdEquipMapDiscValidateIn.resetFlags(true, true);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapDiscValidateIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the CustomerIdEquipMap
 * @param CustomerIdEquipMapDiscValidateInIn Value of the CustomerIdEquipMapDiscValidateIn
 *
 */

  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectData CustomerIdEquipMapDiscValidateInIn) {
    CustomerIdEquipMapDiscValidateIn = CustomerIdEquipMapDiscValidateInIn;
  }

  public void translateFromMap() {
    CustomerIdEquipMapDiscValidateIn = CustomerIdEquipMapObjectHelper.fromMap(inputMap, "CustomerIdEquipMap");
  }

/**
 *
 * Gets the CustomerIdEquipMap
 * @return Value of the CustomerIdEquipMap
 *
 */

  public CustomerIdEquipMapObjectData getCustomerIdEquipMap( ) {
    return CustomerIdEquipMapDiscValidateIn;
  }

}

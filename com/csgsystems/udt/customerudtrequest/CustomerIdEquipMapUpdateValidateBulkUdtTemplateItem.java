/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerIdEquipMapUpdateValidateBulkUdtTemplateItem.java
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
 * Class used to create a CustomerIdEquipMapUpdateValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerIdEquipMapUpdateValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerIdEquipMapObjectData CustomerIdEquipMapUpdateValidateIn;
/**
 *
 * Constructor to create a  CustomerIdEquipMapUpdateValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerIdEquipMapUpdateValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectData CustomerIdEquipMapUpdateValidateInIn) {
    super(id, context, "CustomerIdEquipMapUpdateValidate");
    CustomerIdEquipMapUpdateValidateIn = CustomerIdEquipMapUpdateValidateInIn;
  }

  public void translateToMap() {
    if (CustomerIdEquipMapUpdateValidateIn != null) {
      CustomerIdEquipMapUpdateValidateIn.resetFlags(true, true);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapUpdateValidateIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the CustomerIdEquipMap
 * @param CustomerIdEquipMapUpdateValidateInIn Value of the CustomerIdEquipMapUpdateValidateIn
 *
 */

  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectData CustomerIdEquipMapUpdateValidateInIn) {
    CustomerIdEquipMapUpdateValidateIn = CustomerIdEquipMapUpdateValidateInIn;
  }

  public void translateFromMap() {
    CustomerIdEquipMapUpdateValidateIn = CustomerIdEquipMapObjectHelper.fromMap(inputMap, "CustomerIdEquipMap");
  }

/**
 *
 * Gets the CustomerIdEquipMap
 * @return Value of the CustomerIdEquipMap
 *
 */

  public CustomerIdEquipMapObjectData getCustomerIdEquipMap( ) {
    return CustomerIdEquipMapUpdateValidateIn;
  }

}

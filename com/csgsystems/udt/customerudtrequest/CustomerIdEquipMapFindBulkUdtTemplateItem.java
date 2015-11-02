/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerIdEquipMapFindBulkUdtTemplateItem.java
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
 * Class used to create a CustomerIdEquipMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerIdEquipMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerIdEquipMapObjectFilter CustomerIdEquipMapFindIn;
/**
 *
 * Constructor to create a  CustomerIdEquipMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerIdEquipMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectFilter CustomerIdEquipMapFindInIn) {
    super(id, context, "CustomerIdEquipMapFind");
    CustomerIdEquipMapFindIn = CustomerIdEquipMapFindInIn;
  }

  public void translateToMap() {
    if (CustomerIdEquipMapFindIn != null) {
      Integer index =  CustomerIdEquipMapFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapFindIn, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }


/**
 *
 * Sets the CustomerIdEquipMap
 * @param CustomerIdEquipMapFindInIn Value of the CustomerIdEquipMapFindIn
 *
 */

  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectFilter CustomerIdEquipMapFindInIn) {
    CustomerIdEquipMapFindIn = CustomerIdEquipMapFindInIn;
  }

  public void translateFromMap() {
    CustomerIdEquipMapFindIn = CustomerIdEquipMapObjectHelper.fromMapFilter(inputMap, "CustomerIdEquipMap");
  }

/**
 *
 * Gets the CustomerIdEquipMap
 * @return Value of the CustomerIdEquipMap
 *
 */

  public CustomerIdEquipMapObjectFilter getCustomerIdEquipMap( ) {
    return CustomerIdEquipMapFindIn;
  }

}

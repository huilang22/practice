/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a CustomerIdEquipMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerIdEquipMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerIdEquipMapObjectKeyData CustomerIdEquipMapGetIn;
/**
 *
 * Constructor to create a  CustomerIdEquipMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerIdEquipMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectKeyData CustomerIdEquipMapGetInIn) {
    super(id, context, "CustomerIdEquipMapGet");
    CustomerIdEquipMapGetIn = CustomerIdEquipMapGetInIn;
  }

  public void translateToMap() {
    if (CustomerIdEquipMapGetIn != null) {
      CustomerIdEquipMapGetIn.resetFlags(true, true);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectKeyHelper.toMap(CustomerIdEquipMapGetIn, new HashMap(), "CustomerIdEquipMapObjectKeyData").get("CustomerIdEquipMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the CustomerIdEquipMap
 * @param CustomerIdEquipMapGetInIn Value of the CustomerIdEquipMapGetIn
 *
 */

  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectKeyData CustomerIdEquipMapGetInIn) {
    CustomerIdEquipMapGetIn = CustomerIdEquipMapGetInIn;
  }

  public void translateFromMap() {
    CustomerIdEquipMapGetIn = CustomerIdEquipMapObjectKeyHelper.fromMap(inputMap, "CustomerIdEquipMap");
  }

/**
 *
 * Gets the CustomerIdEquipMap
 * @return Value of the CustomerIdEquipMap
 *
 */

  public CustomerIdEquipMapObjectKeyData getCustomerIdEquipMap( ) {
    return CustomerIdEquipMapGetIn;
  }

}

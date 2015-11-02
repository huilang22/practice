/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapIsUniqueBulkUdtTemplateItem.java
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
 * Class used to create a CustomerIdEquipMapIsUniqueBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerIdEquipMapIsUniqueBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerIdEquipMapObjectData CustomerIdEquipMapUnqIn;
/**
 *
 * Constructor to create a  CustomerIdEquipMapIsUniqueBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerIdEquipMapIsUniqueBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectData CustomerIdEquipMapUnqInIn) {
    super(id, context, "CustomerIdEquipMapIsUnique");
    CustomerIdEquipMapUnqIn = CustomerIdEquipMapUnqInIn;
  }

  public void translateToMap() {
    if (CustomerIdEquipMapUnqIn != null) {
      CustomerIdEquipMapUnqIn.resetFlags(true, true);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapUnqIn, new HashMap(), "IsUnique").get("IsUnique"));
    }
  }


/**
 *
 * Sets the CustomerIdEquipMap
 * @param CustomerIdEquipMapUnqInIn Value of the CustomerIdEquipMapUnqIn
 *
 */

  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectData CustomerIdEquipMapUnqInIn) {
    CustomerIdEquipMapUnqIn = CustomerIdEquipMapUnqInIn;
  }

  public void translateFromMap() {
    CustomerIdEquipMapUnqIn = CustomerIdEquipMapObjectHelper.fromMap(inputMap, "CustomerIdEquipMap");
  }

/**
 *
 * Gets the CustomerIdEquipMap
 * @return Value of the CustomerIdEquipMap
 *
 */

  public CustomerIdEquipMapObjectData getCustomerIdEquipMap( ) {
    return CustomerIdEquipMapUnqIn;
  }

}

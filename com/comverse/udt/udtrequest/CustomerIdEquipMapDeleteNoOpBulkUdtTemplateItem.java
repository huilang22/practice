/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CustomerIdEquipMapDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerIdEquipMapDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerIdEquipMapObjectData noOpIn;

/**
 *
 * Constructor to create a   CustomerIdEquipMapDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerIdEquipMapDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectData noOpInIn) {
    super(id, context, "CustomerIdEquipMapDelete");
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

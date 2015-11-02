/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a CustomerIdEquipMapDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerIdEquipMapDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerIdEquipMapObjectFilter CustomerIdEquipMapDeleteListIn;
  protected Date InactiveDate;
/**
 *
 * Constructor to create a  CustomerIdEquipMapDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerIdEquipMapDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectFilter CustomerIdEquipMapDeleteListInIn, Date InactiveDateIn) {
    super(id, context, "CustomerIdEquipMapDeleteList");
    CustomerIdEquipMapDeleteListIn = CustomerIdEquipMapDeleteListInIn;
    InactiveDate = InactiveDateIn;
  }

  public void translateToMap() {
    if (CustomerIdEquipMapDeleteListIn != null) {
      Integer index =  CustomerIdEquipMapDeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapDeleteListIn, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
    if (InactiveDate != null) {
      addInput("InactiveDate", InactiveDate);
    }
  }


/**
 *
 * Sets the CustomerIdEquipMap
 * @param CustomerIdEquipMapDeleteListInIn Value of the CustomerIdEquipMapDeleteListIn
 *
 */

  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectFilter CustomerIdEquipMapDeleteListInIn) {
    CustomerIdEquipMapDeleteListIn = CustomerIdEquipMapDeleteListInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param InactiveDateIn Value of the InactiveDate
 *
 */

  public void setInactiveDate(Date InactiveDateIn) {
    InactiveDate = InactiveDateIn;
  }

  public void translateFromMap() {
    CustomerIdEquipMapDeleteListIn = CustomerIdEquipMapObjectHelper.fromMapFilter(inputMap, "CustomerIdEquipMap");
    InactiveDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the CustomerIdEquipMap
 * @return Value of the CustomerIdEquipMap
 *
 */

  public CustomerIdEquipMapObjectFilter getCustomerIdEquipMap( ) {
    return CustomerIdEquipMapDeleteListIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return InactiveDate;
  }

}

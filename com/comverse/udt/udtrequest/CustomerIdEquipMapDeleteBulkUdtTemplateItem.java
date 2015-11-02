/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CustomerIdEquipMapDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerIdEquipMapDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerIdEquipMapObjectKeyData CustomerIdEquipMapDeleteIn;
  protected Date CIEMDCeaseDate;
/**
 *
 * Constructor to create a  CustomerIdEquipMapDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerIdEquipMapDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectKeyData CustomerIdEquipMapDeleteInIn, Date CIEMDCeaseDateIn) {
    super(id, context, "CustomerIdEquipMapDelete");
    CustomerIdEquipMapDeleteIn = CustomerIdEquipMapDeleteInIn;
    CIEMDCeaseDate = CIEMDCeaseDateIn;
  }

  public void translateToMap() {
    if (CustomerIdEquipMapDeleteIn != null) {
      CustomerIdEquipMapDeleteIn.resetFlags(true, true);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectKeyHelper.toMap(CustomerIdEquipMapDeleteIn, new HashMap(), "CustomerIdEquipMapObjectKeyData").get("CustomerIdEquipMapObjectKeyData"));
    }
    if (CIEMDCeaseDate != null) {
      addInput("InactiveDate", CIEMDCeaseDate);
    }
  }


/**
 *
 * Sets the CustomerIdEquipMap
 * @param CustomerIdEquipMapDeleteInIn Value of the CustomerIdEquipMapDeleteIn
 *
 */

  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectKeyData CustomerIdEquipMapDeleteInIn) {
    CustomerIdEquipMapDeleteIn = CustomerIdEquipMapDeleteInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param CIEMDCeaseDateIn Value of the CIEMDCeaseDate
 *
 */

  public void setInactiveDate(Date CIEMDCeaseDateIn) {
    CIEMDCeaseDate = CIEMDCeaseDateIn;
  }

  public void translateFromMap() {
    CustomerIdEquipMapDeleteIn = CustomerIdEquipMapObjectKeyHelper.fromMap(inputMap, "CustomerIdEquipMap");
    CIEMDCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the CustomerIdEquipMap
 * @return Value of the CustomerIdEquipMap
 *
 */

  public CustomerIdEquipMapObjectKeyData getCustomerIdEquipMap( ) {
    return CustomerIdEquipMapDeleteIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return CIEMDCeaseDate;
  }

}

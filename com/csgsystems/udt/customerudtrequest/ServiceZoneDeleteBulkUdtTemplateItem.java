/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceZoneDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ServiceZoneDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceZoneDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceZoneObjectKeyData SZDeleteIn;
  protected Date SZDCeaseDate;
/**
 *
 * Constructor to create a  ServiceZoneDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceZoneDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceZoneObjectKeyData SZDeleteInIn, Date SZDCeaseDateIn) {
    super(id, context, "ServiceZoneDelete");
    SZDeleteIn = SZDeleteInIn;
    SZDCeaseDate = SZDCeaseDateIn;
  }

  public void translateToMap() {
    if (SZDeleteIn != null) {
      SZDeleteIn.resetFlags(true, true);
      addInput("ServiceZone", ServiceZoneObjectKeyHelper.toMap(SZDeleteIn, new HashMap(), "ServiceZoneObjectKeyData").get("ServiceZoneObjectKeyData"));
    }
    if (SZDCeaseDate != null) {
      addInput("InactiveDate", SZDCeaseDate);
    }
  }


/**
 *
 * Sets the ServiceZone
 * @param SZDeleteInIn Value of the SZDeleteIn
 *
 */

  public void setServiceZone(ServiceZoneObjectKeyData SZDeleteInIn) {
    SZDeleteIn = SZDeleteInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param SZDCeaseDateIn Value of the SZDCeaseDate
 *
 */

  public void setInactiveDate(Date SZDCeaseDateIn) {
    SZDCeaseDate = SZDCeaseDateIn;
  }

  public void translateFromMap() {
    SZDeleteIn = ServiceZoneObjectKeyHelper.fromMap(inputMap, "ServiceZone");
    SZDCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the ServiceZone
 * @return Value of the ServiceZone
 *
 */

  public ServiceZoneObjectKeyData getServiceZone( ) {
    return SZDeleteIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return SZDCeaseDate;
  }

}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceZoneDeleteListBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ServiceZoneDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceZoneDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceZoneObjectFilter ServiceZoneFilter;
  protected Date SZDLCeaseDate;
/**
 *
 * Constructor to create a  ServiceZoneDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceZoneDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceZoneObjectFilter ServiceZoneFilterIn, Date SZDLCeaseDateIn) {
    super(id, context, "ServiceZoneDeleteList");
    ServiceZoneFilter = ServiceZoneFilterIn;
    SZDLCeaseDate = SZDLCeaseDateIn;
  }

  public void translateToMap() {
    if (ServiceZoneFilter != null) {
      Integer index =  ServiceZoneFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceZoneFilter", ServiceZoneObjectHelper.toMap(ServiceZoneFilter, new HashMap(), "Void").get("Void"));
    }
    if (SZDLCeaseDate != null) {
      addInput("InactiveDate", SZDLCeaseDate);
    }
  }


/**
 *
 * Sets the ServiceZoneFilter
 * @param ServiceZoneFilterIn Value of the ServiceZoneFilter
 *
 */

  public void setServiceZoneFilter(ServiceZoneObjectFilter ServiceZoneFilterIn) {
    ServiceZoneFilter = ServiceZoneFilterIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param SZDLCeaseDateIn Value of the SZDLCeaseDate
 *
 */

  public void setInactiveDate(Date SZDLCeaseDateIn) {
    SZDLCeaseDate = SZDLCeaseDateIn;
  }

  public void translateFromMap() {
    ServiceZoneFilter = ServiceZoneObjectHelper.fromMapFilter(inputMap, "ServiceZoneFilter");
    SZDLCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the ServiceZoneFilter
 * @return Value of the ServiceZoneFilter
 *
 */

  public ServiceZoneObjectFilter getServiceZoneFilter( ) {
    return ServiceZoneFilter;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return SZDLCeaseDate;
  }

}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressServiceabilityValidateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceAddressServiceabilityValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAddressServiceabilityValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectBaseData[] service;
  protected Integer address_id;
/**
 *
 * Constructor to create a  ServiceAddressServiceabilityValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAddressServiceabilityValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectBaseData[] serviceIn, Integer address_idIn) {
    super(id, context, "ServiceAddressServiceabilityValidate");
    service = serviceIn;
    address_id = address_idIn;
  }

  public void translateToMap() {
    if (service != null) {
      if (service != null) {
        Object[] list = new Object[service.length];
        for (int i = 0; i < service.length; i++) {
          list[i] = ServiceObjectBaseHelper.getMap(service[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "SvcAddrServiceability");
        }
        addInput("ServiceList", list);
      }
    }
    if (address_id != null) {
      addInput("AddressId", address_id);
    }
  }


/**
 *
 * Sets the Service
 * @param serviceIn Value of the service
 *
 */

  public void setService(ServiceObjectBaseData[] serviceIn) {
    service = serviceIn;
  }

/**
 *
 * Sets the AddressId
 * @param address_idIn Value of the address_id
 *
 */

  public void setAddressId(Integer address_idIn) {
    address_id = address_idIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("ServiceList");
    if (list != null) {
      service = new ServiceObjectBaseData[list.length];
      for (int i = 0; i < list.length; i++) {
        service[i] = ServiceObjectBaseHelper.getObj((Map) list[i]);
        service[i].resetFlags(true, true);
      }
    }
    address_id = (Integer)inputMap.get("AddressId");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectBaseData[] getService( ) {
    return service;
  }

/**
 *
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public Integer getAddressId( ) {
    return address_id;
  }

}

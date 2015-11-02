/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressInventoryServiceabilityValidateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a ServiceAddressInventoryServiceabilityValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAddressInventoryServiceabilityValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceKeyOnlyObjData[] service;
  protected BigInteger address_id;
/**
 *
 * Constructor to create a  ServiceAddressInventoryServiceabilityValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAddressInventoryServiceabilityValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceKeyOnlyObjData[] serviceIn, BigInteger address_idIn) {
    super(id, context, "ServiceAddressInventoryServiceabilityValidate");
    service = serviceIn;
    address_id = address_idIn;
  }

  public void translateToMap() {
    if (service != null) {
      if (service != null) {
        Object[] list = new Object[service.length];
        for (int i = 0; i < service.length; i++) {
          list[i] = ServiceKeyOnlyObjHelper.getMap(service[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvElement");
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

  public void setService(ServiceKeyOnlyObjData[] serviceIn) {
    service = serviceIn;
  }

/**
 *
 * Sets the AddressId
 * @param address_idIn Value of the address_id
 *
 */

  public void setAddressId(BigInteger address_idIn) {
    address_id = address_idIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("ServiceList");
    if (list != null) {
      service = new ServiceKeyOnlyObjData[list.length];
      for (int i = 0; i < list.length; i++) {
        service[i] = ServiceKeyOnlyObjHelper.getObj((Map) list[i]);
        service[i].resetFlags(true, true);
      }
    }
    address_id = (BigInteger)inputMap.get("AddressId");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceKeyOnlyObjData[] getService( ) {
    return service;
  }

/**
 *
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public BigInteger getAddressId( ) {
    return address_id;
  }

}
